import java.util.*;
public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int totalMoney;
    private int amountBet;

    public Player(String playerName, Deck deck, int total, int bet){
        this.name = playerName;
        this.hand = new ArrayList<>();
        this.totalMoney = total;
        this.amountBet = bet;
        for (int i = 0; i<5; i++){
            this.hand.add(deck.deal());
        }
    }
    public String getName(){
         return this.name;
    }
    public ArrayList<Card> getHand(){
        return this.hand;
    }
    public void changeHand(int index, Player p, Deck d){
        p.getHand().set(index, d.deal());
    }
    public int placeBet(int betAmount){
        amountBet = betAmount;
        return amountBet;
    }
    public int getBet(){
        return this.amountBet;
    }
    public int winnerAddUp(int a1,int a2, int a3){
        return a1+a2+a3;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }
}