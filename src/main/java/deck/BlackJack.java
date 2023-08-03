package deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlackJack {
    private final Deck deck;
    private List<Card> playerHand;
    private List<Card> dealerHand;

    public BlackJack(){
        this.deck = new Deck();
        deck.shuffle();
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
    }
    public void deal(){
        playerHand.addAll(deck.draw(2));
        dealerHand.addAll(deck.draw(2));
    }

    public List<Card> getPlayerHand() {
        return playerHand;
    }

    public List<Card> getDealerHand() {
        return dealerHand;
    }

    public String printPlayerHand(){
        return playerHand.toString();
    }
    public String printDealerHand(){
        return dealerHand.toString();
    }
    public boolean hitPlayer(){
        playerHand.add(deck.draw());
        return true;
    }
    public boolean hitDealer(){
        Random ran = new Random();
        if (ran.nextDouble() <= 0.5) {
            dealerHand.add(deck.draw());
            return true;
        }
        return false;
    }

    private int getScore(List<Card> deck) {
        int score = 0;
        for(int i = 0; i < deck.size(); i++) {
            score += deck.get(i).getValue();
        }
        return score;
    }
    public int getPlayerScore(){
        int playerScore = 0;
        for (Card player : playerHand) {
            playerScore += player.getValue();
        }
        return playerScore;
    }
    public int getDealerScore(){
        int dealerScore = 0;
        for (Card dealer : dealerHand) {
            dealerScore += dealer.getValue();
        }
        return dealerScore;
    }
    public String determineWinner() {
        int dealerSum = getScore(dealerHand) - 21;
        int playerSum = getScore(playerHand) - 21;
        if (dealerSum < playerSum){
            return "PLAYER WIN";
        } else if (playerSum < dealerSum){
            return "Dealer win";
        } else{
            return "Draw";
        }
    }
}
