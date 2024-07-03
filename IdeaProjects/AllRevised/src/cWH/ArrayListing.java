package cWH;
import java.util.*;
//Since some methods require util.AbstractList, AbstractCollection, Collection and List
//The ones dealing with object obviously require lang.Object
public class ArrayListing {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(10);//Initial capacity optional
        ArrayList<Integer> l2 = new ArrayList<>();

       // l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(0,10);
        l1.add(0,0); //Index is fluid here

        l1.set(2,200);

        l2.add(60);
        l2.add(70);
        l2.add(80);
        l2.add(90);
        System.out.println(l1.contains(20)?"Yes":"No");
        l1.addAll(l2);
        l1.addAll(0,l2);

        List<Integer> l3 = (List<Integer>) l2.clone();

        List<Integer> l4 = l1.subList(3,8);

        List<Integer> l5 = (List<Integer>)l1.clone();

        ArrayList<Integer> literalClone = new ArrayList<>();
        literalClone= (ArrayList<Integer>) l1.clone();

        for(int i=0;i<l4.size();i++){
            System.out.println(l4.get(i));
        }
//        System.out.println(l1.indexOf(60));
//        System.out.println(l1.lastIndexOf(60));
     /*   for(int i = 0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println();*/
        /*
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i));
        }
        System.out.println();

        l1.addAll(l2);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println();

        l1.addAll(0,l2);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        l2.clear();*/
    }
}
