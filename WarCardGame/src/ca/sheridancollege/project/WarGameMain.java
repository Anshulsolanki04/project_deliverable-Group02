package ca.sheridancollege.project;
import java.util.Scanner;


 // Main class to run the War card game.
public class WarGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1 Name: ");
        String player1Name = scanner.nextLine().trim();
        while (player1Name.isEmpty()) {
            System.out.print("Invalid input. Enter Player 1 Name: ");
            player1Name = scanner.nextLine().trim();
        }

        System.out.print("Enter Player 2 Name: ");
        String player2Name = scanner.nextLine().trim();
        while (player2Name.isEmpty()) {
            System.out.print("Invalid input. Enter Player 2 Name: ");
            player2Name = scanner.nextLine().trim();
        }

        WarPlayer player1 = new WarPlayer(player1Name);
        WarPlayer player2 = new WarPlayer(player2Name);

        WarGame game = new WarGame("War", player1, player2);
        game.play();
    }
}


