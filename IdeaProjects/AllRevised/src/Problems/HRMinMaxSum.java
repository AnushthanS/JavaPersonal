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
        ArrayList<Long> output = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            long sum=0;
            for(int e: arr){
                if(arr.get(i)!=e) sum+=e;
            }
            output.add(sum);
        }
        output.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int) (o1 - o2);
            }
        });

        System.out.printf("%d %d",output.get(0),output.get(output.size()-1));
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
