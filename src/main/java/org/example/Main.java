package org.example;

import deck.*;


public class Main {
    public static void main(String[] args) {
//        testRank();
//        testSuit();
//        testCard();
//        testDeck();
        testBlackJack();
    }

    private static void testRank(){
        for (var ranks : Rank.values()){
            System.out.println(ranks);
        }
    }
    private static void testSuit(){
        for (var suits : Suit.values()){
            System.out.println(suits);
        }
    }
    private static void testCard(){
        Card cd1 = new Card(Rank.ACE,Suit.CLUBS);
        Card cd2 = new Card(Rank.FIVE,Suit.HEARTS);
        Card cd3 = new Card(Rank.NINE,Suit.SPADES);
        Card cd4 = new Card(Rank.QUEEN,Suit.SPADES);
        Card cd5 = new Card(Rank.JACK,Suit.DIAMONDS);
        System.out.printf("ob1 Rank : %s , Suit : %s \n",cd1.getRank(),cd1.getSuit());
        System.out.printf("ob2 Rank : %s , Suit : %s \n",cd2.getRank(),cd2.getSuit());
        System.out.printf("ob3 Rank : %s , Suit : %s \n",cd3.getRank(),cd3.getSuit());
        System.out.printf("ob4 Rank : %s , Suit : %s \n",cd4.getRank(),cd4.getSuit());
        System.out.println(cd1.equals(cd2));
    }
    private static void testDeck(){
        Deck decks = new Deck();
        System.out.println(decks.getCards());
        System.out.println("-----------------------");
        System.out.println(decks.size());
        System.out.println(decks.draw());
        System.out.println(decks.draw());
        System.out.println(decks.draw());
        System.out.println(decks.draw());
    }
    private static void testBlackJack(){
        var game1 = new BlackJack();
        game1.deal();
        game1.getPlayerHand().forEach(System.out::println);
        game1.getDealerHand().forEach(System.out::println);

        System.out.println(game1.determineWinner());
    }
}