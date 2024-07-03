package Problems;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        arr.sort((o1, o2) -> o1-o2);
        long sum=0;
        for(Integer e: arr) sum+=e;
        System.out.printf("%d %d",sum- arr.get(arr.size()-1),sum-arr.get(0));
    }
}

public class HRMinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        //Anonymous class for practice
        // Collections.sort(arr,new Comparator<Integer>(){
        //     @Override public int compare(int a, int b){
        //         return a-b;
        //     }
        // });
        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
