abstract class A{
    private int numa=10;
    public int getNuma(){
        return numa;
    }
    public abstract void showA();
}
abstract  class B extends A{
    private int numb=20;
    public int getNumb(){
        return numb;
    }
    public abstract void showB();
}
class C extends B{
    private int numc=30;
    public void showA(){System.out.println("A类中numa："+super.getNuma());}
    public void showB(){System.out.println("B类中numb："+super.getNumb());}
    public void showC(){System.out.println("C类中numc："+numc);}
}

public class Test8 {
    public static void main(String[] args){
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
