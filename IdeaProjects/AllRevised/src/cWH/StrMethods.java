package cWH;


public class StrMethods {
    static public void main(String[] args){
        String name = new String ("Anushthan");

        System.out.println(name.substring(3));
        System.out.println(name.substring(3,6));            //3 included, 6 not included
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.replace('a','b'));
        System.out.println(name.substring(0,5));
        System.out.println(name.replace("a","ANUSH"));
        System.out.println(name.startsWith("Anush"));
        System.out.println(name.endsWith("an"));
        System.out.println(name.equals("anushthan"));
        System.out.println(name.equalsIgnoreCase("anushthan"));
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" Saxena"));
        System.out.println(name.indexOf("han"));
        System.out.println(name.indexOf("a",1));
        System.out.println(name.indexOf("y",6));
        System.out.println(name.lastIndexOf("than"));
        System.out.println(name.lastIndexOf('h',5));
        System.out.println("\\ \t \n \' \"");
    }
}
