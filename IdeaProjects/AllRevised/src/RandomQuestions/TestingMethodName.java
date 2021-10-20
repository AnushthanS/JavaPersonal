package RandomQuestions;
import cWH.PracticeSet7;

import java.lang.reflect.Method;

public class TestingMethodName {
    public static void main(String[] args) {
        Method[] methods = PracticeSet7.class.getDeclaredMethods();
        for (Method e:
             methods) {
            System.out.println(e);
        }
    }
}
