import java.util.*;
public class tcg_DamageCounter{
    String [] team1Name = new String [6];
    String [] team2Name = new String [6];
    
    int [][] team1 = new int[6][6];
    int [][] team2 = new int[6][6];
    int turn = 1;
    String phase = "Color";
    public void main(String [] args){
        Scanner console = new Scanner(System.in);
        
        textBased_DDR.fasterTypeWriter("Good luck to the both of you!"); 
        System.out.println();
        //textBased_DDR.fasterTypeWriter("For transformations, type 'transform'. You will then be prompted which duck out is being transformed of the order you provide.");
        
        textBased_DDR.fasterTypeWriter("Player 1, input your team's names, one by one (type -> enter -> type; no parenthesis)");
        
        boolean duckFound = true;
        int duckTotal = 0;
        do{
            for (int i = 0; i<team1Name.length; i++){
                team1Name[i] = console.nextLine();
                team1Name[i] = team1Name[i].toLowerCase();
                duckFound = true;
                if (team1Name[i].equals("arthur")){
                    team1[0][i] = arthur();//actual HP
                    team1[1][i] = arthur();//max HP
                } else if (team1Name[i].equals("arthur miner")){
                    team1[0][i] = arthurMiner();
                    team1[1][i] = arthurMiner();
                } else if (team1Name[i].equals("arthur figure skater")){
                    team1[0][i] = arthurSkater();
                    team1[1][i] = arthurSkater();
                } else if (team1Name[i].equals("arthur florist")){
                    team1[0][i] = arthurFlorist();
                    team1[1][i] = arthurFlorist();
                } else if (team1Name[i].equals("arthur super suit")){
                    team1[0][i] = arthurSuper();
                    team1[1][i] = arthurSuper();
                } else if (team1Name[i].equals("arthur solar knight")){
                    team1[0][i] = arthurKnight();
                    team1[1][i] = arthurKnight();
                } else if (team1Name[i].equals("arthur assault cloak")){
                    team1[0][i] = arthurCloak();
                    team1[1][i] = arthurCloak();
                } else if (team1Name[i].equals("arthur crowned")){
                    team1[0][i] = arthurCrowned();
                    team1[1][i] = arthurCrowned();
                } else if (team1Name[i].equals("cooler and lil water pal") || team1Name[i].equals("cooler and lil' water pal")){
                    team1[0][i] = coolerPal();
                    team1[1][i] = coolerPal();
                } else if (team1Name[i].equals("pretzel ninja")){
                    team1[0][i] = pNinja();
                    team1[1][i] = pNinja();
                } else if (team1Name[i].equals("gambler")){
                    team1[0][i] = gambler();
                    team1[1][i] = gambler();
                } else if (team1Name[i].equals("lantern ghost")){
                    team1[0][i] = lGhost();
                    team1[1][i] = lGhost();
                } else if (team1Name[i].equals("firecracker")){
                    team1[0][i] = firecracker();
                    team1[1][i] = firecracker();
                } else if (team1Name[i].equals("assault")){
                    team1[0][i] = assault();
                    team1[1][i] = assault();
                } else if (team1Name[i].equals("ms.fancyskirtbosswoman")){
                    team1[0][i] = fancySkirt();// current hp
                    team1[1][i] = fancySkirt();//max hp
                    //do transformation method later
                } else if (team1Name[i].equals("mr.fancypantsbossman")){
                    team1[0][i] = fancyPants();
                    team1[1][i] = fancyPants();
                    //do transformation method later
                } else if (team1Name[i].equals("dapper")){
                    team1[0][i] = dapper();
                    team1[1][i] = dapper();
                } else if (team1Name[i].equals("marshmallow monarch")){
                    team1[0][i] = mMonarch();
                    team1[1][i] = mMonarch();
                } else if (team1Name[i].equals("armed swordsman")){
                    team1[0][i] = armed();
                    team1[1][i] = armed();
                } else if (team1Name[i].equals("stanced swordsman")){
                    team1[0][i] = stanced();
                    team1[1][i] = stanced();
                } else if (team1Name[i].equals("wind emperor fuu")){
                    team1[0][i] = fuu();
                    team1[1][i] = fuu();
                } else if (team1Name[i].equals("grim reaper")){
                    team1[0][i] = grimReaper();
                    team1[1][i] = grimReaper();
                } else if (team1Name[i].equals("coffee mug")){
                    team1[0][i] = cMug();
                    team1[1][i] = cMug();
                } else if (team1Name[i].equals("bubble tea")){
                    team1[0][i] = bubbleTea();
                    team1[1][i] = bubbleTea();
                } else if (team1Name[i].equals("dreamer swordsman")){
                    team1[0][i] = dreamerSwordsman();
                    team1[1][i] = dreamerSwordsman();
                } else if (team1Name[i].equals("wallet")){
                    team1[0][i] = wallet();
                    team1[1][i] = wallet();
                } else if (team1Name[i].equals("gunslinger")){
                    team1[0][i] = gunslinger();
                    team1[1][i] = gunslinger();
                } else if (team1Name[i].equals("office")){
                    team1[0][i] = office();
                    team1[1][i] = office();
                } else if (team1Name[i].equals("soccer beast")){
                    team1[0][i] = soccerBeast();
                    team1[1][i] = soccerBeast();
                } else if (team1Name[i].equals("chalkboard teacher")){
                    team1[0][i] = cTeacher();
                    team1[1][i] = cTeacher();
                } else if (team1Name[i].equals("traffic keeper")){
                    team1[0][i] = trafficKeeper();
                    team1[1][i] = trafficKeeper();
                } else if (team1Name[i].equals("blanket")){
                    team1[0][i] = blanket();
                    team1[1][i] = blanket();
                } else if (team1Name[i].equals("violinist")){
                    team1[0][i] = violinist();
                    team1[1][i] = violinist();
                } else if (team1Name[i].equals("teleporter")){
                    team1[0][i] = teleporter();
                    team1[1][i] = teleporter();
                } else if (team1Name[i].equals("snowglobe")){
                    team1[0][i] = snowglobe();
                    team1[1][i] = snowglobe();
                } else if (team1Name[i].equals("soccer prodigy")){
                    team1[0][i] = soccerProdigy();
                    team1[1][i] = soccerProdigy();
                } else if (team1Name[i].equals("origami")){
                    team1[0][i] = origami();
                    team1[1][i] = origami();
                } else if (team1Name[i].equals("toaster triplets")){
                    team1[0][i] = triplets();
                    team1[1][i] = triplets();
                } else {
                    duckFound = false;
                    System.out.println("Duck not found. Try again.");
                    i = duckTotal-1;
                }//if statements
                if (duckFound == true){
                    duckTotal++;
                }//increment if the duck input is valid
            }//for loop (UNNECESSARY AS FLIP for loop bruh...)
        } while (!duckFound && duckTotal <= 6);//player 1
        
        
        System.out.println("Player 2, input your team's names one by one as well.");
        duckTotal = 0;
        do{
            for (int i = 0; i<team1Name.length; i++){
                team2Name[i] = console.nextLine();
                team2Name[i] = team2Name[i].toLowerCase();
                duckFound = true;
                if (team2Name[i].equals("arthur")){
                    team2[0][i] = arthur();//current hp
                    team2[1][i] = arthur();//max hp
                } else if (team2Name[i].equals("arthur miner")){
                    team2[0][i] = arthurMiner();
                    team2[1][i] = arthurMiner();
                } else if (team2Name[i].equals("arthur figure skater")){
                    team2[0][i] = arthurSkater();
                    team2[1][i] = arthurSkater();
                } else if (team2Name[i].equals("arthur florist")){
                    team2[0][i] = arthurFlorist();
                    team2[1][i] = arthurFlorist();
                } else if (team2Name[i].equals("arthur super suit")){
                    team2[0][i] = arthurSuper();
                    team2[1][i] = arthurSuper();
                } else if (team2Name[i].equals("arthur solar knight")){
                    team2[0][i] = arthurKnight();
                    team2[1][i] = arthurKnight();
                } else if (team2Name[i].equals("arthur assault cloak")){
                    team2[0][i] = arthurCloak();
                    team2[1][i] = arthurCloak();
                } else if (team2Name[i].equals("arthur crowned")){
                    team2[0][i] = arthurCrowned();
                    team2[1][i] = arthurCrowned();
                } else if (team2Name[i].equals("cooler and lil water pal") || team2Name[i].equals("cooler and lil' water pal")){
                    team2[0][i] = coolerPal();
                    team2[1][i] = coolerPal();
                } else if (team2Name[i].equals("pretzel ninja")){
                    team2[0][i] = pNinja();
                    team2[1][i] = pNinja();
                } else if (team2Name[i].equals("gambler")){
                    team2[0][i] = gambler();
                    team2[1][i] = gambler();
                } else if (team2Name[i].equals("lantern ghost")){
                    team2[0][i] = lGhost();
                    team2[1][i] = lGhost();
                } else if (team2Name[i].equals("firecracker")){
                    team2[0][i] = firecracker();
                    team2[1][i] = firecracker();
                } else if (team2Name[i].equals("assault")){
                    team2[0][i] = assault();
                    team2[1][i] = assault();
                } else if (team2Name[i].equals("ms.fancyskirtbosswoman")){
                    team2[0][i] = fancySkirt();
                    team2[1][i] = fancySkirt();
                    //do transformation method later
                    //Complete 3/17/2026
                } else if (team2Name[i].equals("mr.fancypantsbossman")){
                    team2[0][i] = fancyPants();
                    team2[1][i] = fancyPants();
                    //do transformation method later
                    //Complete 3/17/2026
                    
                } else if (team2Name[i].equals("dapper")){
                    team2[0][i] = dapper();
                    team2[1][i] = dapper();
                } else if (team2Name[i].equals("marshmallow monarch")){
                    team2[0][i] = mMonarch();
                    team2[1][i] = mMonarch();
                } else if (team2Name[i].equals("armed swordsman")){
                    team2[0][i] = armed();
                    team2[1][i] = armed();
                } else if (team2Name[i].equals("stanced swordsman")){
                    team2[0][i] = stanced();
                    team2[1][i] = stanced();
                } else if (team2Name[i].equals("wind emperor fuu")){
                    team2[0][i] = fuu();
                    team2[1][i] = fuu();
                } else if (team2Name[i].equals("grim reaper")){
                    team2[0][i] = grimReaper();
                    team2[1][i] = grimReaper();
                } else if (team2Name[i].equals("coffee mug")){
                    team2[0][i] = cMug();
                    team2[1][i] = cMug();
                } else if (team2Name[i].equals("bubble tea")){
                    team2[0][i] = bubbleTea();
                    team2[1][i] = bubbleTea();
                } else if (team2Name[i].equals("dreamer swordsman")){
                    team2[0][i] = dreamerSwordsman();
                    team2[1][i] = dreamerSwordsman();
                } else if (team2Name[i].equals("wallet")){
                    team2[0][i] = wallet();
                    team2[1][i] = wallet();
                } else if (team2Name[i].equals("gunslinger")){
                    team2[0][i] = gunslinger();
                    team2[1][i] = gunslinger();
                } else if (team2Name[i].equals("office")){
                    team2[0][i] = office();
                    team2[1][i] = office();
                } else if (team2Name[i].equals("soccer beast")){
                    team2[0][i] = soccerBeast();
                    team2[1][i] = soccerBeast();
                } else if (team2Name[i].equals("chalkboard teacher")){
                    team2[0][i] = cTeacher();
                    team2[1][i] = cTeacher();
                } else if (team2Name[i].equals("traffic keeper")){
                    team2[0][i] = trafficKeeper();
                    team2[1][i] = trafficKeeper();
                } else if (team2Name[i].equals("blanket")){
                    team2[0][i] = blanket();
                    team2[1][i] = blanket();
                } else if (team2Name[i].equals("violinist")){
                    team2[0][i] = violinist();
                    team2[1][i] = violinist();
                } else if (team2Name[i].equals("teleporter")){
                    team2[0][i] = teleporter();
                    team2[1][i] = teleporter();
                } else if (team2Name[i].equals("snowglobe")){
                    team2[0][i] = snowglobe();
                    team2[1][i] = snowglobe();
                } else if (team2Name[i].equals("soccer prodigy")){
                    team2[0][i] = soccerProdigy();
                    team2[1][i] = soccerProdigy();
                } else if (team2Name[i].equals("origami")){
                    team2[0][i] = origami();
                    team2[1][i] = origami();
                } else if (team2Name[i].equals("toaster triplets")){
                    team2[0][i] = triplets();
                    team2[1][i] = triplets();
                } else {
                    duckFound = false;
                    System.out.println("Duck not found. Try again.");
                    i = duckTotal-1;
                }//if statements
                if (duckFound == true){
                    duckTotal++;
                }//increment if the duck input is valid
            }//for loop (ABSOLUTELY UNNECESSARY FOR LOOP BTW (if it aint broke dont fix it)
        } while (!duckFound && duckTotal <= 6);//player 2
        
        int damageAmount = 0;
        int damageReceiver = 0;
        
        printBoard();
        do{
            do {
                textBased_DDR.fastestTypeWriter("Who is taking damage/healing? (p1 is 1-6, top to bottom; p2 is 7-12, top to bottom)\n(12345 to stop, " + 
                "54321 to transform, 99999 to end your turn)");
                damageReceiver = console.nextInt();
                if (damageReceiver == 12345){
                    break; //sentinel
                } else if (damageReceiver == 99999){
                    turnCounter();
                    if ((turn-1) % 6 == 0 && phase.equals("Color")){
                        phase = "Rock, Paper, Scissors";
                    } else if ((turn-1) % 6 == 0 && phase.equals("Rock, Paper, Scissors")){
                        phase = "Color";
                    }
                    printBoard();
                } else if (damageReceiver == 54321){
                    System.out.println("Which duck? (Team Number)");
                    int teamNumber = console.nextInt();
                    if (teamNumber < 1 || teamNumber > 12){
                        System.out.println("Typo? Try again.");
                    } else if (teamNumber < 7){
                        transform(team1Name[teamNumber-1], 1, teamNumber);
                    } else if (teamNumber > 6){
                        transform(team2Name[teamNumber-7], 2, teamNumber);
                    }
                    printBoard();
                } else if (damageReceiver < 1 || damageReceiver > 12){
                    System.out.println("Invalid selection. Try again.");
                }
            } while(damageReceiver < 1 || damageReceiver > 12 && damageReceiver != 12345);  
            if (damageReceiver == 12345){
                break; // it only breaks the innermost loop, so I gotta do it again here...
            }
            
            textBased_DDR.fastestTypeWriter("How much? (for heals, enter negative value)");
            damageAmount = console.nextInt();
            System.out.println();
            
            if (damageReceiver == 1){
                team1[0][damageReceiver-1] -= damageAmount;
                if (team1[0][damageReceiver-1] < 0){
                    team1[0][damageReceiver-1] = 0;//when current hp hits zero
                } else if (team1[1][damageReceiver-1] < team1[0][damageReceiver-1]){
                    team1[0][damageReceiver-1] = team1[1][damageReceiver-1]/*max hp*/;
                    //for heals going over
                }
            } else if (damageReceiver == 2){
                team1[0][damageReceiver-1] -= damageAmount;
                if (team1[0][damageReceiver-1] < 0){
                    team1[0][damageReceiver-1] = 0;
                } else if (team1[1][damageReceiver-1] < team1[0][damageReceiver-1]){
                    team1[0][damageReceiver-1] = team1[1][damageReceiver-1];
                }
            } else if (damageReceiver == 3){
                team1[0][damageReceiver-1] -= damageAmount;
                if (team1[0][damageReceiver-1] < 0){
                    team1[0][damageReceiver-1] = 0;
                } else if (team1[1][damageReceiver-1] < team1[0][damageReceiver-1]){
                    team1[0][damageReceiver-1] = team1[1][damageReceiver-1];
                }
            } else if (damageReceiver == 4){
                team1[0][damageReceiver-1] -= damageAmount;
                if (team1[0][damageReceiver-1] < 0){
                    team1[0][damageReceiver-1] = 0;
                } else if (team1[1][damageReceiver-1] < team1[0][damageReceiver-1]){
                    team1[0][damageReceiver-1] = team1[1][damageReceiver-1];
                }
            } else if (damageReceiver == 5){
                team1[0][damageReceiver-1] -= damageAmount;
                if (team1[0][damageReceiver-1] < 0){
                    team1[0][damageReceiver-1] = 0;
                } else if (team1[1][damageReceiver-1] < team1[0][damageReceiver-1]){
                    team1[0][damageReceiver-1] = team1[1][damageReceiver-1];
                }
            } else if (damageReceiver == 6){
                team1[0][damageReceiver-1] -= damageAmount;
                if (team1[0][damageReceiver-1] < 0){
                    team1[0][damageReceiver-1] = 0;
                } else if (team1[1][damageReceiver-1] < team1[0][damageReceiver-1]){
                    team1[0][damageReceiver-1] = team1[1][damageReceiver-1];
                }
            } else if (damageReceiver == 7){
                team2[0][damageReceiver-7] -= damageAmount;
                if (team2[0][damageReceiver-7] < 0){
                    team2[0][damageReceiver-7] = 0;
                } else if (team2[1][damageReceiver-7] < team2[0][damageReceiver-7]){
                    team2[0][damageReceiver-7] = team2[1][damageReceiver-7];
                }
            } else if (damageReceiver == 8){
                team2[0][damageReceiver-7] -= damageAmount;
                if (team2[0][damageReceiver-7] < 0){
                    team2[0][damageReceiver-7] = 0;
                } else if (team2[1][damageReceiver-7] < team2[0][damageReceiver-7]){
                    team2[0][damageReceiver-7] = team2[1][damageReceiver-7];
                }
            } else if (damageReceiver == 9){
                team2[0][damageReceiver-7] -= damageAmount;
                if (team2[0][damageReceiver-7] < 0){
                    team2[0][damageReceiver-7] = 0;
                } else if (team2[1][damageReceiver-7] < team2[0][damageReceiver-7]){
                    team2[0][damageReceiver-7] = team2[1][damageReceiver-7];
                }
            } else if (damageReceiver == 10){
                team2[0][damageReceiver-7] -= damageAmount;
                if (team2[0][damageReceiver-7] < 0){
                    team2[0][damageReceiver-7] = 0;
                } else if (team2[1][damageReceiver-7] < team2[0][damageReceiver-7]){
                    team2[0][damageReceiver-7] = team2[1][damageReceiver-7];
                }
            } else if (damageReceiver == 11){
                team2[0][damageReceiver-7] -= damageAmount;
                if (team2[0][damageReceiver-7] < 0){
                    team2[0][damageReceiver-7] = 0;
                } else if (team2[1][damageReceiver-7] < team2[0][damageReceiver-7]){
                    team2[0][damageReceiver-7] = team2[1][damageReceiver-7];
                }
            } else if (damageReceiver == 12){
                team2[0][damageReceiver-7] -= damageAmount;
                if (team2[0][damageReceiver-7] < 0){
                    team2[0][damageReceiver-7] = 0;
                } else if (team2[1][damageReceiver-7] < team2[0][damageReceiver-7]){
                    team2[0][damageReceiver-7] = team2[1][damageReceiver-7];
                }
            } else {
                break;
            }//who takes damage
            printBoard();
        } while (damageReceiver != 12345);
    }
    
    public boolean transform(String duckName, int team, int duckSlot){
        Scanner console = new Scanner(System.in);
        boolean formFound = false;
        
        if (team == 1 && duckName.equals("mr.fancypantsbossman")){
            team1Name[duckSlot-1] = "mr.fancypantsbossman (Dream World)";
            team1[0][duckSlot-1] += dreamPants() - fancyPants(); //add difference between transform hp and base hp
            team1[1][duckSlot-1] = dreamPants();
            //so that damage counters still work
            formFound = true;
        } else if (team == 1 && duckName.equals ("ms.fancyskirtbosswoman")){
            team1Name[duckSlot-1] = "ms.fancyskirtbosswoman (Dream World)";
            team1[0][duckSlot-1] += dreamSkirt() - fancySkirt();
            team1[1][duckSlot-1] = dreamSkirt();
            formFound = true;
        } else if (team == 1 && duckName.contains("arthur")){
            do {
                System.out.println("Which Arthur form? (Base, Miner, Skater, Florist, Super, Knight, Cloak, Crowned)");
                String formName = console.next();
                formName.toLowerCase();
                if (formName.equals("miner")){
                    team1Name[duckSlot-1] = "arthur (Miner)";
                    team1[0][duckSlot-1] += arthurMiner()-arthur();
                    team1[1][duckSlot-1] = arthurMiner();
                    formFound = true;
                } else if (formName.equals("skater")){
                    team1Name[duckSlot-1] = "arthur (Figure Skater)";
                    team1[0][duckSlot-1] += arthurSkater()-arthur();
                    team1[1][duckSlot-1] = arthurSkater();
                    formFound = true;
                } else if (formName.equals("florist")){
                    team1Name[duckSlot-1] = "arthur (Florist)";
                    team1[0][duckSlot-1] += arthurFlorist()-arthur();
                    team1[1][duckSlot-1] = arthurFlorist();
                    formFound = true;
                } else if (formName.equals("super")){
                    team1Name[duckSlot-1] = "arthur (Super Suit)";
                    team1[0][duckSlot-1] += arthurSuper()-arthur();
                    team1[1][duckSlot-1] = arthurSuper();
                    formFound = true;
                } else if (formName.equals("knight")){
                    team1Name[duckSlot-1] = "arthur (Solar Knight)";
                    team1[0][duckSlot-1] += arthurKnight()-arthur();
                    team1[1][duckSlot-1] = arthurKnight();
                    formFound = true;
                } else if (formName.equals("cloak")){
                    team1Name[duckSlot-1] = "arthur (Assault Cloak)";
                    team1[0][duckSlot-1] += arthurCloak()-arthur();
                    team1[1][duckSlot-1] = arthurCloak();
                    formFound = true;
                } else if (formName.equals("crowned")){
                    team1Name[duckSlot-1] = "arthur (Crowned)";
                    team1[0][duckSlot-1] += arthurCrowned()-arthur();
                    team1[1][duckSlot-1] = arthurCrowned();
                    formFound = true;
                } else if (formName.equals("base")){
                    team1Name[duckSlot-1] = "arthur";
                    if (team1[0][duckSlot-1] + arthurToBase(duckName) < 0){
                        team1[0][duckSlot-1] = 0;
                    } else {
                        team1[0][duckSlot-1] += arthurToBase(duckName);
                        team1[1][duckSlot-1] = arthur();
                    }
                    formFound = true;
                } else if (formName.equals("cancel")){
                    break;
                } else {
                    System.out.println("Form not found. Try typing a form in the parenthesis.");
                    formFound = false;
                }
            } while (!formFound);//team 1 arthur forms
        } else if (team == 2 && duckName.equals("mr.fancypantsbossman")){
            team2Name[duckSlot-7] = "mr.fancypantsbossman (Dream World)";
            team2[0][duckSlot-7] += dreamPants()-fancyPants(); //add difference between transform hp and base hp
            //so that damage counters still work
            team2[1][duckSlot-7] = dreamPants();
            formFound = true;
        } else if (team == 2 && duckName.equals ("ms.fancyskirtbosswoman")){
            team2Name[duckSlot-7] = "ms.fancyskirtbosswoman (Dream World)";
            team2[0][duckSlot-7] += dreamSkirt() - fancySkirt();
            team2[1][duckSlot-7] = dreamSkirt();
            formFound = true;
        } else if (team == 2 && duckName.contains("arthur")){
            do {
                System.out.println("Which Arthur form? (Base, Miner, Skater, Florist, Super, Knight, Cloak, Crowned)");
                String formName = console.next();
                formName.toLowerCase();
                if (formName.equals("miner")){
                    team2Name[duckSlot-7] = "arthur (Miner)";
                    team2[0][duckSlot-7] += arthurMiner()-arthur();
                    team2[1][duckSlot-7] = arthurMiner();
                    formFound = true;
                } else if (formName.equals("skater")){
                    team2Name[duckSlot-7] = "arthur (Figure Skater)";
                    team2[0][duckSlot-7] += arthurSkater()-arthur();
                    team2[1][duckSlot-7] = arthurSkater();
                    formFound = true;
                } else if (formName.equals("florist")){
                    team2Name[duckSlot-7] = "arthur (Florist)";
                    team2[0][duckSlot-7] += arthurFlorist()-arthur();
                    team2[1][duckSlot-7] = arthurFlorist();
                    formFound = true;
                } else if (formName.equals("super")){
                    team2Name[duckSlot-7] = "arthur (Super Suit)";
                    team2[0][duckSlot-7] += arthurSuper()-arthur();
                    team2[1][duckSlot-7] = arthurSuper();
                    formFound = true;
                } else if (formName.equals("knight")){
                    team2Name[duckSlot-7] = "arthur (Solar Knight)";
                    team2[0][duckSlot-7] += arthurKnight()-arthur();
                    team2[1][duckSlot-7] = arthurKnight();
                    formFound = true;
                } else if (formName.equals("cloak")){
                    team2Name[duckSlot-7] = "arthur (Assault Cloak)";
                    team2[0][duckSlot-7] += arthurCloak()-arthur();
                    team2[1][duckSlot-7] = arthurCloak();
                    formFound = true;
                } else if (formName.equals("crowned")){
                    team2Name[duckSlot-7] = "arthur (Crowned)";
                    team2[0][duckSlot-7] += arthurCrowned()-arthur();
                    team2[1][duckSlot-7] = arthurCrowned();
                    formFound = true;
                } else if (formName.equals("base")){
                    team2Name[duckSlot-7] = "arthur";
                    if (team2[0][duckSlot-7] + arthurToBase(duckName) < 0){
                        team2[0][duckSlot-7] = 0;
                    } else {
                        team2[0][duckSlot-7] += arthurToBase(duckName);//base arthur - current arthur form
                        team2[1][duckSlot-7] = arthur();
                    }
                    formFound = true;
                } else {
                    System.out.println("Form not found. Try typing a word in the parenthesis.\n");
                    formFound = false;
                }
            } while (!formFound);//team 2 arthur forms
        } else {
            textBased_DDR.typeWriter("That form may not exist. Try again.");
            formFound = false;
        }
        
        return formFound;
    }
    
    
    //POSSIBLE FEATURES TO ADD (3/17/2026)
    // - Each duck corresponds to a MAX hp value, so that heals above the max hp on the card can be put in by the user anyway
    //      (e.g. Arthur at 180 HP, heals 20. You can put in the 20 and it will still make Arthur's hp 190 because that's his max
    //      Start date: 3/23/2026
    //      Complete: 3/23/2026
    
    // - Shield Tracker (would also need an input code; Use 11111 or something easy to remember)
    //       Axed
    // - Arena/Field State Tracker with the turn count down for those things
    // - When you get good enough, maybe add buttons so that typing won't be necessary
    //       Buttons would be HUGE now that I think about it; consider it
    // - Jargon terms correspond to ducks (e.g. you don't have to type "Stanced Swordsman", you can just type stanced
    // - Add S2 and S3 in the future
    
    //More Possible Features (3/25/2026)
    // - Rematch command
    // - Change the spacing so losing HP doesn't impact the allignment
    
    
    private int arthurToBase(String currentForm){
        currentForm = currentForm.toLowerCase();
        if (currentForm.contains("miner")){
            return arthur() - arthurMiner();
        } else if (currentForm.contains("skater")){
            return arthur() - arthurSkater();
        }else if (currentForm.contains("florist")){
            return arthur() - arthurFlorist();
        } else if (currentForm.contains("super")){
            return arthur() - arthurSuper();
        } else if (currentForm.contains("knight")){
            return arthur() - arthurKnight();
        } else if (currentForm.contains("cloak")){
            return arthur() - arthurCloak();
        } else if (currentForm.contains("crowned")){
            return arthur() - arthurCrowned();
        } else {
            System.out.println("Invalid Form"); // to fix; transforming into base doesn't work as intended
            return 0;
        }
    }
    
    public void turnCounter(){
        turn++;
    }
    
    private void printBoard(){
        System.out.println("\n\nTurn: " + turn + "                                      Phase: " + phase);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\nTeam 1 (1-6)                                 Team 2 (7-12)");
        System.out.println();
        for (int i = 0; i<6; i++){
            System.out.print(team1Name[i] + " - " + team1[0][i]);
            for (int spaces = 0; spaces < 33-(team1Name[i].length()-6); spaces++){
                System.out.print(" ");
            }//to keep number of characters (including spaces) consistent
            for (int j = 0; j<6; j++){
                if (j==i){
                    System.out.println(team2Name[i] + " - " + team2[0][i]);
                }
            }
            System.out.println();
        }//print team 2 beside team 1
        System.out.println();
        System.out.println();
    }
    
    private static int arthur(){
        return 190;
    }
    private static int arthurSkater(){
        return 160;
    }
    private static int arthurMiner(){
        return 230;
    }
    private static int arthurFlorist(){
        return 220;
    }
    private static int arthurSuper(){
        return 280;
    }
    private static int arthurKnight(){
        return 300;
    }
    private static int arthurCloak(){
        return 160;
    }
    private static int arthurCrowned(){
        return 330;
    }
    private static int coolerPal(){
        return 230;
    }
    private static int pNinja(){
        return 130;
    }
    private static int gambler(){
        return 190;
    }
    private static int lGhost(){
        return 50;
    }
    private static int firecracker(){
        return 140;
    }
    private static int assault(){
        return 160;
    }
    private static int fancySkirt(){
        return 130;
    }
    private static int dreamSkirt(){
        return 260;
    }
    private static int fancyPants(){
        return 130;
    }
    private static int dreamPants(){
        return 250;
    }
    private static int dapper(){
        return 210;
    }
    private static int mMonarch(){
        return 290;
    }
    private static int armed(){
        return 250;
    }
    private static int stanced(){
        return 250;
    }
    private static int fuu(){
        return 230;
    }
    private static int grimReaper(){
        return 260;
    }
    private static int cMug(){
        return 300;
    }
    private static int bubbleTea(){
        return 220;
    }
    private static int dreamerSwordsman(){
        return 270;
    }
    private static int wallet(){
        return 50;
    }
    private static int gunslinger(){
        return 190;
    }
    private static int office(){
        return 270;
    }
    private static int soccerBeast(){
        return 180;
    }
    private static int cTeacher(){
        return 190;
    }
    private static int trafficKeeper(){
        return 280;
    }
    private static int blanket(){
        return 240;
    }
    private static int violinist(){
        return 160;
    }
    private static int teleporter(){
        return 170;
    }
    private static int snowglobe(){
        return 500;
    }
    private static int soccerProdigy(){
        return 260;
    }
    private static int origami(){
        return 180;
    }
    private static int triplets(){
        return 90;
    }
}