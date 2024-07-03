package Problems;

import java.util.*;

public class GFGComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111,"bbb","london"));
        ar.add(new Student(131,"aaaa","nyc"));
        ar.add(new Student(121,"cccc","jaipur"));

        System.out.println("Unsorted: ");
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortByRoll());
        System.out.println("\nSorted by roll no: ");
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortByName());
        System.out.println("\nSorted by name: ");
        for(int i=0; i<ar.size();i++)
            System.out.println(ar.get(i));
    }
}

//Java program to demonstrate working of Comparator
//Making a class Student with standard details taken as user input and sorting them on various criteria.

class Student{
    int rollNo;
    String name, address;

    //Constructor
    public Student(int rollNo, String name, String address){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
    }

    //Used to print the details in main
    public String toString(){
        return this.rollNo+" "+ this.name+" "+this.address;
    }
}

class SortByRoll implements Comparator<Student> {
    //Used for sorting in ascending order of roll number
    @Override
    public int compare(Student a, Student b){
        return a.rollNo- b.rollNo;
    }
}

class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}