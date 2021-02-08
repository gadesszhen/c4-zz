import java.util.Scanner;

class Vehicle{
    private int wheels;
    private double weight;
    public void setWheels(int wh){
        wheels = wh;
    }
    public int getWheels(){
        return wheels;
    }
    public void setWeight(double we){
        weight = we;
    }
    public double getWeight(){
        return weight;
    }
    public void output(){
        System.out.println("车轮的个数是："+wheels+" 车重： "+weight);
    }
}

class Car extends Vehicle{
    private int loader;
    public void setLoader(int l){
        loader = l;
    }
    public int getLoader(){
        return loader;
    }
    public void output(){
        super.output();
        if (loader >  0 && loader < 6){
            System.out.println("这是一辆小车，能载6人，实载"+loader+"人");
        }else {
            System.out.println("这是一辆小车，能载6人，实载"+loader+"人,你超员了！！");
        }
    }

}
class Truck extends Vehicle{
    private double payload;
    private int loader;
    public void setLoader(int l){
        loader = l;
    }
    public int getLoader(){
        return loader;
    }
    public void setPayload(double p){
        payload = p;
    }
    public double getPayload(){
        return payload;
    }
    public void output(){
        super.output();
        if (loader<3){
            System.out.println("这是一辆卡车，能载3人，实载"+loader+"人");
        }else {
            System.out.println("这是一辆卡车，能载3人，实载"+loader+"人，你超员了！！");
        }
        if (payload < 5000){
            System.out.println("这是一辆卡车，核载5000kg，你已装载"+payload+"kg");
        }else {
            System.out.println("这是一辆卡车，核载5000kg，你已装载"+payload+"kg，你超载了！！");
        }
    }
}

public class Test6 {
    public static void main(String[] args){
        Car car = new Car();
        Truck truck = new Truck();
        System.out.println("请输入车轮数量（4或6）：");
        Scanner in = new Scanner(System.in);
        int wheels = in.nextInt();
        System.out.println("请输入车重：");
        double weight = in.nextDouble();
        System.out.println("请输入装载人数：");
        int loader = in.nextInt();
        if (wheels == 4){
            car.setWheels(wheels);
            car.setWeight(weight);
            car.setLoader(loader);
            car.output();
        }else {
            truck.setWheels(wheels);
            truck.setWeight(weight);
            truck.setLoader(loader);
            System.out.println("请输入装载重量：");
            double payload = in.nextDouble();
            truck.setPayload(payload);
            truck.output();
        }

    }
}
