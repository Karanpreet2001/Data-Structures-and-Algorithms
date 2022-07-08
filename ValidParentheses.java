import java.util.Stack;

public class ValidParentheses {
    
    public static void main(String[] args) {
        boolean b = validParentheses("()[]{}");
        System.out.println(b);
    }

    public static boolean validParentheses(String s){


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            else if(s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='(')
                stack.pop();
            else if(s.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{')
                stack.pop();
            else if(s.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='[')
                stack.pop();
            else 
                return false;

        }

        return stack.isEmpty();


    }
}
