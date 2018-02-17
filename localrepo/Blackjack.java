import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {


        //creating new variables and establishing scanner and random generator
        P1Random rng = new P1Random();
        Scanner scnr = new Scanner(System.in);
        int dealerHand;
        int cardNumber;
        double menuInput = 1;
        int gameNumber = 1;
        int playerHand = 0;
        int playerWins = 0;
        int dealerWins = 0;
        int tieNumber = 0;
        double winPercentage;
        int totalGames;
        int loop = 1;


        //Game 1 output
        System.out.println("START GAME #" + gameNumber + "\n");

        /*entire program is in one while loop; menu options are each their own if else statement
        with other possible if else statements in them*/
        while  (loop == 1) {


            if (menuInput == 1) {
                /*this menu option happens at least once upon program start up and repeats every time
                option one is selected
                (also it should be an ace and an eight but Zybooks would not accept this*/


                //card number is generated and depending on the card follows an if else statement
                //if over ten it is turned back into ten for the hand number
                cardNumber = rng.nextInt(13) + 1;
                if (cardNumber == 1) {
                    System.out.println("Your card is a ACE!");
                }
                else if (cardNumber <= 10) {
                    System.out.println("Your card is a " + cardNumber + "!");
                }
                else if (cardNumber == 11) {
                    cardNumber = 10;
                    System.out.println("Your card is a JACK!");
                }
                else if (cardNumber == 12) {
                    cardNumber = 10;
                    System.out.println("Your card is a QUEEN!");
                }
                else if (cardNumber == 13) {
                    cardNumber = 10;
                    System.out.println("Your card is a KING!");
                }


                //no matter the card number the hand number is given
                playerHand = playerHand + cardNumber;
                System.out.println("Your hand is: " + playerHand + "\n");


                //possible next steps after a card is dealt
                if (playerHand == 21) {
                    //what happens when if the player reaches 21 without a dealer hand being dealt
                    System.out.println("BLACKJACK! You win!\n");
                    playerWins++;
                    gameNumber++;
                    System.out.println("START GAME #" + gameNumber + "\n");
                    //player hand and menu input reset to start loop over
                    playerHand = 0;
                    menuInput = 1;
                }
                else if (playerHand > 21) {
                    //what happens if a player's hand is over 21 without a dealer hand being dealt
                    System.out.println("You exceeded 21! You lose.\n");
                    dealerWins++;
                    gameNumber++;
                    System.out.println("START GAME #" + gameNumber + "\n");
                    //player hand and menu input reset to start loop over
                    playerHand = 0;
                    menuInput = 1;
                }
                else {
                    //all other player hand options are given the menu
                    System.out.println("1. Get another card\n2. Hold hand\n3. Print statistics\n4. Exit\n");
                    System.out.print("Choose an option:");
                    menuInput = scnr.nextDouble();
                    System.out.println(" ");
                }
            } //menu option 1 ends


            //menu option 2 starts
            else if (menuInput == 2) {
                //dealer hand is generated and given
                dealerHand = rng.nextInt(11) + 16;
                System.out.println("Dealer's hand: " + dealerHand + "\nYour hand is: " + playerHand + "\n");


                //possible options after dealer hand is given (win, tie, and lose)
                if ((dealerHand > 21) || (playerHand > dealerHand)) {
                    /*player wins if dealer's hand is over 21 of if player hand is over dealer hand (option one
                    eliminate the possibility that player hand could be at or over 21)*/
                    System.out.println("You win!\n");
                    playerWins++;
                    gameNumber++;
                    System.out.println("START GAME #" + gameNumber + "\n");
                    //player hand and menu input reset to start loop over
                    playerHand = 0;
                    menuInput = 1;
                }
                else if (playerHand == dealerHand) {
                    //tie when the player and dealer have the same total
                    System.out.println("It's a tie! No one wins!\n");
                    tieNumber++;
                    gameNumber++;
                    System.out.println("START GAME #" + gameNumber + "\n");
                    //player hand and menu input reset to start loop over
                    playerHand = 0;
                    menuInput = 1;
                }
                else {
                    //otherwise dealer wins (all other options have been proven wrong)
                    System.out.println("Dealer wins!\n");
                    dealerWins++;
                    gameNumber++;
                    System.out.println("START GAME #" + gameNumber + "\n");
                    //player hand and menu input reset to start loop over
                    playerHand = 0;
                    menuInput = 1;
                }
            }//option 2 ends


            //option 3 starts
            else if (menuInput == 3) {
                System.out.println("Number of Player wins: " + playerWins);
                System.out.println("Number of Dealer wins: " + dealerWins);
                System.out.println("Number of tie games: " + tieNumber);
                totalGames = gameNumber - 1;
                System.out.println("Total # of games played is: " + totalGames);
                winPercentage = ( (double) playerWins / (double) totalGames ) * 100.0;
                //this turns the integers into doubles so a decimal can be made
                winPercentage = Math.round(winPercentage * 10.0) / 10.0;
                /*The PDF of the project instructions says to make the percent round to one decimal place.
                This line of code does this thanks to stackoverflow user JAY PATEL at
                https://stackoverflow.com/questions/22186778/using-math-round-to-round-to-one-decimal-place
                 */
                System.out.println("Percentage of Player wins: " + winPercentage + "%\n");
                System.out.println("1. Get another card\n2. Hold hand\n3. Print statistics\n4. Exit\n");
                System.out.print("Choose an option:");
                menuInput = scnr.nextDouble();
                System.out.println(" ");
            } //option 3 ends


            //option 4 starts
            else if (menuInput == 4) {
                //by making the variable loop not equal one the loop ends and the program ends
                loop = 2;
            }//option 4 ends


            //all other options (invalid inputs)
            else {
                System.out.println("Invalid input!\nPlease enter an integer value between 1 and 4.\n");
                System.out.println("1. Get another card\n2. Hold hand\n3. Print statistics\n4. Exit\n");
                System.out.print("Choose an option:");
                menuInput = scnr.nextDouble();
                System.out.println(" ");
            }


    }//closes while loop


    }
}
