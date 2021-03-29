import java.io.*;

public class Test9 {
    public static void main(String[] args) throws Exception{
        //1.定义源文件的路径
        File sourcefile = new File("C:/test/demo.txt");
        if (!sourcefile.exists()){
            System.out.println("源文件不存在");
            System.exit(1);
        }
        //2.定义目标文件的路径
        File targetfile = new File("C:/test2/demo2.txt");
        if (!targetfile.getParentFile().exists()){
            targetfile.getParentFile().mkdirs();
        }
        //3.实现文件内容的复制，分别定义输出流和输入流对象
        InputStream input = new FileInputStream(sourcefile);
        OutputStream output = new FileOutputStream(targetfile);
        int temp = 0;
        byte[] data = new byte[1024];
        while ((temp=input.read()) != -1){
            output.write(data,0,temp);
        }
        //4.释放
        System.out.println("复制成功");
        input.close();
        output.close();
    }
}
