



class LengthOfWord{

    // time - O(n), space - O(1)

    public static void main(String[] args) {
        int len = lengthOfLastWord("Hello wo");
        System.out.println(len+"");
    }

    public static int lengthOfLastWord(String s){
        s = s.trim();
        int newLen=0;
        int len = s.length()-1;

        for (int i = len; i >= 0; i--) {
            if(s.charAt(i)!=' '){
                newLen++;
            }else{
                break;
            }
        }

        return newLen;
    }

}
