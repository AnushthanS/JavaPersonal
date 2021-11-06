package Problems;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateRegex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String regex="(\\b\\w+)(\\s\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE+Pattern.MULTILINE);

        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String input = sc.nextLine();
            Matcher m = p.matcher(input);
            while(m.find()){
                input = input.replaceAll(m.group(),m.group(1));
            }
            System.out.println(input);
        }
        sc.close();
    }
}