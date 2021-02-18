import java.util.ArrayList;
import java.util.List;

class Employee{
    private int Id;
    private String name;
    private int salary;
    private int ManagerId;
    public int getId() {
        return Id;
    }
    public void setId(int i) {
        Id = i;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int s) {
        salary = s;
    }
    public int getManagerId(){
        return ManagerId;
    }
    public void setManagerId(int m){
        ManagerId = m;
    }
    Employee(int Id,String name,int salary,int ManagerId){
        this.Id = Id;
        this.name = name;
        this.salary = salary;
        this.ManagerId = ManagerId;
    }
    Employee(int Id,String name,int salary){
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }
}

public class Test2 {
    public static void main(String args[]) {
        List<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee(1, "Joe", 70000, 3);
        Employee e2 = new Employee(2, "Henry", 80000, 4);
        Employee e3 = new Employee(3, "Sam", 60000);
        Employee e4 = new Employee(4, "Max", 90000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        for (Employee e:list) {
            System.out.println("| "+e.getId()+" | "+e.getName()+" | "+e.getSalary()+" | "+e.getManagerId());
        }
    }
}
