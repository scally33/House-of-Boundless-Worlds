import java.util.Scanner;
public class bugBattles {
    public static bug [][] gameBoard = new bug[2][5];
    int playerHP = 3000;
    int playerNectar = 500;
    int botHP = 3000;
    int botNectar = 500;
    public void main(String [] args){

        
    }
// make a thing that lets you select a bug, and diaplays ChangeBattlePOS, 
// Attack, and ActivateEffect

}

abstract class bug {
    String name;
    int atk;
    int stam;
    int baseAtkCount = 1;
    int atkCount = baseAtkCount;
    int nectGen;
    int cost;
    String battleText = "";
    boolean isPlayerSide;
    int position;
    boolean isAlive = true;
    public abstract void activateEffect();
    public void declareAttack(int targetSide, int targetSpot){
        //ensure that targetSide and targetSpot are both valid before calling this
        int targetATK = bugBattles.gameBoard[targetSide][targetSpot].getATK();
        if (isPlayerSide && bugBattles.gameBoard[0][this.position] != null){
            if (atkCompare(targetATK) < 0){
                this.stam -= 1 + (int)(atkCompare(targetATK)/200);
            } else if (atkCompare(targetATK) == 0){
                this.stam -= 1;
                bugBattles.gameBoard[0][this.position].stam -= 1;
            } else {
                bugBattles.gameBoard[targetSide][targetSpot].stam -= 
                            1 + (int)(atkCompare(targetATK)/200);
            }
        }
        if (bugBattles.gameBoard[targetSide][targetSpot].stam < 0){
            bugBattles.gameBoard[targetSide][targetSpot].defeat();
        }
        if (this.stam < 0){
            System.out.println(this.name + " was defeated!");
            this.defeat();
        }
    }//declare attack

    public void defeat(){
        if (this.isPlayerSide){
            System.out.println(bugBattles.gameBoard[1][this.position].name + 
                                " was defeated!");
            bugBattles.gameBoard[1][this.position] = null;
        } else {
            System.out.println(bugBattles.gameBoard[0][this.position].name + 
                                " was defeated!");
            bugBattles.gameBoard[0][this.position] = null;
        }
    }
    public void resetAttackCount(){
        this.atkCount = baseAtkCount;
    }
    public int atkCompare(int targetATK){
        return this.atk - targetATK;
    }
    public String getName(){
        return this.name;
    }
    public int getATK(){
        return this.atk;
    }
    public void modATK(int mod){
        this.atk += mod;
    }
    public int getPOS(){
        return this.position;
    }
    public void setPOS(boolean isForPlayer, int boardSlot){
        if (isForPlayer){
            this.position = boardSlot;
        } else {
            isPlayerSide = false;
            this.position = boardSlot;
        }
        updatePosition(isPlayerSide, boardSlot);
    }
    public int getNectGen(){
        return nectGen;
    }
    public void updatePosition(boolean isForPlayer, int boardSlot){
        if (isForPlayer){
            bugBattles.gameBoard[1][boardSlot] = this;
        } else {
            bugBattles.gameBoard[0][boardSlot] = this;
        }
    }
}

class ant extends bug {
    public ant(boolean side, int pos){
        this.name = "Ant";
        this.atk = 200;
        this.stam = 1;
        this.nectGen = 50;
        this.cost = 100;
        //@Override
        this.battleText = "This combine with other ants. Add their ATK and nectGen to this one.";
        this.isPlayerSide = side;
        this.position = pos;
    }//constructor
    
    @Override
    public void activateEffect(){
        if (isPlayerSide){
            for (int i = 0; i<bugBattles.gameBoard[1].length; i++){
                if (i != this.position && bugBattles.gameBoard[1][i].getName() == "ant"){
                    System.out.println("Would you like to combine ant in slot " +
                    (i+1) + "? (Y/N)");
                    Scanner console = new Scanner(System.in);
                    String response = console.next();
                    if (response.substring(0, 1).toLowerCase().equals("y")){
                        this.nectGen += bugBattles.gameBoard[1][i].getNectGen();
                        modATK(bugBattles.gameBoard[1][i].getATK());
                        bugBattles.gameBoard[1][i] = null;
                    }
                    console.close();
                }
            }
        } else {
            for (int i = 0; i<bugBattles.gameBoard[1].length; i++){
                if (i != this.position && bugBattles.gameBoard[1][i].getName() == "ant"){
                    this.nectGen += bugBattles.gameBoard[0][i].getNectGen();
                    modATK(bugBattles.gameBoard[0][i].getATK());
                }
            }
        }
    }//activate effect
}//ant class

class bee extends bug {
    public bee(boolean side, int pos){
        this.name = "Bee";
        this.atk = 0;
        this.stam = 2;
        this.nectGen = 300;
        this.cost = 200;
        this.isPlayerSide = side;
        this.position = pos;
    }//constructor
    public void activateEffect(){
        System.out.println("No effect");
    }
}//bee class