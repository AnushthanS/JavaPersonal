package Problems;
import java.util.ArrayList;
import java.util.Scanner;

//You are given n lines. In each line there are zero or more integers.
//You have to answer the queries to tell the number located in y position of line x.
//The first line has an integer n.
//In each of the next n lines there will be an integer d denoting number of integers
//on that line and then there will be d space separated integers.
//In the next line there will be an integer q denoting number of queries.
//Each query will consist of two integers x and y
//In each line output the number located in y position of x line.
//If there is no such position, just print "ERROR!"

//Sample Input
//5
//5 41 77 74 22 44
//1 12
//4 37 34 36 52
//0
//3 20 22 33
//5
//1 3
//3 4
//3 1
//4 3
//5 5

//Sample Output
//74
//52
//37
//ERROR!
//ERROR!

public class MultidimensionalArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Forming an AL of multiple AL rows
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            ArrayList<Integer> rowElements = new ArrayList<>();
            for(int j=0;j<d;j++){
                rowElements.add(sc.nextInt());
            }
            rows.add(rowElements);
        }

        //Queries
        int queries = sc.nextInt();
        for(int i=0;i<queries;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(rows.get(x-1).get(y-1));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
