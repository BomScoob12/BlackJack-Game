package deck;

public enum Suit {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private String symbol;

    Suit (String symbol){
        this.symbol = symbol;
    }
}
