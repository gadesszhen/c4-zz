import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //设置矩阵
        Scanner in = new Scanner(System.in);
        System.out.println("Your matrix has how many rows?");
        int rows = in.nextInt();
        System.out.println("Your matrix has how many lines?");
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrix[i][j] = in.nextInt();
            }
        }

        //遍历矩阵
        List<Integer> res = new ArrayList<>();
        int left=0,right=columns-1,top=0,bottom=rows-1;
        while (left<=right && top<=bottom){
            //按层次遍历，从左到右依次遍历
            for (int column=left;column<=right;column++){
                res.add(matrix[top][column]);
            }
            //一层遍历完之后，最右列从上到下依次遍历
            for (int row=top+1;row<=bottom;row++){
                res.add(matrix[row][right]);
            }
            if (left<right && top<bottom){
                //下层，从右到左依次遍历
                for (int column=right-1;column>left;column--){
                    res.add(matrix[bottom][column]);
                }
                //左侧，从下到上依次遍历
                for (int row=bottom;row>top;row--){
                    res.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        System.out.println(res);
    }
}
