

public class Longestprefix {
    
    public static void main(String[] args) {
       
    }

    public static String findPrefix(String[] str){

        if(str.length ==0) return "";
        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            while(str[i].indexOf(prefix) !=0 ){
                prefix = prefix.substring(0, prefix.length()-1);
            }

        }
        return prefix;
    }
}
