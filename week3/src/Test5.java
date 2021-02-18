public class Test5 {
    public static void main(String args[]){
        System.out.println("1.除法计算开始");
        try {
            System.out.println("2. 除法计算："+(10/0));
        }catch (ArithmeticException e){
            System.out.println("出现异常");
        }
        System.out.println("3.计算结束");
    }
}
