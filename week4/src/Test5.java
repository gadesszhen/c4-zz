import java.util.HashMap;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        System.out.println("Please input your num:");
        Scanner in = new Scanner(System.in);
        String sc = in.next();
        char[] num = sc.toCharArray();
        /*
        HashMap<Character,Integer> m = new HashMap<>();
        for (int i=0;i<num.length-1;i++){
            if (m.containsKey(num[i])){
                int count = m.get(num[i]);
                m.put(num[i],count+1);
            }else {
                m.put(num[i],1);
            }
        }
        for (Character each:m.keySet()){
            if(m.get(each) > num.length/2){
                System.out.println();
            }
        }
        */
        System.out.println(mainnum(num));
    }
    public static char mainnum(char[] num){
        for (int i=0;i<num.length;i++){
            int count = 1;
            for (int j=i+1;j<num.length;j++){
                if (num[j] == num[i]){
                    count++;
                }
            }
            if (count > num.length/2){
                return num[i];
            }
        }
        return '0';
    }
}
