package csci305.javalab;

import csci305.javalab.element.Element;
import csci305.javalab.element.Outcome;
import csci305.javalab.player.*;

import java.util.Scanner;

public class Main {
    private static Scanner inScan = new Scanner(System.in);
    private static String[] playerNames = { "Human", "Stupid Bot", "Random Bot", "Iterative Bot", "Last Play Bot", "My Bot" };

    public static void main(String[] args){
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Max Weimer.");

        System.out.println("Please choose two players: ");
        for (int i = 0; i < playerNames.length; i++){
            System.out.printf("\t%d : %s%n", i + 1, playerNames[i]);
        }

        Player player1 = promptForPlayer("Select Player 1: ");
        Player player2 = promptForPlayer("Select Player 2: ");

        playRounds(player1, player2);
    }

    private static void playRounds(Player player1, Player player2){
        System.out.printf("%s vs %s.  Go!%n%n", player1.getName(), player2.getName());

        int p1Score = 0;
        int p2Score = 0;
        for (int i = 1; i <= 5; i++){
            System.out.printf("Round %d:%n", i);

            Element p1Elem = player1.play(player2);
            Element p2Elem = player2.play(player1);

            System.out.printf("\tPlayer 1 chose %s%n", p1Elem.getName());
            System.out.printf("\tPlayer 2 chose %s%n", p2Elem.getName());

            Outcome outcome = p1Elem.compareTo(p2Elem);
            System.out.printf("\t%s%n", outcome.getDescription());
            switch (outcome.getResult()){
                case "Win":
                    System.out.println("Player 1 wins the round");
                    p1Score++;
                    break;
                case "Lose":
                    System.out.println("Player 2 wins the round");
                    p2Score++;
                    break;
                default:
                    System.out.println("Tie");
                    break;
            }

            //Fire end round event, lastPlay logic
            player1.endRound();
            player2.endRound();

            System.out.println();
            System.out.println();
        }

        System.out.printf("Score is %d to %d.%n", p1Score, p2Score);
        if (p1Score > p2Score){
            System.out.printf("Player 1 (%s) wins the game%n", player1.getName());
        }
        else if (p1Score < p2Score){
            System.out.printf("Player 2 (%s) wins the game%n", player2.getName());
        }
        else {
            System.out.println("The game was a draw");
        }
    }

    private static Player promptForPlayer(String message){
        int choice = 0;
        while (choice <= 0 || choice > playerNames.length){
            System.out.print(message);
            choice = inScan.nextInt();
        }

        switch (choice){
            case 1: return new Human("Human");
            case 2: return new StupidBot("Stupid Bot");
            case 3: return new RandomBot("Random Bot");
            case 4: return new IterativeBot("Iterative Bot");
            case 5: return new LastPlayBot("Last Play Bot");
            case 6: return new MyBot("My Bot");
        }

        return null;
    }
}
