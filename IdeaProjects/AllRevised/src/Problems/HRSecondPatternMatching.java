package Problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HRSecondPatternMatching {
    public static void main(String[] args) {
        Tester t = new Tester();
        t.check("^(.{3}\\.){3}.{3}$");
    }
}

class Tester{
    public void check(String pattern){
        Scanner in = new Scanner(System.in);
        String testString = in.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        System.out.println(m.matches());
    }
}