import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int max_profit=0;
        int buy_price=prices[0];
        for(int i=0;i<n;i++)
        {
            int cur_profit=prices[i]-buy_price;
            if(cur_profit>max_profit)
            {
                max_profit=cur_profit;
            }
            if(prices[i]<buy_price) {
                buy_price=prices[i];
            }
        }return max_profit;
    }
}