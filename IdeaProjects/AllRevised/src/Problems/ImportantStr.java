package Problems;

/*public class ImportantStr {
    public static void main(String[] args) {
        String name1 = new String("Anushthan");

    *//* Since string is a class, we can call it using objects but Java supports strings as reference
       data types
    *//*


        String name2 = "Saxena";
        System.out.println(name1 + " "+ name2);  //Concatenation
    }}*/

public class ImportantStr
{
   public static void main(String[] args){
        int a = 10;
        float b = 3.14159f;
        System.out.printf("The value of a is %d and the value of pi for 3 decimals is %.3f\n",a,b);

//        Demonstration for formatting , used in c++

       System.out.format("The value of pi for 4 decimals with 8 spaces with the value is %8.4f",b);
       //Since the value itself takes 6 spaces, there will be 2 spaces in front of the value to make a total of 8

   }
}