import java.util.*;
public class Poker {
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        boolean play = true;
        titlePrint();
        while(play){
            String[]ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
            String[]suits = {"H", "C", "D", "S"};
            int[]values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
            Deck d1 = new Deck(ranks, suits, values);
            d1.shuffle();

            System.out.println("enter the first player's name: ");
            String p1 = console.next();
            System.out.println("enter the amount of money you wish to bet on this round: ");
            int bet1 = console.nextInt();
            Player player1 = new Player(p1, d1, 0, bet1);

            System.out.println("enter the second player's name: ");
            String p2 = console.next();
            System.out.println("\nenter the amount of money you wish to bet on this round: ");
            int bet2 = console.nextInt();
            Player player2 = new Player(p2, d1,0,bet2);


            System.out.println("enter the third player's name: ");
            String p3 = console.next();
            System.out.println("\nenter the amount of money you wish to bet on this round: ");
            int bet3 = console.nextInt();
            Player player3 = new Player(p3, d1,0,bet3);


            System.out.println("enter the fourth player's name: ");
            String p4 = console.next();
            System.out.println("\nenter the amount of money you wish to bet on this round: ");
            int bet4 = console.nextInt();
            Player player4 = new Player(p4, d1,0,bet4);


            separation();
            System.out.println("\tplayer1's turn");
            System.out.println(player1.getHand());
            System.out.println("are there cards you want to get rid of?");
            String drawCards = console.next();
            if (drawCards.equals("yes")){
                System.out.println("how many? ");
                int numOfCards = console.nextInt();
                for (int i = 0; i<numOfCards; i++){
                    System.out.println("which card(put the index og the card)? ");
                    int index = console.nextInt();
                    player1.changeHand(index, player1, d1);
                }
                System.out.println(player1.getHand());
            }
            separation();
            System.out.println("player2's turn");
            System.out.println(player2.getHand());
            System.out.println("are there cards you want to get rid of?");
            String drawCards2 = console.next();
            if (drawCards2.equals("yes")){
                System.out.println("how many? ");
                int numOfCards = console.nextInt();
                for (int i = 0; i<numOfCards; i++){
                    System.out.println("which card(put the index og the card)? ");
                    int index = console.nextInt();
                    player2.changeHand(index, player2, d1);
                }
                System.out.println(player2.getHand());
            }

            separation();
            System.out.println("player3's turn");
            System.out.println(player3.getHand());
            System.out.println("are there cards you want to get rid of?");
            String drawCards3 = console.next();
            if (drawCards3.equals("yes")){
                System.out.println("how many? ");
                int numOfCards = console.nextInt();
                for (int i = 0; i<numOfCards; i++){
                    System.out.println("which card(put the index og the card)? ");
                    int index = console.nextInt();
                    player2.changeHand(index, player2, d1);
                }
                System.out.println(player3.getHand());
            }



            separation();
            System.out.println("player4's turn");
            System.out.println(player4.getHand());
            System.out.println("are there cards you want to get rid of?");
            String drawCards4 = console.next();
            if (drawCards4.equals("yes")){
                System.out.println("how many? ");
                int numOfCards = console.nextInt();
                for (int i = 0; i<numOfCards; i++){
                    System.out.println("which card(put the index of the card)? ");
                    int index = console.nextInt();
                    player2.changeHand(index, player2, d1);
                }
                System.out.println(player4.getHand());
            }

            separation();
            System.out.println("player1's hand: "+player1.getHand()+"\n");
            System.out.println("player2's hand: "+player2.getHand()+"\n");
            System.out.println("player3's hand: "+player3.getHand()+"\n");
            System.out.println("player4's hand: "+player4.getHand()+"\n");

            System.out.println("\nenter the winner's name: ");
            String winner = console.next();
            if (winner.equals(p1)){
                System.out.println("player1 wins: $"+player1.winnerAddUp(player2.getBet(),player3.getBet(),player4.getBet()));
            }else if (winner.equals(p2)){
                System.out.println("player2 wins: $"+player2.winnerAddUp(player1.getBet(),player3.getBet(),player4.getBet()));
            }else if (winner.equals(p3)){
                System.out.println("player3 wins: $"+player3.winnerAddUp(player2.getBet(),player1.getBet(),player4.getBet()));
            }else{
                System.out.println("player4 wins: $"+player4.winnerAddUp(player2.getBet(),player3.getBet(),player1.getBet()));
            }


            play = false;
        }
    }
    public static void titlePrint(){
        System.out.println("\n\tWELCOME TO:");
        System.out.println("  / \\   |\\  | ----- |-----     ||  || r--j");
        System.out.println(" /---\\  | \\ |   T   |----      ||  || |__|");
        System.out.println("/     \\ |  \\|   |   |_____     \\\\__// |");
        System.out.println("\n\t\t\tPOKER SPIN-OFF\n");
    }
    public static void separation(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("------------------------------------------------------------------------");
    }
}