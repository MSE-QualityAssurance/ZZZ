import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private List<Player> players;
    private Map<String, List<Card>> supply; // The supply piles of cards
    private int currentPlayerIndex;

    public Game(int numberOfPlayers) {
        players = new ArrayList<>();
        supply = new HashMap<>();
        currentPlayerIndex = 0;

        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player());
        }

        // Initialize the supply here
        // For example, add different types of cards to the supply
    }

    // Start the game
    public void start() {
        // Game starting logic goes here
        // For example, initial card distribution to players, etc.
    }

    // Proceed to the next player's turn
    public void nextTurn() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        // Additional turn setup logic can be added here
    }

    // Get the current player
    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    // Method to handle buying a card from the supply
    public void buyCard(String cardName, Player player) {
        List<Card> pile = supply.get(cardName);
        if (pile != null && !pile.isEmpty()) {
            Card card = pile.remove(pile.size() - 1);
            player.discard(card); // Assuming the card goes directly to the discard pile
            // Additional logic for payment and validation of the buy can be added
        }
    }

    // Additional methods for game logic can be added here
    // For example, checking for game end conditions, scoring, etc.
}
