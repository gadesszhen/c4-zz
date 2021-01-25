import java.util.Scanner;
import java.util.Arrays;
public class Test4 {
     public static void main(String args[]){
          Scanner in = new Scanner(System.in );
          System.out.print("请输入将要输入的数组长度:");
          int n = in.nextInt();
          System.out.print("请输入数组：");
          int[] num = new int[n];
          for(int i=0;i<n;i++){
               num[i] = in.nextInt();
          }
          int[] temp = new int[n];
          int sum0 = 0;
          for(int i=0;i<n;i++){
               if(num[i] != 0){
                    temp[i-sum0] = num[i];
               }else{
                    temp[i] = 0;
                    sum0++;
               }
          }
          System.out.print("移动后的数组为："+Arrays.toString(temp));
     }
}
