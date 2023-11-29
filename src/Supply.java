import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Supply {
    private Map<String, Stack<Card>> piles;

    public Supply(List<Card> availableCards) {
        piles = new HashMap<>();

        // Initialize piles with available cards
        for (Card card : availableCards) {
            String cardName = card.getName();
            if (!piles.containsKey(cardName)) {
                piles.put(cardName, new Stack<>());
            }
            piles.get(cardName).push(card);
        }
    }

    // Method to get a card from a specific pile
    public Card getCard(String cardName) {
        Stack<Card> pile = piles.get(cardName);
        if (pile != null && !pile.isEmpty()) {
            return pile.pop();
        }
        return null; // Or handle this case differently
    }

    // Method to check if a specific pile is empty
    public boolean isPileEmpty(String cardName) {
        Stack<Card> pile = piles.get(cardName);
        return pile == null || pile.isEmpty();
    }

    // Method to check if the supply is empty (could be a game-ending condition)
    public boolean isSupplyEmpty() {
        for (Stack<Card> pile : piles.values()) {
            if (pile.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    // Additional methods can be added as needed
    // For example, methods to add cards to piles, to check the number of cards left, etc.
}
