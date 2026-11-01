import java.util.*;
public class theTowerOfGames{
    public void main(String [] args){
        //make a thingy that stores player files
        //put a thingy sequencing through all the games here
        //if a player screws up a game, the game should return false and boot them
        //maybe make a score tracker for the player to add to the file
        //at that point, maybe also make usernames to get player data from the file
        
        
        
        
        
    }
    
    
    public boolean jokerDoom(){
        //make S.o.p into typerWriter for some of em
        boolean isWin = false;
        boolean isTie = false;
        do{
            isTie = false;
            typeWriter("Before you are 5 cards...");
            typeWriter("One of them are the Joker of Doom, and the others\nare black and red. If you");
            typeWriter("pick a matching pair or have your opponent pick the joker, and you win!");
            typeWriter("Simple, right?");
            String[] cards = {"Red", "Red", "Black", "Black", "Joker"};
            cards = jokerRandomizer(cards);
            int[] playerPicks = new int[2];
            String[] playerCards = new String[2];
            int[] botPicks = new int[2];
            String[] botCards = new String[2];
            
            
            printCards(cards);
            Scanner console = new Scanner(System.in);
            boolean isValidPick = true;
            do {
                typeWriter("Pick a card, any card! (Enter a number, 1(left) to 5(right)");
                int pick1 = console.nextInt();
                if (pick1 > 5 || pick1 < 1){
                    System.out.println("Invalid choice. Please try again.");
                    isValidPick = false;
                } else {
                    playerCards[0] = cards[pick1-1];
                    playerPicks[0] = pick1;
                    cards[pick1-1] = "";
                    printCards(cards);
                }
            }while (!isValidPick);
            
            //to do:
            //make the bot randomizer. The bot should generate a random number and see if it matches player picks.
            //If it matches, regenerate until valid choice is found.
            boolean isValidBotPick = true;
            do{
                Random r = new Random();
                int pick1 = r.nextInt(5)+1;
                if (pick1 == playerPicks[0]){
                    isValidBotPick = false;
                } else {
                    isValidBotPick = true;
                    typeWriter("...My choice.");
                    botCards[0] = cards[pick1-1];
                    botPicks[0] = pick1;
                    cards[pick1-1] = "";
                    printCards(cards);
                }            
            } while (!isValidBotPick);
            
            do{
                typeWriter("Pick another card, any other card! (Enter a number, 1(left) to 5(right)");
                int pick2 = console.nextInt();
                if ((pick2 > 5 || pick2 < 1) || (pick2 == playerPicks[0] || pick2 == botPicks[0] || pick2 == botPicks[1])){
                    System.out.println("Invalid choice. Please try again.");
                    isValidPick = false;
                } else {
                    isValidPick = true;
                    playerCards[1] = cards[pick2-1];
                    playerPicks[1] = pick2;
                    cards[pick2-1] = "";
                    printCards(cards);
                }
            } while (!isValidPick);
            
            do{
                Random r = new Random();
                int pick2 = r.nextInt(5)+1;
                if (pick2 == botPicks[0] || pick2 == playerPicks[0] || pick2 == playerPicks[1]){
                    isValidBotPick = false;
                } else {
                    isValidBotPick = true;
                    typeWriter("My final card!");
                    botCards[1] = cards[pick2-1];
                    botPicks[1] = pick2;
                    cards[pick2-1] = "";
                    printCards(cards);
                }            
            } while (!isValidBotPick);
            
            typeWriter("It's time for the grand reveal! Who will move on? And\nwho will be banished...?");
            int order = (int)Math.random();
            if (order == 0){
                typeWriter("And my first card is...");
                if (botCards[0].toLowerCase().equals("joker")){
                    typeWriter("a " + botCards[1] + "!");
                    typeWriter("Your first card is...");
                    typeWriter("a " + playerCards[0] + "...!");
                    typeWriter("My next card is...");
                    typeWriter("the " + botCards[0] + "...");
                    typeWriter("Your next card was a " + playerCards[1] + ".");
                    isWin = true;
                } else if (playerCards[0].toLowerCase().equals("joker")){
                    typeWriter("a " + botCards[0] + "!");
                    typeWriter("Your first card is...");
                    typeWriter("a " + playerCards[1] + "...!");
                    typeWriter("My next card is...");
                    typeWriter("a " + botCards[1] + "!");
                    typeWriter("Your next card is...");
                    typeWriter("...");
                    typeWriter("...");
                    typeWriter("The " + playerCards[0] + "...");
                    isWin = false;
                } else if (playerCards[1].toLowerCase().equals("joker")){
                    typeWriter("a " + botCards[1] + "!");
                    typeWriter("Your first card is...");
                    typeWriter("a " + playerCards[0] + "...!");
                    typeWriter("My next card is...");
                    typeWriter("a " + botCards[0] + "!");
                    typeWriter("Your next card is...");
                    typeWriter("the " + playerCards[1] + "...!");
                    isWin = false;
                } else if (botCards[1].toLowerCase().equals("joker")){
                    typeWriter("a " + botCards[0] + "!");
                    typeWriter("Your first card is...");
                    typeWriter("a " + playerCards[0] + "...!");
                    typeWriter("My next card is...");
                    typeWriter("a " + botCards[1] + "...!");
                    typeWriter("Your next card was a " + playerCards[1] + "!");
                    isWin = true;
                } else {
                    typeWriter("a " + botCards[1] + "!");
                    typeWriter("Your first card is...");
                    typeWriter("a " + playerCards[0] + "...!");
                    typeWriter("My next card is...");
                    typeWriter("a " + botCards[0] + "!");
                    typeWriter("Your next card is a " + playerCards[1] + "!");
                    isTie = true;
                    typeWriter("...So a draw. We'll have to play again.\n\n\n");
                }
            } else {
                typeWriter("And your first card is...");
                if (playerCards[0].toLowerCase().equals("joker")){
                    typeWriter("a + " + playerCards[1] + "!");
                    typeWriter("My first card is...");
                    typeWriter("a + " + botCards[0] + "!");
                    typeWriter("Your next card is...");
                    typeWriter("...");
                    typeWriter("...");
                    typeWriter("...the " + playerCards[0] + "...!");
                    typeWriter("My next card was a " + botCards[1] + ".");
                    isWin = false;
                } else if (botCards[0].toLowerCase().equals("joker")){
                    typeWriter("a + " + playerCards[1] + "!");
                    typeWriter("My first card is...");
                    typeWriter("a + " + botCards[1] + "!");
                    typeWriter("Your next card is...");
                    typeWriter("a " + playerCards[0] + "!");
                    typeWriter("My next card is...");
                    typeWriter("the " + botCards[1] + "...");
                    isWin = true;
                } else if (playerCards[1].toLowerCase().equals("joker")){
                    typeWriter("a + " + playerCards[1] + "!");
                    typeWriter("My first card is...");
                    typeWriter("a + " + botCards[0] + "!");
                    typeWriter("Your next card is...");
                    typeWriter("...");
                    typeWriter("...");
                    typeWriter("...the " + playerCards[0] + "...!");
                    typeWriter("My next card was a " + botCards[1] + ".");
                    isWin = false;
                } else if (botCards[1].toLowerCase().equals("joker")){
                    typeWriter("a + " + playerCards[1] + "!");
                    typeWriter("My first card is...");
                    typeWriter("a + " + botCards[1] + "!");
                    typeWriter("Your next card is...");
                    typeWriter("a " + playerCards[0] + "!");
                    typeWriter("My next card is...");
                    typeWriter("the " + botCards[1] + "...");
                    isWin = true;
                } else {
                    typeWriter("a + " + playerCards[1] + "!");
                    typeWriter("My first card is...");
                    typeWriter("a + " + botCards[1] + "!");
                    typeWriter("Your next card is...");
                    typeWriter("a " + playerCards[0] + "!");
                    typeWriter("My next card is...");
                    typeWriter("a " + botCards[1] + "...!");
                    isTie = true;
                    typeWriter("...So a draw. We'll have to play again.");
                }
            }
        } while (isTie);
        
        if (isWin){
            System.out.println("YOU WIN! TO THE NEXT FLOOR!");
            return isWin;
        } else {
            System.out.println("YOU LOSE! TOO BAD!");
            return isWin;
        }
    }
    public String[] jokerRandomizer(String[] s){
        Random r = new Random();
        String temp;
        int shuffleCount = r.nextInt(50)+1;
        for (int i = 0; i<shuffleCount; i++){
            int rand1 = r.nextInt(5)+1;
            int rand2 = r.nextInt(5)+1;
            temp = s[rand1-1];
            s[rand1-1] = s[rand2-1];
            s[rand2-1] = temp;
        }
        return s;
    }
    public void printCards(String[] cards){
        System.out.println();
        if (!cards[0].isEmpty()){
            System.out.print("------");
        } else {
            System.out.print("      ");
        }
        for (int i = 1; i<cards.length; i++){
            if (!cards[i].isEmpty()){
                System.out.print("    ");
                System.out.print("------");
            } else {
                System.out.print("    ");
                System.out.print("      ");
            }
        }
        System.out.println();
        
        
        for (int i = 0; i<=3; i++){
            for (int j = 0; j<cards.length-1; j++){
                if (!cards[j].isEmpty()){
                    System.out.print("|    |");
                    System.out.print("    ");
                } else {
                    System.out.print("      ");
                    System.out.print("    ");
                }
            }
            if (!cards[cards.length-1].isEmpty()){
                System.out.print("|    |");
            }
            System.out.println();
        }
        
        
        if (!cards[0].isEmpty()){
            System.out.print("------");
        } else {
            System.out.print("      ");
        }
        for (int i = 1; i<cards.length; i++){
            if (!cards[i].isEmpty()){
                System.out.print("    ");
                System.out.print("------");
            } else {
                System.out.print("    ");
                System.out.print("      ");
            }
        }
        System.out.println();
        System.out.println();
    }
    //JOKER OF DOOM - END
    //================================================================================================================
    
    public boolean duelOfFate(){
        //make S.o.p into typerWriter for some of em
        typeWriter("So you've advanced to the second floor! Congratulations!");
        typeWriter("Unlike the last one, this game won't be so easy!");
        typeWriter("Before you is a deck with cards up to 10 in number, 3 cards for each value. Each turn,");
        typeWriter("you declare Attack or Defense to a card, and then draw.");
        typeWriter("When one's Attack card is used that is greater than Defense of the other, the");
        typeWriter("defender's health decreases by the difference; defeat your opponent or have more HP when the deck");
        typeWriter("runs out! You each have 12 HP.");
        typeWriter("** Defense does not stack (higher values override instead) **");
        typeWriter("Good luck...!!\n\n\n\n");
        
        int playerHP = 12;
        int botHP = 12;
        int playerDef = 0;
        int botDef = 0;
        int turnCounter = 0;
        int cardCount;
        int[] deckVals = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10};
        deckVals = duelRandomizer(deckVals);
        Stack<Integer> deck = new Stack<Integer>();
        for (int i = 0; i<deckVals.length; i++){
            deck.push(deckVals[i]);
        }
        int whoGoesFirst = (int)Math.round(Math.random());
        boolean isPlayerTurn = false;
        do {
            if (turnCounter == 0 && whoGoesFirst == 0){
                isPlayerTurn = false;
            } else if (turnCounter == 0 && whoGoesFirst == 1) {
                isPlayerTurn = true;
            } else {
                isPlayerTurn = !isPlayerTurn;
            }
            turnCounter++;
            cardCount = deck.size();
            fateDuelPrint(turnCounter, cardCount, playerHP, playerDef, botHP, botDef);
            
            if (isPlayerTurn){
                Scanner console = new Scanner(System.in);
                String response = "";
                do{
                    //print board state method
                    typeWriter("Your turn. Choose: Attack or Defense! (type your choice)");
                    response = console.next().toLowerCase();
                    if (!response.equals("attack") && !response.equals("defense")){
                        System.out.println("Invalid choice. Try again.");
                    }
                } while (!response.equals("attack") && !response.equals("defense"));
                
                if (response.equals("defense")){
                    int defenseCheck = deck.pop();
                    typeWriter("You drew a " + defenseCheck + " for defense!");
                    if (playerDef < defenseCheck){
                        playerDef = defenseCheck;
                    }
                } else {
                    int attack = deck.pop();
                    typeWriter("You drew a " + attack + " for attack!");
                    while (botDef >0 && attack > 0){
                        attack--;
                        botDef--;
                    }
                    botHP -= attack;
                    
                    typeWriter("Tch... you did " + attack + " damage...!");
                    if (botHP <= 0){
                        typeWriter("\n\nWow. You're not half bad...");
                    }
                }
            } else {
                //bot's turn
                boolean attacks = false;
                boolean defends = false;
                if (playerHP <= 3 || botDef >= 5 || (playerDef >= 5 && botHP >= 6)){
                    attacks = true;
                    defends = false;
                } else if (botHP <= 6){
                    defends = true;
                    attacks = false;
                } else if (cardCount < 10){
                    attacks = true;
                    defends = false;
                }else {
                    int rVal = (int)Math.random();
                    if (rVal == 0){
                        attacks = true;
                        defends = false;
                    } else {
                        defends = true;
                        attacks = false;
                    }
                }
                if (attacks){
                    typeWriter("My turn! I choose Attack!");
                    int attackCheck = deck.pop();
                    typeWriter("And I draw... a " + attackCheck + "!");
                    while (playerDef>0 && attackCheck > 0){
                        attackCheck--;
                        playerDef--;
                    }
                    playerHP -= attackCheck;
                    typeWriter("You took " + attackCheck + " damage!");
                    typeWriter("How's that, hmmm?");
                } else {
                    typeWriter("My turn! I choose Defend!");
                    int defenseCheck = deck.pop();
                    typeWriter("And I draw... a " + defenseCheck + "!");
                    if (defenseCheck > botDef){
                        botDef = defenseCheck;
                    }
                }
            }
            System.out.println();
        } while (botHP > 0 && playerHP > 0 && cardCount > 0);
        
        if (playerHP > botHP){
            System.out.println("YOU WIN! TO THE NEXT FLOOR!");
            return true;
        } else {
            System.out.println("YOU LOSE! TOO BAD!");
            return false;
        }
    }
    
    public int[] duelRandomizer(int[] n){
        Random r = new Random();
        int shuffleCount = r.nextInt(500)+1;
        
        int temp;
        for (int i = 0; i<shuffleCount; i++){
            int rand1 = r.nextInt(30);
            int rand2 = r.nextInt(30);
            temp = n[rand1];
            n[rand1] = n[rand2];
            n[rand2] = temp;
        }
        return n;
    }
    //print board state method here
    public void fateDuelPrint(int turn, int cardCount, int playerHP, int playerDef, int botHP, int botDef){
        System.out.println("Turn: " + turn);
        System.out.print("Player HP: " + playerHP);
        System.out.println("\tPlayer Def: " + playerDef);
        System.out.print("Bot HP: " + botHP);
        System.out.println("\tBot Def: " + botDef);
        
        System.out.println("Deck:");
        System.out.println("   -------");
        System.out.println("  /     //");
        if (cardCount >= 10){
            System.out.println(" / "+cardCount+"  //");
        } else {
            System.out.println(" /  "+cardCount+"  //");
        }
        System.out.println("/     //");
        System.out.println("-------");
        typeWriter("\n\n\n");
    }
    // DUEL OF FATE - END
    //================================================================================================================
    
    public boolean hangman(){
        typeWriter("Third floor already? Not bad, player.");
        typeWriter("Let's get a little classical with Hangman, then.");
        typeWriter("As a reminder of the rules, I have a phrase with blanks representing letters.");
        typeWriter("You can enter a letter, and if it's in the phrase, it will reveal");
        typeWriter("all of its instances present.");
        typeWriter("You must guess the phrase within 7 guesses. \n**Guessing the phrase counts as a guess, so be sure to save one!**.");
        
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        int selection = r.nextInt(10)+1;
        int guessCount = 7;
        String phrase;
        String guess;
        if (selection == 0){
            phrase = "It's raining cats and dogs";
        } else if (selection == 1){
            phrase = "Roses are red, violets are blue";
        } else if (selection == 2){
            phrase = "You're walking on thin ice";
        } else if (selection == 3){
            phrase = "Don't spill the beans";
        } else if (selection == 4){
            phrase = "Once in a blue moon";
        } else if (selection == 5){
            phrase = "Kill two birds with one stone";
        } else if (selection == 6){
            phrase = "An apple a day keeps the doctor away";
        } else if (selection == 7){
            phrase = "Sorry to burst your bubble";
        } else if (selection == 8){
            phrase = "Under the weather";
        } else {
            phrase = "Piece of cake";
        }
        
        
        
        String [] phraseWords = new String[wordCount(phrase)];
        phraseWords = toWords(phraseWords, phrase);
        
        String [] guessWords;
        do {
            typeWriter("Make your guess! You can guess words.");
            System.out.println("Include provided punctuation in your final guess.");
            guess = console.next().toLowerCase();
            guessWords = new String [wordCount(guess)];
            guessWords = toWords(guessWords, guess); 
            
            if (guess.length() > phrase.length()){
                typeWriter("That guess is too long... Try again.");
                guessCount--;
            } else if (guess.length() == 1){
                
                
                
            } else if (guess.length() == phrase.length()){
                if (guess.equals(phrase.toLowerCase())){
                    typeWriter(phrase + "\n\n\n");
                    typeWriter("Wow. You got it!");
                    break;
                } else {
                    typeWriter("That's not it. Too bad!");
                    guessCount--;
                }
            } else /*if (guess.length() < phrase.length() && guess.length() > 1)*/{
                
            }
            
            
        } while (guessCount > 0);
        
        
    }
    
    public String hangmanBoardBuilder(String board, String phrase, String test){
        int smallestIndex = 0; //for substrings
        
        while (phrase.length() > 0){
            if (phrase.indexOf(test) == -1){
                break;
            } else {
                smallestIndex = phrase.indexOf(test); //find the first instance in phrase
                board = board.substring(0, smallestIndex) + phrase.substring(smallestIndex, smallestIndex + test.length()); //change it from hypen to the character
                if (smallestIndex < board.length()-1){
                    board += board.substring(smallestIndex+1);
                } 
                phrase = phrase.substring(smallestIndex+1); //shorten phrase
            }
        }
        return board;
    }
    
    public void hangmanPrinter(String board){
        int charCounter = 0;
        for (int i = 0; i<board.length(); i++){
            System.out.print("" + board.charAt(i));
            
            
            
        }
    }
    
    public int wordCount(String s){
        int wordCount = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == ' '){
                wordCount++;
            }
        }
        return wordCount;
    }
    
    public String[] toWords(String[] phraseWords, String phrase){
        int wordCounter = 0;
        for (int i = 0; i<phrase.length(); i++){
            if (!(phrase.charAt(i) == ' ')){
                phraseWords[wordCounter] += phrase.charAt(i);
            } else {
                wordCounter++;
            }
        }
        return phraseWords;
    }
    
    
    public void ascendAnimation(){
        try {
            Thread.sleep(30);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        for (int i=0; i<10; i++){
            try {
                System.out.println("|       |       |       |       |       |       |       |");
                Thread.sleep(15);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
    public void typeWriter (String text){
        for (int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            if(text.charAt(i) == '!' || text.charAt(i) == '?'){
                try{
                    Thread.sleep(120);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            } else  if (text.charAt(i) == '.'){
                try {
                    Thread.sleep(400);
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
    }
}