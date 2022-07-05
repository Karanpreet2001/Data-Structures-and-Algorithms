import java.util.HashMap;

class LongestSubstring{


    public static void main(String[] args) {
        
    }
    // abcaabcdba

    public int lengthOfSubstring(String s){

        int length =0;
        int right=0, left=0;


        HashMap<Character, Integer> map = new HashMap<>();

        while(right< s.length()){

            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1, left);
            }

            map.put(s.charAt(right), right);
            length = Math.max(length, right-left+1);
            right++;
        }


        return length;

    }

}