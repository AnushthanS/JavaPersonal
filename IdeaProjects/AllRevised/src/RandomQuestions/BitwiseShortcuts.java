package RandomQuestions;

public class BitwiseShortcuts {
    public static void main(String[] args) {
        System.out.println(evenCheckBit(9992)?"Even":"Odd");
        Integer[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(repetitionCheck(arr));
        System.out.println(getSpecificBit(22,3));
        System.out.println(setSpecificBit(22,4)); //0 1 0 1 1 0
    }
    private static boolean evenCheckBit(Integer n){
        return (n&1)==0; //alternatively (n^1)==n+1 iff n is even
    }

    // In a given array, except a certain element which appears once, every other element appears twice. Find this exception.
    private static int repetitionCheck(Integer[] arr){
        Integer element = 0;
        for(Integer e: arr) element^=e;
        return element;
    }

    // Find i th bit of a given number
    // 8 7 6 5 4 3 2 1 indexing for the number below
    // 1 0 1 1 0 1 1 0
    private static int getSpecificBit(int n, int i){
        return (n & (int)Math.pow(2,i-1)); // or 1<<(i-1) & n
    }

    // Set a specific bit to 1
    private static int setSpecificBit(int n, int i){
        return n | (1<<(i-1));
    }
}
