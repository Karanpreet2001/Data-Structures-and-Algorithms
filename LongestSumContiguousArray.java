public class LongestSumContiguousArray {
    

    public static void main(String[] args) {
        int[] a= {-3}; 
        int sum = maxSumArray1(a);
        System.out.println(sum+"");
    }

     // time complexity - O(N^2), space = O(1)
     public static int maxSumArray1(int a[]){

        int maxSum=a[0];
        
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j < a.length; j++) {
                sum= sum + a[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }



    // Kadane's Algorithm - time complexity - O(N), space = O(1)
    public static int maxSumArray2(int a[]){

        int maxSum=a[0];
        int currSum = 0;
        
        for (int i = 0; i < a.length; i++) {
            
            currSum =currSum+a[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }

        }
        return maxSum;
    }
}
