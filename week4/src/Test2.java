import java.util.Scanner;

public class Test2 {
    public static void main(String args[]){
        System.out.println("Please input your string:");
        Scanner in = new Scanner(System.in);
        String sc = in.next();
        System.out.println(seat(sc));
    }

    private static int seat(String sc) {
        /*
        for (int i=0;i<sc.length();i++){
            for(int j=sc.length();j>=0;j--){
                if((sc.charAt(i) == sc.charAt(j)) && (i == j)){
                    return i;
                }
            }
        }
        return -1;
    }

      */
        for (int i = 0; i < sc.length(); i++) {
            if (sc.indexOf(i) == sc.lastIndexOf(i)) {
                //正查找和反查找
                return i;
            }
        }
        return -1;
    }
}
