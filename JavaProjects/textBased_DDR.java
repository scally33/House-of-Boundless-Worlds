import java.util.*;
import javax.swing.*;

// "\033[3m" is for italics, "\033[0m" is to reset it back to normal
//the above does not work
public class textBased_DDR{
    public static int Karma = 0;
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Duck Duelist Revolution:\nA Text-based Adventure");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        typeWriter("\"Controls\": When prompted with options, a number or letter will preceed it. \nType in and enter the number of your choice");
        try {
            Thread.sleep(3000);//pauses for 3 seconds
        } catch (InterruptedException e){
            //Handles interruptions
            Thread.currentThread().interrupt(); //Re-interrupts
        }
        System.out.println("\n\nType k and enter to start");
        String playerInput; 
        char playerInput1;
        do {
            playerInput = console.next().toLowerCase();
            playerInput1 = playerInput.charAt(0);
            if (playerInput1 == 'k'){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
        } while (playerInput1 != 'k');
        storyline();
        console.close();
    }
    
    public static void textFallAnimation(int n){
        if (n<=0){
            return;
        }
        textFallAnimation(n-1);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("|       |       |       |       |       |       |       |");
        for (int i=0; i<10; i++){
            try {
                Thread.sleep(15);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println();
        }
    }
    
    public static void storyline(){  
        homeTown();
        //revolutionSignUps();
        //vamanos();
        //codicino();
        //mosstralia();
    }
    
    public static void homeTown(){
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        String lines;
        lines = "Bzzzzzzzz";
        typeWriter(lines);
        smallPause();
        lines = "Shaaa shaaa shaaa shaaa shaaa";
        typeWriter(lines);
        smallPause();
        System.out.println();
        
        lines = "The fervent heat of summer's been kicking. I should probably feel bad for those cicadas being fried out there, " + 
        "\nbut the Revolution - the world's biggest tournament festival - is just around the corner." + 
        "\nWell, I guess I should worry about winning against sleep first.";
        typeWriter(lines);
        System.out.println();
        
        smallPause();
        smallPause();
        lines = "Mom: You look kind of sweaty. Go shower or something. Otherwise, you'll have to wash those stains \nout of your sheets yourself!"+
        " Also, Alex is waiting outside. You two were going to play basketball, right?";
        typeWriter(lines);
        smallPause();
        
        System.out.println();
        typeWriter("...");
        typeWriter("Oh yeah.");
        System.out.println();
        lines = "Ngh... I guess I better get up, then...";
        typeWriter(lines);
        System.out.println();
        
        textFallAnimation(15);
        String event;
        int response = 0;
        typeWriter("Alex and I go play ball for a while. Our match attracts a small crowd, but eventually...");
        System.out.println();
        event = alexBasketball();
        System.out.println();
        if (event == "win"){
            typeWriter("Alex: I got destroyed! Who taught you how to cross like that!?");
            String option1 = "1 - I'm just built like that.";
            String option2 = "2 - The match was closer than you think, man.";
            String option3 = "3 - My dad. He used to be part of the NBA.";
            System.out.println(option1 + "\n" + option2 + "\n" + option3);
            do {
                response = console.nextInt();            
            } while (response <1 || response > 3);
            if (response == 1){
                typeWriter("Alex: Alright, pal.");
            } else if (response == 2){
                typeWriter("Alex: You're too humble. Buuuut, I guess you're right!\nI didn't do half bad if I do say so myself!");
                Karma+=2;
            } else {
                typeWriter("Alex: Really!? No way!! Why did you never tell me!?");
                typeWriter("You:"); slowerTypeWriter("..."); typeWriter("Because he never was.");
                typeWriter("Alex: ......I'll remember that.");
                Karma-=2;
            }
        } else if (event == "loss"){
            typeWriter("Alex: Awhhh yeah!! I won! How was that, huh?");
            String option1 = "1 - ...I will FRY you next time. Watch your back, buddy.";
            String option2 = "2 - Barely. Good job, though! You've gotten better.";
            String option3 = "3 - I was just off my game, that's all.";
            System.out.println(option1 + "\n" + option2 + "\n" + option3);
            do {
                response = console.nextInt();            
            } while (response <1 || response > 3);
            if (response == 1){
                typeWriter("Alex: Yeah yeah, pal.");
            } else if (response == 2){
                typeWriter("Alex: Nah, you're right. It was close.\nNext time, you won't even score 10 on me!");
                Karma+=3;
            } else {
                typeWriter("Alex: ...Hahahaha! Is that so?");
                typeWriter("You look at your feet like a humiliated child.");
                Karma--;
            }
        } else {
            slowerTypeWriter("Alex: Huff... puff... It was a draw...");
            String option1 = "1 - ...";
            String option2 = "2 - You're getting too good. Slow down, man.";
            String option3 = "3 - Sigh... I could've won that...";
            System.out.println(option1 + "\n" + option2 + "\n" + option3);
            do {
                response = console.nextInt();            
            } while (response <1 || response > 3);
            if (response == 1){
                slowerTypeWriter("Alex: I would ask for a rematch... but I need some water...");
            } else if (response == 2){
                typeWriter("Alex: ...Ha! I'm finally catching up to you!");
                Karma++;
            } else {
                typeWriter("Alex: Oh well. There's always next time.");
                Karma--;
            }
        }
    }
    
    private static String alexBasketball(){
        for (int i = 0; i<=5; i++){
            System.out.println();
        }
        typeWriter("Welcome to Alex's Basketball! It might not seem like basketball, but imagine that it is!");
        System.out.println();
        typeWriter("You have ten guesses to match a 6 digit number.");
        typeWriter("The Xs count the number of digits in your guess that match; \nyou'll have to find out the order! Good luck!");
        System.out.println();
        int guesses = 10;
        Random r = new Random();
        int code = r.nextInt(999999)+100000;
        //System.out.println("DELETE AFTER\ncode is " + code);
        
        Scanner console = new Scanner(System.in);
        int playerGuess = 0;
        String winLoseDraw = "";
        int matchCount = 0;
        int maxMatches = 0;
        String [][] board = new String[10][6];
        for (int i=10-guesses; i<10; i++){
            for (int j=matchCount; j<6; j++){
                board [i][j]= "O";
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }//print board first one time, then get guesses (fencepost)
        
        while (guesses > 0 && playerGuess != code) {
            do {
                typeWriter("Your guess is?");
                playerGuess = console.nextInt();
                if ((int)(Math.log10(playerGuess)+1) != 6){
                    System.out.print("Type 6 digits, pal. ");
                    typeWriter("Try again~!");
                } else if (playerGuess == 0){
                    typeWriter("I suck at coding, so all 0s doesn't work. Sorry :p");
                    typeWriter("Try again!");
                }
                //System.out.println("log10 player guess = " + (int)(Math.log10(playerGuess)+1));
            } while (((int)(Math.log10(playerGuess)+1)!=6));//player guess
            matchCount = correctGuesses(code, playerGuess);//get match number
            if (matchCount > maxMatches){
                maxMatches = matchCount;
            }//for scenario determination
            for (int i=0; i<3; i++){
                System.out.println();
            }//spacing
            for (int i=10-guesses; i<10; i++){
                if (matchCount > 0 && i == 10-guesses){
                    for (int j=0; j<matchCount; j++){
                        board [i][j] = "X";
                    }
                }
                for (int j=matchCount; j<6; j++){
                    board [i][j]= "O";
                }
            }//set the board
            for (int i = 0; i<board.length; i++){
                for (int j = 0; j < board[i].length; j++){
                    System.out.print(board[i][j] + " ");
                }
                if (i == 10-guesses){
                    System.out.print("<<<");
                }
                System.out.println();
            }//print the board
            for (int i=0; i<3; i++){
                System.out.println();
            }//spacing
            guesses--;//decrease guess count
        } 
        
        if (playerGuess == code){
            System.out.println("You got it! Congrats, wizard!!");
            return "win";
        } else if (maxMatches >= 3){
            System.out.println("Meh. The code was " + code);
            return "draw";
        } else {
            System.out.println("Gee, you need some work. The code was " + code);
            return "loss";
        }//return if you win or lose
    }
    
    public static int correctGuesses(int code, int playerGuess){
        int match = 0;
        int guessDigit;
        for (int i = playerGuess; i>0; i/=10){
            guessDigit = i%10;
            for (int j = code; j>0; j/=10){
                if (j%10 == guessDigit){
                    match++;
                    break;
                }
            }
        }
        return match;
    }
    
    public static void smallPause(){
        try {
            Thread.sleep(250);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    
    //bellow are the typewriter modes, normal, fast, and slow
    public static String typeWriter(String lines){
        for (int i=0; i<lines.length(); i++){
            System.out.print(lines.charAt(i));
            if(lines.charAt(i) == '!' || lines.charAt(i) == '?'){
                try{
                    Thread.sleep(150);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            } else  if (lines.charAt(i) == '.'){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                } 
            } else {
                try{
                    Thread.sleep(35);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println();
        return lines;
    }
    
    public static String fasterTypeWriter(String lines){
        for (int i=0; i<lines.length(); i++){
            System.out.print(lines.charAt(i));
            if(lines.charAt(i) == '!' || lines.charAt(i) == '?'){
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            } else  if (lines.charAt(i) == '.'){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                } 
            } else {
                try{
                    Thread.sleep(20);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println();
        return lines;
    }
    
    public static String fastestTypeWriter(String lines){
        for (int i=0; i<lines.length(); i++){
            System.out.print(lines.charAt(i));
            if(lines.charAt(i) == '!' || lines.charAt(i) == '?'){
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            } else  if (lines.charAt(i) == '.'){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                } 
            } else {
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println();
        return lines;
    }
    
    public static String slowerTypeWriter(String lines){
        for (int i=0; i<lines.length(); i++){
            System.out.print(lines.charAt(i));
            if(lines.charAt(i) == '!' || lines.charAt(i) == '?'){
                try{
                    Thread.sleep(200);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            } else  if (lines.charAt(i) == '.'){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                } 
            } else {
                try{
                    Thread.sleep(60);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println();
        return lines;
    }
}