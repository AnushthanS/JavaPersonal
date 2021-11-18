package Problems;

import java.util.*;

public class GFGComparatorExample2 {
    public static void main(String[] args) {
        List<StudenT> a1= new ArrayList<>();

        //creating customer objects using constructor
        StudenT obj1 = new StudenT("Ajay", 27);
        StudenT obj2 = new StudenT("Sneha", 23);
        StudenT obj3 = new StudenT("Simran", 37);
        StudenT obj4 = new StudenT("Ajay", 22);
        StudenT obj5 = new StudenT("Ajay", 29);
        StudenT obj6 = new StudenT("Sneha", 22);

        //add customer objects to ArrayList
        a1.add(obj1);
        a1.add(obj2);
        a1.add(obj3);
        a1.add(obj4);
        a1.add(obj5);
        a1.add(obj6);

        Collections.sort(a1, new CustomerSortingComparator());
        System.out.println("\nAfter Sorting:\n");
        for(StudenT customer: a1){
            System.out.println(customer);
        }
    }
}

class StudenT{
    String name;
    int age;

    public StudenT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override public String toString(){
        return "Name: "+getName()+", Age: "+getAge();
    }
}

class CustomerSortingComparator implements Comparator<StudenT>{
    @Override public int compare(StudenT customer1, StudenT customer2){
        int nameCompare= customer1.getName().compareTo(customer2.getName());
        int ageCompare= customer1.getAge()-customer2.getAge();
        return (nameCompare==0?ageCompare:nameCompare);
    }
}