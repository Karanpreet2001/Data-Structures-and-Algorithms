import java.util.HashMap;

class RomanToInteger{


    public static void main(String[] args) {
        
        int val = romToInt("IM");
        System.out.println(val+"");
    }


    //time - O(n), space= O(1)
    public static int romToInt(String s){
        int result = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int len = s.length();
        int left=0, right=0;

        for(int i=0; i<len-1; i++ ){

             left = map.get(s.charAt(i));
             right = map.get(s.charAt(i+1));

            
            if(left >= right){
                result += left;
            }else{
                result -= left;
            }
            
        }

        return result+map.get(s.charAt(len-1));

    }
}
