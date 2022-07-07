class Solution {
    public boolean isPalindrome(int x) {
        
        
        // time comp =  O(log10​(n)) , space 0(1)
        int newX = x;
        int digit;
        int val=0;
        if(x<0){
            return false;
        }else if(x==0){
            return true;
        }else{
            
            
            
            while(newX!=0){
                
                digit= newX%10;
                val = val*10+digit;
                newX=newX/10;
            
            }
            
            return x==val? true: false;
        }
        
    }
}