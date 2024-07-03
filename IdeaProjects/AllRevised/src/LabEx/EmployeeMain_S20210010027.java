package LabEx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Employee{
    private int employeeID;
    private double basicPay;
    private double allowance;
    private String name;

    private static int objCount = 1;

    public Employee(double basicPay, double allowance, String name) {
        setBasicPay(basicPay);
        setAllowance(allowance);
        this.name = name;
        setEmployeeId();
    }

    public void setEmployeeId() {
        this.employeeID = Employee.objCount;
        Employee.objCount++;
    }

    public int getEmployeeId() {
        return this.employeeID;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateSalary() {
        double salary = getBasicPay() + getAllowance();
        System.out.println("Salary : " + salary);
    }

    public void printDetails() {
        System.out.println("Name : " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Basic pay : " + getBasicPay());
        System.out.println("Allowance : " + getAllowance());
    }
}
class RegularEmployee extends Employee{
    private double hikePercent;

    public RegularEmployee(double basicPay, double allowance, String name, double hikePercent) {
        super(basicPay, allowance, name);
        setHikePercent(hikePercent);
    }

    public double getHikePercent() {
        return hikePercent;
    }

    public void setHikePercent(double hikePercent) {
        this.hikePercent = hikePercent;
    }

    @Override public void calculateSalary(){
        double salary  = getBasicPay() + getBasicPay()*getHikePercent() + getAllowance();
        System.out.println("Regular Salary : "+ salary);
    }

    @Override public void printDetails(){
        super.printDetails();
        System.out.println("Hike percent : "+getHikePercent());
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;

    public PartTimeEmployee(double basicPay, double allowance, String name, int hoursWorked) {
        super(basicPay, allowance, name);
        setHoursWorked(hoursWorked);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override public void calculateSalary(){
        double salary = getHoursWorked()*getBasicPay();
        System.out.println("Part-time Salary : "+salary);
    }

    @Override public void printDetails(){
        super.printDetails();
        System.out.println("Hours worked : "+getHoursWorked());
    }
}
public class EmployeeMain_S20210010027{
    static void printSalaryDetails(List<Employee> list){
        for(Employee e: list){
            System.out.println("Name   : "+e.getName());
            e.calculateSalary();
            System.out.println();
        }
    }
    static void printEmployeeDetails(List<Employee> list){
        Iterator<Employee> employeeIterator = new Iterator<>() {
            private int cursor = 0;
            @Override
            public boolean hasNext() {
                return cursor < list.size();
            }

            @Override
            public Employee next() {
                return list.get(cursor++);
            }
        };

        while(employeeIterator.hasNext()){
            Employee temp = employeeIterator.next();
            temp.printDetails();
            temp.calculateSalary();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<Employee> list = new LinkedList<>();
        Employee employee1 = new Employee(10000, 2000, "Anushthan");
        RegularEmployee regularEmployee1 = new RegularEmployee(12000, 1000, "Rishabh", 1.0);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee(1000, 0, "Mehul", 10);

        RegularEmployee regularEmployee2 = new RegularEmployee(10000, 3000, "Raj", 0.2);

        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee(2000, 0, "Kanishk", 6);

        list.add(employee1);
        list.add(regularEmployee1);
        list.add(partTimeEmployee1);
        list.add(regularEmployee2);
        list.add(partTimeEmployee2);

        System.out.println("Part 1: Only name and salary");
        printSalaryDetails(list);

        System.out.println("\nPart 2: All details using iterator");
        printEmployeeDetails(list);
    }
}
