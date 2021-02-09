interface Universe{
    void doAnything();
}

class Star{
    private String name = "star";
    public void shine(){
        System.out.println(name+":一闪一闪亮晶晶");
    }
}

class Sun extends Star implements Universe{
    private String name = "sun";
    @Override
    public void doAnything() {
        System.out.println(name+":太阳吸引着9大行星旋转");
    }
}

public class Test9 {
    public static void main(String[] args){
        Star star = new Star();
        star.shine();
        Sun sun = new Sun();
        sun.doAnything();
        sun.shine();
    }
}
