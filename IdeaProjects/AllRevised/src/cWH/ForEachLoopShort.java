package cWH;

public class ForEachLoopShort {
    public static void main(String[] args) {
        float []entries = {99,98,80.5f,18,167};
        /*Using for loop to display all elements
        for (int i = 0;i<entries.length;i++)
        {
            System.out.println(entries[i]);
        }*/

        //Using for-each loop(for newer java versions)
        for(float element: entries)
        {
            System.out.println(element);
        }
    }
}
