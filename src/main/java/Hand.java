import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cardList;

    public Hand(){
        cardList  = new ArrayList<>();
    }

    public void add(Card card){
        cardList.add(card);
    }

    public void print(){
        for (Card x: cardList){
            System.out.println(x);
        }
    }

    public void sort(){
        Collections.sort(cardList);
    }

    public void sortBySuit(){

        Collections.sort(cardList, new BySuitInValueOrder());
    }

    public int totalValue(){
        return cardList.stream()
                .map(card -> card.getValue())
                .collect(Collectors.summingInt(i->i));
    }

    @Override
    public int compareTo(Hand o) {
        return this.totalValue()  - o.totalValue();
    }
}
