package Problems;

import static java.lang.System.*;
import java.util.Scanner;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
//        int t=Integer.parseInt(scanner.nextLine());
//        while(t-->0){
//            String input = scanner.nextLine();
//
//            Pattern p= Pattern.compile("<(.+)>([^<]+)</\\1>");
//            Matcher m= p.matcher(input);
//            boolean match=false;
//            while(m.find()){
//                out.println(m.group(2));
//                match=true;
//            }
//            while(!match){
//                out.println("None");
//            }
//        }

        //Extract links from html tags
        int t1=Integer.parseInt(scanner.nextLine());
        while(t1-->0){
            String input = scanner.nextLine();
            Pattern p= Pattern.compile("<a\\shref=\"([^\"]++)\"([^<>]*)>(<\\w>)*([^<>]*)<");
            Matcher m= p.matcher(input);
            while(m.find()){
                out.println(m.group(1)+","+m.group(4));
            }
        }
    }
}
