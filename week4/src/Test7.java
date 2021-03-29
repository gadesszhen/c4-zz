import java.util.*;

public class Test7 {
    public static void main(String[] args){
        System.out.println("Please input the number of your patterns:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Please input your patterns:");
        String[] p = new String[n];
        for (int i=0;i<n;i++){
            p[i] = in.next();
        }
        List<List<String>> result = goup(p);
        for (List<String> list:result){
            System.out.println(list);
        }
    }

    private static List<List<String>> goup(String[] p) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (int i=0;i<p.length;i++){
            List<String> list = new ArrayList<>();
            String temp = p[i]; //记录排序之前的值

            char[] chars = p[i].toCharArray();
            Arrays.sort(chars);
            p[i] = new String(chars); //得到排序之后的字符串

            //将会排序之后的字符串作为key存放人map中，如果是字母异位词，他们会有相同的key
            if (!map.containsKey(p[i])){
                list.add(temp); //将异位单词逐个放入list，list即为value
                map.put(p[i],list); //list存放人新的单词后再次put会刷新
            }else {
                List<String> newlist = map.get(p[i]);
                newlist.add(temp);
                map.put(p[i],newlist);
            }
        }
        for (List<String> value : map.values()){
            result.add(value); //因为result是存放列表的列表，所以不加入key直接遍历value值添加即可
        }
        return result;
    }
}
