package Problems;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.regex.*;

//SAMPLE TEXT::
//The hackerrank team is on a mission to flatten the world
// by restructuring the DNA of every company on the planet.
// We rank programmers based on their coding skills, helping
// companies source great programmers and reduce the time to hire.
// As a result, we are revolutionizing the way companies discover
// and evaluate talented engineers. The hackerrank platform
// is the destination for the best engineers to hone their
// skills and companies to find top engineers.

class Regex_Test{
    public void checker(String Regex_Pattern){
        Scanner input = new Scanner(in);
        String Test_String = input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int count =0;
        while(m.find()){
            count++;
        }
        out.printf("No. of matches: %d",count);
    }
}

public class HRFirstPatternMatching {
    public static void main(String[] args) {
        Regex_Test testing = new Regex_Test();
        testing.checker("hackerrank");
    }
}
