import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test8 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:/test/demo.txt"); //添加文件对象，输入文件对象的路径
        //读取文件
        InputStream input = new FileInputStream(file);
        byte[] data = new byte[1024]; //建立数组
        int foot = 0;
        int temp = 0;
        while ((temp=input.read())!=-1){
            data[foot] = (byte) temp;
            foot ++;
        }

        //将读取到的文件内容转换为字符串类型
        String str = new String(data,0,foot);
        //计算有多少个2021
        String[] split = str.split("csa"); //观察文件特点，以csa为分隔符分离2021
       System.out.println(split.length); //输出分割后的个数即为2021的个数

        input.close();//关闭输入流
    }
}
