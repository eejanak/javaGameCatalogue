import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println("Welcome to the game catalogue!\n");

        playGame();
    }

    public static void playGame() {
        String[] test = new String[0];

        Scanner console = new Scanner(System.in);

        System.out.println("Which game would you like to play?");
        System.out.println("Type \"h\" for hangman, \"p\" for poker, and \"c\" for checkers.");

        String game = console.nextLine();
        if (game.equals("h")) {
            hangman.main(test);
        } else if (game.equals("p")) {
            Poker.main(test);
        } else if (game.equals("c")) {
            checkers.main(test);
        } else {
            System.out.println("You did not pick a game properly.");
            playGame();
        }
    }
}
