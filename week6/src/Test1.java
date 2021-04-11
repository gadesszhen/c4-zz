import com.mysql.jdbc.Driver;
import org.junit.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 {
    Connection conn = null;  //声明连接
    //添加
    @Before
    public void init() throws Exception{
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库连接对象
        conn = DriverManager.getConnection("jdbc:mysql:///test?characterEncoding=utf-8","root","root");
    }
    @Test
    public void insert() throws Exception{
        //定义SQL语句
        String sql = "insert into studengt values ('s001','老大',20,'计算机学院'),('s002','老二',19,'计算机学院'),('s003','老三',18,'计算机学院'),('s004','老四',17,'计算机学院')";
        //实例化对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
        int count = pstmt.executeUpdate();
        System.out.println(count);
    }
    @Test
    public void findAll() throws Exception{
        String sql = "select * from studengt";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            String sno = rs.getString(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            String co = rs.getString(4);
            System.out.println(sno+"--"+name+"--"+age+"--"+co);
        }
    }
    @Test
    public void findOne() throws Exception{
        String sql = "select * from studengt where sno='s003'";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            String sno = rs.getString(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            String co = rs.getString(4);
            System.out.println(sno+"--"+name+"--"+age+"--"+co);
        }
    }
    @Test
    public void update() throws Exception{
        String sql = "update studengt set College = '通信学院' where SNO='s001'";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        int count = pstmt.executeUpdate();
        System.out.println("修改了"+count+"行");
    }
    @After
    public void close() throws Exception{
        conn.close();
    }


}
