package cWH;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

@FunctionalInterface
interface UnaryPredicate<T>{
    boolean test(T Obj);
}

class PredTest{
    public <T> int countElements(Collection<T> col, UnaryPredicate<T> unaryPredicate){
        int count = 0;
        for(T element: col){
            if(unaryPredicate.test(element)){
                count++;
            }
        }
        return count;
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

        PredTest predTest = new PredTest();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 11; i++){
            list.add(i);
        }

//        int count = predTest.countElements(list, o-> o%2 == 1);
        int count = predTest.countElements(list, new UnaryPredicate<Integer>() {
            @Override
            public boolean test(Integer o){
                return o%2 == 1;
            }
        });
        System.out.println(count);
    }
}
