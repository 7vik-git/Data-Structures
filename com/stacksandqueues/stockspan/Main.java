package stacksandqueues.stockspan;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = StockSpan.calculateSpan(prices);
        System.out.println(Arrays.toString(result));
    }
}

