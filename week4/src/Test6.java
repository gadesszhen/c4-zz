import java.util.Scanner;
import java.util.Stack;

public class Test6 {
    public static void main(String[] args){
        System.out.println("Please input your string:");
        Scanner in = new Scanner(System.in);
        String s =in.next();
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        if (s.isEmpty()){
            return true;
        }
        if (s.length()%2 == 0){
            Stack<Character> stack = new Stack<>();
            for (char c:s.toCharArray()){
                if (c == '('){
                    stack.push(')');
                }else if (c == '['){
                    stack.push(']');
                }else if (c == '{'){
                    stack.push('}');
                }else if (stack.empty() || c != stack.pop()){
                    return false;
                }
            }
            if (stack.isEmpty()){
                return true;
            }
        }
        return false;
    }
}
