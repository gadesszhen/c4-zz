import java.util.Scanner;

abstract class Poultry {
    private String name;
    private String symptom;
    private int age;
    private String illness;

    Poultry() {}

    Poultry(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setSymptom(String s) {
        symptom = s;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setIllness(String i) {
        illness = i;
    }

    public String getIllness() {
        return illness;
    }

    public void showMsg() {
        System.out.println("动物种类：" + name + "，年龄：" + age + "岁");
        System.out.println("入院原因：" + illness);
    }

    public abstract void showSympom(String symptom);

}

class Duck extends Poultry{
    Duck(){};
    Duck(String name, String symptom, int age, String illness) {
        super(name,symptom,age,illness);
    }
    public void showSympom(String symptom){
        System.out.println("症状为："+symptom);
    }
}
public class Test7 {
    public static void main(String[] args){
        Duck duck = new Duck();
        duck.setName("鸭子");
        System.out.println("请输入鸭子的年龄：");
        Scanner in = new Scanner(System.in);
        duck.setAge(in.nextInt());
        System.out.println("请输入入院原因：");
        duck.setIllness(in.next());
        System.out.println("请输入症状：");
        duck.setSymptom(in.next());
        duck.showMsg();
        duck.showSympom(duck.getSymptom());
    }
}
