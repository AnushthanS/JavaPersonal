package College;

import java.lang.reflect.Array;

class Employee3{
    private String name, id;
    private int salary;

    public Employee3(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

interface Queue{
    public void enqueue(Employee3 key);
    public Employee3 dequeue();
}

class ArrayQueue implements Queue{
    private static Employee3[] employees;
    private int start, end;

    public ArrayQueue(int size){
        this.start = 0;
        this.end = 0;
        employees = new Employee3[size];
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    public int getQueueSize(){
        return getEnd() - getStart();
    }
    @Override
    public void enqueue(Employee3 employee){
        employees[getEnd()] = employee;
        setEnd(getEnd() + 1);
    }
    @Override
    public Employee3 dequeue() {
        setStart(getStart() + 1);
        return employees[getStart() - 1];
    }

    public int findById(String id){
        int i = 0;
        for(Employee3 employee: employees){
            if(employee.getId().equals(id)) return i;
            i++;
        }
        return -1;
    }

    public void emptyQueue(){
        employees = new Employee3[getQueueSize()];
        setEnd(0);
        setStart(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {

    }
}
