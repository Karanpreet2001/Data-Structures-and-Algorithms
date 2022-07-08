public class MergeTwoSortedArray {
    


    public void mergeArray(int[] a, int[] b, int m , int n){

        int p1 = m-1, p2=n-1, i=m+n-1;


        while(p2>=0){

            if(p1>=0 && a[p1] > b[p2]){
                a[i--]= a[p1--];
            }else{
                a[i--]= b[p2--];
            }
        }

    }
}
