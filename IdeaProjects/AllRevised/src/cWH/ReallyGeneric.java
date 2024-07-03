package cWH;

import java.util.ArrayList;

class CustomGeneric<T1>{
    private T1 any;

    public CustomGeneric(T1 any) {
        this.any = any;
    }

    public T1 getAny() {
        return any;
    }

    public void setAny(T1 any) {
        this.any = any;
    }
}

class MultiGeneric<T1, T2>{
    private T1 any1; private T2 any2;

    public T1 getAny1() {
        return any1;
    }

    public void setAny1(T1 any1) {
        this.any1 = any1;
    }

    public T2 getAny2() {
        return any2;
    }

    public void setAny2(T2 any2) {
        this.any2 = any2;
    }
}

class GenericMethods{
    public <T1> void printArray(T1[] arr){
        for(T1 e: arr) {
            System.out.println(e);
        }
    }
}
public class ReallyGeneric {
    public static void main(String[] args) {

        CustomGeneric<Integer> obj1=new CustomGeneric<>(100);
        System.out.println(obj1.getAny());

        CustomGeneric<String> obj2=new CustomGeneric<>("Hello");
        System.out.println(obj2.getAny());

        MultiGeneric<Integer, String> obj3=new MultiGeneric<>();
        obj3.setAny1(100);
        obj3.setAny2("Hello");
        System.out.println(obj3.getAny2()+" "+obj3.getAny1());

        GenericMethods objFin= new GenericMethods();
        Integer[] arr={1,2,3};
        objFin.printArray(arr);
    }
}
