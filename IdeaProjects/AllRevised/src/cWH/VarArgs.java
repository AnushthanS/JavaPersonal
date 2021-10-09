package cWH;

public class VarArgs {
        static int sum (int ...arr){
            int result =0;
            for (int a:arr) {
                result+=a;
            }
            return result;
        }

    public static void main(String[] args) {

            //Using variable arguments essentially passes on an array

        System.out.printf("The sum of %d, %d and %d is %d\n",23,46,69,sum(23,46,69));
    }
}
