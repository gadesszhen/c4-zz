import java.util.Scanner;

public class Test1 {
    public static void main(String args[]){
        System.out.println("Please input your string:");
        Scanner in = new Scanner(System.in);
        String s = in.next();   //输入原字符串
        System.out.println("Please input your pattern:");
        String p = in.next();  //输入子串
        System.out.println("The seat of the pattern is "+same(s,p));  //输出结果
    }
    public static int same(String string,String pattern){
        for (int i=0;i<=string.length()-pattern.length();i++){
            if(string.charAt(i) == pattern.charAt(0)){     //在原字符串中找到子串的首字母
                if (string.substring(i, i + pattern.length()).equals(pattern)) {   //字符串匹配
                    return i;
                }
            }
        }
        return -1;
    }
}
