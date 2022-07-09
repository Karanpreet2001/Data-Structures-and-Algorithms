public class SqrtOfX {
    

    public static void main(String[] args) {
        int n = sqrtOfX2(7);
        System.out.println(n+"");
    }

    // Time complex= O(N) , space complexity = O(1)
    public static int sqrtOfX1(int x){

        int i=1;
        while(i*i <= x){
            i++;
        }
        return i-1;
    }

    // Time complex= O(logN) , space complexity = O(1) ---Binary Search
    public static int sqrtOfX2(int x){

        if( x==0 || x==1){
            return x;
        }

        int low = 1, high = x, ans =- 1;

        while(low <= high){

            int mid = (low+high)/2;
            int sqr = mid*mid;

            if(sqr == x){
                return mid;
            }else if(sqr < x){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
    }
}
