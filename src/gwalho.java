import java.util.Stack;

public class gwalho {
    public static void main(String[] args) {
        String s = "()()";

        Stack<Character> stack = new Stack<>();

        for(char a : s.toCharArray()) {
            if(a == ')') {
                try {
                    stack.pop();
                }catch(Exception e) {
                }
            } else {
                stack.push(a);
            }
            System.out.println(stack);
        }
    }
}
