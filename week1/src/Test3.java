import java.util.Scanner;

public class Test3 {
    static String Back(String s){
        char[] sc = s.toCharArray();
        int first = 0;
        int last = sc.length - 1;
        while(first<last){
            char temp = sc[first];
            sc[first] = sc[last];
            sc[last] = temp;
            first++;
            last--;
        }
        return new String(sc);
    }
    public static void main(String args[]){
        System.out.print("Please input a sentence:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = Back(s);
        System.out.println("The output is:"+s);
    }
}
