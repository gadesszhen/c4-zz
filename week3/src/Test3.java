import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
    public static void main(String args[]){
        System.out.println("Please input your string:");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] ch = s.toCharArray();
        HashSet<Character> c = new HashSet<Character>();
        for (int i=0;i<ch.length;i++){
            c.add(ch[i]);
        }
        for(char k:c){
            System.out.print(k);
        }
    }
}
