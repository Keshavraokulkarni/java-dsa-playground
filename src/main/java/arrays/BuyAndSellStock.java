package arrays;

public class BuyAndSellStock {

    private static int maxProfit(int[] arr) {
        int minPrice = arr[0];
        int maxProfit = 0;

        for(int price: arr) {
            if(price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit,price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int profit = maxProfit(arr);
        System.out.println("Total profit booked:"+profit);
    }
}
