class IsPalindrome {
    

    public static void main(String[] args) {
        boolean b = isPalindrome(121);
        System.out.println(b+"");
    }

    public static boolean isPalindrome(int number){


        int newNumber = number;
        int digit=0, val=0;

        if(number<0){
            return false;
        }else if(number ==0){
            return true;
        }else{

            while(newNumber>0){

                digit= newNumber%10;
                val = val*10+digit;
                newNumber= newNumber/10;
                
            }

            if(val==number){
                return true;
            }else{
                return false;
            }
        }
    }
}
