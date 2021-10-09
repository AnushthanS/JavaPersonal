package cWH;

public class IntroToErrors {
    public static void main(String[] args) {
        int a=1000 , b=0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Couldn't execute.\nReason : "+e);
        }
        System.out.println("This will be executed due to try-catch block.");
    }
}
