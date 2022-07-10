public class MajorityElementInArray {
    

    public static void main(String[] args) {
        
    }

    // Time complexity - O(N^2), Space complexity - 0(1)
    public static int majorityElement(int[] a){

        int maxCount =0;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                index = i;
            }
        }

        if(maxCount > a.length/2){
            return index;
        }else{
            return -1;
        }

        

    }

    // Moore's Algorithm = Time Complexity = O(N) , space complexity - 0(1)
    public static int majorityElement2(int[] a){

       int ansIndex = 0;
       int count = 1;

    // if there is an majority element it will remain in the end
       for (int i = 1; i < a.length; i++) {
            if(a[i]==a[ansIndex]){
                count++;
            }else{
                count--;
            }

            if(count==0){
                count = 1;
                ansIndex = i;
            }
       }


       int mayAns = a[ansIndex];
       int freq=0;

       for (int i = 0; i < a.length; i++) {
            if(mayAns == a[i]){
                freq++;
            }
       }

       if(freq > a.length/2){
         return mayAns;
       }else{
         return -1;
       }

    }
}
