import java.util.Scanner;

public class Test3 {
    public static void main(String args[]){
        System.out.println("Please input your float number:");
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        System.out.println("The answer is:"+fenshu(d));
    }

    public static String fenshu(double d) {
        String[] split = String.valueOf(d).split("\\.");//将输入的小数以小数点为标志分离
        int a = Integer.parseInt(split[0]);//获取整数部分
        int b = Integer.parseInt(split[1]);//获取小数部分
        int length = split[1].length();//获取小数部分长度
        int fenzi = (int)(a * Math.pow(10,length) + b);
        int fenmu = (int)(Math.pow(10,length));

        int maxgys = gys(fenzi,fenmu);
        return (fenzi/maxgys)+"/"+(fenmu/maxgys);
    }

    public static int gys(int x,int y){
        if (x==0){
            return y;
        }
        return gys(y%x,x);
    }
}
