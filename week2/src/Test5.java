class Monkey{
    String s;
    Monkey(String s){
        this.s = s;
    }
    public void speak(){
        System.out.println("咿咿呀呀...");
    }
}
class People extends Monkey{

    People(String s) {
        super(s);
    }
    public void speak(){
        System.out.println("小样的，不错嘛！");
    }
    public void think(){
        System.out.println("别说话！认真思考！");
    }
}

public class Test5 {
    public static void main(String[] args){
        Monkey monkey = new Monkey("mm");
        monkey.speak();
        People people = new People("pp");
        people.speak();
        people.think();
    }
}
