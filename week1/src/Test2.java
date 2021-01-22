public class Test2 {
    public static void main(String args[]){
        int num=0;
        for(int i=100;i<1000;i++){
            int a = i%10;
            int b = i%100/10;
            int c = i/100;
            if(i == Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
                System.out.println(i);
                num++;
            }
        }
        System.out.println("1000以内的水仙花数有"+num+"个");
    }
}
