package Problems;
import java.util.Scanner;

public class HackerRankProblemEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(sc.hasNext()){
            i++;
            System.out.println(i+" "+sc.nextLine());
        }
    }
}
