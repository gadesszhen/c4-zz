import java.util.Scanner;

class Circle{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area=0;
        area = 2 * Math.PI * radius * radius;
        return area;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}

public class Test5 {
    public static void main(String args[]){
        System.out.println("input the radius:");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("the Area of this circle is "+c.getArea()+"and the Perimeter is "+c.getPerimeter());
    }
}