import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        System.out.println("Please input your num:");
        Scanner in = new Scanner(System.in);
        String sc = in.next();
        char[] num = sc.toCharArray();
        selectSort(num);
        System.out.println("Please input the seat of your want:");
        int seat = in.nextInt();
        System.out.println(num[seat-1]);
    }

    public static void selectSort(char[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j <arr.length ;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                swap(arr, i, min);
            }
        }
    }

    public static void swap(char[] arr,int a,int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
