public class RainTrappingProblem {
    

    public static int rainWater(int a[]){

        int n = a.length;
        int ans = 0;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = a[0];

        for (int i = 0; i < left.length; i++) {
            left[i] = Math.max(left[i-1], a[i]);
        }

        right[n-1] = a[n-1];
        for (int i = n-2; i >= 0; i++) {
            right[i] = Math.max(right[i+1], a[i]);
        }

        for (int i = 0; i < n ; i++) {
            ans += Math.min(left[i], right[i]);
        }

        return ans;
    }
}












