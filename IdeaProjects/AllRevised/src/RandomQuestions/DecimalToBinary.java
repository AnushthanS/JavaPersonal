package RandomQuestions;

public class DecimalToBinary {
    static String bin = "";
    public static void main(String[] args) {
        int n = 21;
        convertBinary(n);
        System.out.println(bin);
        System.out.println(convertBinaryIt(n));
        // In built method
        System.out.println(Integer.toBinaryString(n));
    }

    //Iterative approach
    private static String convertBinaryIt(int n) {
        StringBuilder bin = new StringBuilder();
        while(n!=0){
            bin.append(n%2);
            n/=2;
        }
        return bin.reverse().toString();
    }


    //Recursive approach
    private static void convertBinary(int n) {
        if(n==0) return;
        convertBinary(n/2);
        bin+=Integer.toString(n%2);
    }
}
