public class BuyAndSellStockI {
    

    public static void main(String[] args) {
        int[] a= {7,1,5,3,6,4};
        int result = buyAndSell2(a);
        System.out.println(result+"");

    }

    // time complexity - 0(N^2) , Space Complexity - 0(1)
    public static int buyAndSell(int[] a){

        int profit=0;
        for (int i = 0; i < a.length; i++) {
            
            for (int j = i; j < a.length; j++) {
                
                if(profit < a[j]-a[i]){
                    profit = a[j]-a[i];
                }
            }
        }
        return profit;
    }

        // time complexity - 0(N) , Space Complexity - 0(1)
        public static int buyAndSell2(int[] a){

        // int[] a= {7,1,5,3,6,4};

            int maxProfit=0;
            int minSoFar= a[0];

            for (int i = 0; i < a.length; i++) {
                minSoFar = Math.min(minSoFar, a[i]);
                int profit = a[i] - minSoFar;
                maxProfit = Math.max(maxProfit, profit);
                
            }
            return maxProfit;
        }


   
}
