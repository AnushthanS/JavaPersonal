package cWH;
import java.util.regex.*;

public class RegexIntro {
    public static void main(String[] args) {
        System.out.println("Examples for ? quantifier");
        System.out.println(Pattern.matches("[ayz]?","a y z"));
        System.out.println(Pattern.matches("[ayz]?","aaa"));
        System.out.println(Pattern.matches("[ayz]?","a"));
        System.out.println(Pattern.matches("[ayz]?","amnop"));
    }
}
