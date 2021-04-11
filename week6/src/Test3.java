import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入您想排序的整数（100个以内）：");
        Scanner in = new Scanner(System.in);
        int[] array = new int[100];
        for (int i=0;i<100;i++){
            array[i] = in.nextInt();
        }
        //冒泡排序
        Maopao(array);
        //插入排序
        Charu(array);
        //快速排序
        Kuaisu(array);
    }

    public static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    //冒泡排序
    public static void Maopao(int[] array){
        for (int i=0;i<array.length;i++){
            for (int j=i;j<array.length;j++){
                if (array[j]<array[i]){
                    swap(array, i, j);
                }
            }
        }
        System.out.println(array);
    }

    //插入排序
    public static void Charu(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int min = i;
            for(int j = i+1; j <array.length ;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            if(min!=i){
                swap(array, i, min);
            }
        }
        System.out.println(array);
    }

    //快速排序
    public static void Kuaisu(int[] array){

    }
    //合并排序

    //堆排序
}
