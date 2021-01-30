class Animal{
    protected double high;
    protected double weight;
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
class Rabbit extends Animal{
    public Rabbit(){
        super.high=0.1;
        super.weight=5;
        System.out.println("rabbit: high is "+high+",and weight is "+weight);
    }
    public void eat(){
        System.out.println("eat grass");
    }
    public void sleep(){
        super.sleep();
    }
}
class Tiger extends Animal{
    public Tiger(){
        super.high=1.5;
        super.weight=80;
        System.out.println("tiger: high is " +high+",and weight is "+weight);
    }
    public void eat(){
        System.out.println("eat meat");
    }
    public void sleep(){
        super.sleep();
    }
}
public class Test {
    public static void main(String arg[]){
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.sleep();
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

    }
}
