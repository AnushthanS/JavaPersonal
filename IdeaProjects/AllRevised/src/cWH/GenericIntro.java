package cWH;

class TestGenerics1{
    public <T> void printElements(T[] collection){
        for(T element: collection) {
            System.out.println(element);
        }
    }

    public <T extends Comparable<T>> T maximum(T o1, T o2){
        return o1.compareTo(o2) > 0 ? o1 : o2;
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
        TestGenerics1 testGenerics1 = new TestGenerics1();
        Integer[] arr = {1, 2, 3, 4};
        testGenerics1.printElements(arr);

        Character a = 'a', b = 'b';
        Character max = testGenerics1.maximum(a, b);

        TestGenerics2<String, Integer> testGenerics2 = new TestGenerics2<>("abc", 10);
    }
}
