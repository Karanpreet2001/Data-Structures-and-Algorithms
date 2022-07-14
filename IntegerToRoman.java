public class IntegerToRoman {
    
    public static void main(String[] args) {
        System.out.println(toRoman(4));
    }

    public static String toRoman(int n){

        int intCode[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String code[] = {"M", "CM", "D","CD", "C", "XC","L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length; i++) {
            
            while(n >= intCode[i]){
                sb.append(code[i]);
                n -= intCode[i];
            }
        }

        return sb.toString();
    }
}
