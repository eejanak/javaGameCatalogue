import java.util.Scanner;

public class Piece {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        board[4][4] = "B";
        boolean playing = true;
        while (playing) {
            System.out.println("welcome");
            Scanner console = new Scanner(System.in);
            System.out.println("row");
            int row = console.nextInt();
            System.out.println("col");
            int col = console.nextInt();

            System.out.println("where would you like to move");
            int move = console.nextInt();
            if (move == 1) {
                board[row][col] = null;
                row--;
                col++;
                board[row][col] = "B";
            } else if (move == 2) {
                board[row][col] = null;
                row--;
                col--;
                board[row][col] = "B";
            } else if (move == 3) {
                board[row][col] = null;
                row++;
                col--;
                board[row][col] = "B";
            } else if (move == 4) {
                board[row][col] = null;
                row++;
                col++;
                board[row][col] = "B";
            }
            System.out.println(board[row][col]);
        }
    }
}
