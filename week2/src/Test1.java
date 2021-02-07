import java.util.Scanner;

public class Test1 {
    public static void main(String args[]){
        System.out.println("Please input the order of matrix:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Please input the matrix:");
        int[][] a = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix you input is:");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+",");
            }
            System.out.println();
        }
        int[][] b = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                b[i][j] = a[2-j][i];
            }
        }
        System.out.println("the output is:");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(b[i][j]+",");
            }
            System.out.println();
        }
    }
}
