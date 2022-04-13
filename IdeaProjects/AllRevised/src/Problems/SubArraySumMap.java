package Problems;
import java.util.HashMap;

// https://www.youtube.com/watch?v=XzwUBIkR9pA
// Find a subarray with the given sum

public class SubArraySumMap {
    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
        int sum = 5;
        SubArraySumMap obj = new SubArraySumMap();
        obj.subArrSum(arr, sum, arr.length);
    }
    public void subArrSum(int[] arr, int sum, int size){
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0, start = 0, end = -1;
        for(int i=0; i<size; i++){
            currentSum+=arr[i];
            if(currentSum == sum){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(currentSum-sum)){
                start = map.get(currentSum-sum)+1;
                end = i;
                break;
            }
            map.put(currentSum, i);
        }
        if(end==-1){
            System.out.println("Not found");
            return;
        }
        System.out.println(start+", "+end);
    }
}
