import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        System.out.println("Please input the string: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.trim();
        String str2 = "";
        if (str != null && !"".equals(str)){
            for (int i=0;i<str.length();i++){
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    str2+=str.charAt(i);
                }
            }
        }
        System.out.println(str2);
    }
}
