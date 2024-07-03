package Problems;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexIntro {
    public static void main(String[] args) {
//        System.out.println(Pattern.matches("Anush*han","Anushthan")); gives false, not enough pattern recognition.
//        System.out.println(Pattern.matches("geeksforge*ks","geeksforgeeks")); gives true, apparently only stars work for default patterns.

        Pattern mypattern1 = Pattern.compile("geek");
        Matcher m1 = mypattern1.matcher("geeksforgeeks");
        while(m1.find()){
            System.out.printf("Pattern found from %d to %d\n",m1.start(),m1.end()-1);
        }

        Pattern mypattern2 = Pattern.compile("ge", Pattern.CASE_INSENSITIVE);
        Matcher m2 = mypattern2.matcher("GEEksforgeeKs.org");
        while(m2.find()){
            System.out.printf("Pattern found from %d to %d%n",m2.start(),m2.end()-1);
        }
    }
}
