import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test4 {
    public static void main(String args[]){
        Map<Character,Integer> m = new HashMap<>();
        System.out.println("Please input the string:");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if (m.containsKey(c)){
                m.put(c,1+m.get(c));
            }else {
                m.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> each:m.entrySet())
        {
            char c = each.getKey();
            int i = each.getValue();
            System.out.println(c+": "+i);
        }
    }
}
