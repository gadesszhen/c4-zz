import java.util.Scanner;

public class Test2 {
    public static void sortString(String[] str){//字符串长度排序
        for(int i=0;i < str.length-1; i++){ //做第i趟排序
            int k=i;
            for (int j=k+1; j<str.length; j++){//内层循环，找到本轮长度最小的字符串
                if (str[j].length() < str[k].length()){
                    k = j;
                }
            }
            if (i != k){
                String temp = str[i];
                str[i] = str[k];
                str[k] = temp;
            }
        }
    }

    public static String find(String[] str){
        if (str.length == 0){//若最短字符串长度为0
            return "";
        }
        String prefix = str[0];
        for (int i=0; i<str.length; i++){
            while (str[i].indexOf(prefix) != 0){//查找与第一个字符相同的字符，如果为0，则全部相同
                prefix = prefix.substring(0,prefix.length()-1);//每次截取的长度减一，再判断
                if (prefix.isEmpty())//如果检索到最后公共前缀为空
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        System.out.print("Please input the length of your array:");
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        System.out.println("Please input your array:");
        String[] str = new String[l];
        for (int i=0;i<l;i++){
            str[i] = in.next();
        }
        sortString(str);
        System.out.println("The output is :"+"\""+find(str)+"\"");

    }
}
