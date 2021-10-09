package Problems;

public class FormatsImp {
    public static void main(String[] args) {
//        String name = "Anushthan";
        String  name = new String("Anushthan");
        int a = 1359;
        float b = 3.141f;

        System.out.printf("%s\n",name);        //{argument index},{flag},{width},{.precision} format in this order
        System.out.printf("%d%n",a);           // \n or %n both give new line for formatting only
        System.out.printf("%15s\n",name);      /* default justification of width goes left to right (called right justification)
                                            therefore it will count to 15 starting from spaces(including string characters )*/
        System.out.printf("%6d\n",a);      //As the int has 4 digits, extra width will be filled as spaces from left
        System.out.printf("%07d\n",a);      //0 flag here will add 0 in place of the extra spaces it will have


        System.out.printf("%-15s%n",name);    /*- is a flag and now the width justification will go from right to left,
                            (called left justification) it will count the spaces after the characters from string print.
                            Using - flag with no width will give an error*/

        System.out.printf("%-15s%9.3f\n",name,b); //.3 is the precision(3 decimal places here), default is 6 decimal places

        //+ flag adds a + (ignores -ve int) to all integer types, basically makes sure that every number has a sign with it
        System.out.printf("%+3d\n",12);

        //(space denoted by _)  _flag works in a similar way to + flag but instead of a +, it will add a _ for a + sign
        //ignores for -ve
        System.out.printf("% d\n",123); //_+ results in an error, since both are used to just pad up the number and nothing else


        System.out.printf("%08.2f\n",-123.32); //0 flag will not work with - flag since there will be no spaces to the left to fill with zeros

        //, flag adds comma like we use while denoting monetary values (international style)
        System.out.printf("%,08d\n",123456);
        // ( flag adds () for negative values, removes their -ve sign
        // N0TE that all these flags count towards spaces when using justification

        System.out.printf("%(09.2f\n",-123.32);
    }
}
