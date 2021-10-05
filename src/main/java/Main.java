import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // test your code here
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Card first = new Card(4,Suit.HEART);
        Card second = new Card(5,Suit.HEART);
        int num  = comparator.compare(first,second);
        System.out.println(num);
    }
}
