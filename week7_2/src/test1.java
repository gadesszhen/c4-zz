import java.util.*;

public class test1 {
    public static void main(String[] args) {
        int[] num1 = new int[20];
        int[] num2 = new int[50];
        Scanner sc = new Scanner(System.in);
        String nums1 = sc.next();
        num1 = nums1.chars().toArray();
        String nums2 = sc.next();
        num2 = nums2.chars().toArray();


        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<num2.length;i++){
            if (!stack.isEmpty()){
                while (!stack.isEmpty() && num2[i]>stack.peek()){
                    map.put(stack.peek(),num2[i]);
                    stack.pop();
                }
            }
            stack.push(num2[i]);
        }

        int[] res = new  int[num1.length];
        for (int i = 0; i<num1.length;i++){
            res[i] = map.getOrDefault(num1[i],-1);
        }

        System.out.println(Arrays.toString(res));
    }
}
