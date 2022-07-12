public class BuyAndSellStockII {
    

    public static void main(String[] args) {
        int a[] = {7,1,2,5,3,5};
        int r = maxProfit(a);
        System.out.println(r+"");
    }

    // Time Complexity - O(N)  Space complexity - 0(1)
    public static int maxProfit(int[] a){

        int profit=0;

        for (int i = 1; i < a.length; i++) {
            if(a[i] > a[i-1]){
                profit += a[i] - a[i-1];
            }
        }

        return profit;
    }
}
