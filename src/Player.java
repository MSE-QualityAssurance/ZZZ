import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> deck;
    private List<Card> hand;
    private List<Card> discardPile;
    private int actions;
    private int buys;
    private int coins;

    public Player() {
        this.deck = new ArrayList<>();
        this.hand = new ArrayList<>();
        this.discardPile = new ArrayList<>();
        this.actions = 1; // default values for a turn
        this.buys = 1;
        this.coins = 0;
    }

    // Draw a number of cards from the deck
    public void draw(int numberOfCards) {
        for (int i = 0; i < numberOfCards; i++) {
            if (deck.isEmpty()) {
                // Shuffle discard pile and add to deck
                // Implement the shuffle logic here
            }
            if (!deck.isEmpty()) {
                hand.add(deck.remove(0)); // Draws the top card
            }
        }
    }

    // Add a card to the discard pile
    public void discard(Card card) {
        discardPile.add(card);
    }

    // Getters and setters for actions, buys, and coins
    public int getActions() {
        return actions;
    }

    public void setActions(int actions) {
        this.actions = actions;
    }

    public int getBuys() {
        return buys;
    }

    public void setBuys(int buys) {
        this.buys = buys;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    // Additional methods for player actions can be added here
    // For example, playCard, buyCard, etc.
}
