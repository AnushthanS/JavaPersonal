package cWH;

class Employee{
    int id;
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public void getId(){
        System.out.println(id);
    }
    public void getName(){
        System.out.println(name);
    }
}

public class CustomClaSs {
    public static void main(String[] args) {
        Employee Anush = new Employee(); //Object instantiation
        Anush.id=03;    //Setting properties/attributes
        Anush.name="Anushthan";
        Anush.salary=30;
        /*Using attributes directly
        System.out.println(Anush.id);
        System.out.println(Anush.name);*/

        //Using different methods to run code
        Anush.getName();
        Anush.getId();
        System.out.println(Anush.getSalary());

        Employee Ran= new Employee();
        Ran.id=04;
        Ran.name="Random";
        Ran.salary=15;
        System.out.println(Ran.id);
        Ran.getName();
        System.out.println(Ran.getSalary());
    }
}
