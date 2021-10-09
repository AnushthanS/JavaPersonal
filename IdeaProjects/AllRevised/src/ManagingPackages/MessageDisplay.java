package ManagingPackages;
import java.util.Scanner;

class Actual{
    Scanner sc= new Scanner(System.in);
    public void called(){
        String display=sc.nextLine();
        System.out.println(display);
    }
}

public class MessageDisplay{
    public void main() {
        Actual obj = new Actual();
        obj.called();
    }
}