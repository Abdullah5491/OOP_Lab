import java.util.Arrays;

public class Deck {
    String Suit[] = {"Heart", "Diamond", "Clubs", "Tiles"};
    String Rank[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "king"};
    Card C1[] =new Card[52];

    int counter=0;

    @Override
    public String toString() {
    StringBuilder str= new StringBuilder();
    for (int i=0;i<52;i++)
    str.append(C1[i]);
        return String.format("%s",str);
    }

    Deck(){

        for(int i=0; i<4; i++){
            for(int j=0;j<13;j++){
                C1[counter++]= new Card(Suit[i],Rank[j]);
            }
    }



    }






}

