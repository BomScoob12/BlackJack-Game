package deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
        for (var suit : Suit.values()) {
            for (var rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }
    public List<Card> getCards(){
        return this.cards;
    }

    public int size(){
        return cards.size();
    }

    public Card draw(){
        Card draws = cards.get(cards.size()-1);
        cards.remove(cards.size()-1);
        return draws;
    }

    public List<Card> draw(int count){
        List<Card> draws = new ArrayList<>();
        while (count > 0){
            Card draw = cards.get(cards.size()-1);
            draws.add(draw);
            cards.remove(cards.size()-1);
            count--;
        }
        return draws;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
    public List<Card> getCardByRank(Card card){
        List<Card> newCards = new ArrayList<>();
        for (var listOfCards : cards){
            if (listOfCards.getRank().equals(card.getRank())) {
                newCards.add(listOfCards);
            }
        }
        return newCards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck : ");
        for (var c : cards){
            sb.append(cards).append("\n");
        }
        return sb.toString();
    }
}
