import java.util.Scanner;

class Account{
    private String name;
    private double balance;
    public void setName(String n){
        name = n;
    }
    public void setBalance(double b){
        if(b>0.0){
            balance = b;
        }
    }
    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public void getInfo(){
        System.out.println("账户名称："+name);
        System.out.println("账户余额："+balance);
    }
}
public class Test6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入账户名称：");
        String name = in.nextLine();
        System.out.println("请输入账户余额：");
        double balance = in.nextDouble();
        Account account = new Account();
        account.setName(name);
        account.setBalance(balance);
        account.getInfo();
    }
}
