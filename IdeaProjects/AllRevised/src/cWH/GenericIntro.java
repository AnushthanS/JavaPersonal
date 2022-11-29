package cWH;

class TestGenerics1{
    public <T> void printElements(T[] collection){
        for(T element: collection) {
            System.out.println(element);
        }
    }

    public <T extends Comparable<T>> T maximum(T o1, T o2){
        T max = o1.compareTo(o2) > 0 ? o1 : o2;
        return max;
    }
}

class TestGenerics2 <T1, T2>{
    T1 obj1;
    T2 obj2;
    TestGenerics2(T1 obj1, T2 obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
}

public class GenericIntro {
    public static void main(String[] args) {
    }
}
