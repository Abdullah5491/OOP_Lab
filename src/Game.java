public class Game {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Players players = new Players();

        players.distributeCards(deck);
        players.printPlayerCards();
    }
}
