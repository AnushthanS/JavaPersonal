package Problems;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ConvertAmPm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


            String givenTime=sc.next();
            boolean checkAm=givenTime.contains("AM");
            boolean checkPm=givenTime.contains("PM");
            StringTokenizer stringTokenizer=new StringTokenizer(givenTime,":",false);
            String hh=stringTokenizer.nextToken();
            String rem=stringTokenizer.nextToken()+":"+stringTokenizer.nextToken().substring(0,2);
            if(checkAm && hh.equals("12")) hh="00";
            else if(checkPm && !hh.equals("12")) {
                hh= (Integer.parseInt(hh)+12)+"";
            }
            System.out.println(hh+":"+rem);

    }
}
