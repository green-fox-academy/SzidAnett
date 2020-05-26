package personal_finance;
import java.util.ArrayList;
import java.util.Collections;


public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(500);
        items.add(1000);
        items.add(1250);
        items.add(175);
        items.add(800);
        items.add(120);

        int total = 0;
        int greatestExpense = 0;
        int cheapestSpending = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i);
        }
        int average = total / items.size();
        Collections.sort(items);
        greatestExpense = items.get(items.size()-1);
        cheapestSpending = items.get(0);
        System.out.println("How much did we spend? "+total);
        System.out.println("Which was our greatest expense? "+greatestExpense);
        System.out.println("Which was our cheapest spending? "+cheapestSpending);
        System.out.println("What was the average amount of our spendings? "+average);
    }
}

