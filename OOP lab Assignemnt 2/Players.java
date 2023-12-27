public class Players {
        private Card Player1[] = new Card[4];
        private Card Player2[] = new Card[4];

        public void distributeCards(Deck deck) {
                Card[] cards = deck.getCards();


                deck.shuffle();


                for (int i = 0; i < 4; i++) {
                        Player1[i] = cards[i];
                }


                for (int i = 4; i < 8; i++) {
                        Player2[i - 4] = cards[i];
                }
        }

        public Card[] getPlayer1() {
                return Player1;
        }

        public Card[] getPlayer2() {
                return Player2;
        }

        public void printPlayerCards() {
                System.out.println("Player 1's Cards:");
                for (Card card : Player1) {
                        System.out.println(card);
                }

                System.out.println("\nPlayer 2's Cards:");
                for (Card card : Player2) {
                        System.out.println(card);
                }
        }

}
