package Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.*;
class Prime{
    public void checkPrime(int ...arr){

    }
}
public class PrimeChecker {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (Method e:
                 methods) {
                if(set.contains(e.getName())){
                    overload=true;
                    break;
                }
                set.add(e.getName());
            }
            if(overload) {throw new Exception("Overloading not allowed");}
        }
        catch (Exception e){
            out.println(e);
        }
    }
}
