package ManagingPackages;
    
class AccessModification{
    public String a="This has a public access modifier";
    protected String b="This has a protected access modifier";
    String c="This has a default access modifier";
    private String d="This has a private access modifier";

    public void meth1(){
        System.out.println("A method inside the same class");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}

public class prg3{
    public static void main(String[] args) {
        AccessModification obj = new AccessModification();
        obj.meth1();
        System.out.println("Using object in another class");
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        //System.out.println(obj.d); Will not work due to private modifier
    }
}