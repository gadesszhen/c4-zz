import java.util.Scanner;
import java.util.Stack;

public class test2 {
    public static void main(String[] args) {
        int[] pushed = new int[20];
        int[] poped = new int[20];

        Scanner sc = new Scanner(System.in);
        String push = sc.next();
        String pop = sc.next();
        pushed = push.chars().toArray();
        poped = pop.chars().toArray();

        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i=0; i<pushed.length;i++){
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek()==poped[j]){
                stack.pop();
                j++;
            }
        }
        System.out.println(stack.empty());
    }
}
