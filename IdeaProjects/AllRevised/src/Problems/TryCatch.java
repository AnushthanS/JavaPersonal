package Problems;
import java.util.InputMismatchException;
import java.util.Scanner;
/*Take x and y as integer inputs.
    Print x/y integer.
    Print java.util.InputMismatchException in case of an InputMismatchException (like passing string in the scanner)
    Print basic / by 0 exception if y=0.
*/
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
