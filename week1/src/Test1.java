import java.util.Scanner;

public class Test1 {
    static double BMI(double weight,double high){
        return weight/(high*high);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the weight(kg):");
        double w = in.nextDouble();
        double weight = w;
        System.out.println("Please input the high(m):");
        double h = in.nextDouble();
        double high = h;
        double bmi;
        bmi = BMI(weight,high);
        if(bmi<18.5){
            System.out.println("too light");
        }
        else if(bmi>=18.5 && bmi<25){
            System.out.println("normal");
        }
        else if(bmi>=25 && bmi<28){
            System.out.println("too weighty");
        }
        else if(bmi>=28 && bmi<32){
            System.out.println("fat");
        }
        else if (bmi>=32){
            System.out.println("too fat");
        }
        else{
            System.out.println("input wrong!");
        }

    }

}
