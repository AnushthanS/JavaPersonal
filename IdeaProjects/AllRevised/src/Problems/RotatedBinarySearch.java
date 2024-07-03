package Problems;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1 ,2};
        int target = 5, firstMatch;

        int pivot = pivotIndex(arr);
        if(pivot == -1){ //Array not rotated
            System.out.println(binarySearch(arr, target, 0, arr.length-1));
        }

        if(arr[pivot] == target){
            System.out.println(pivot);
        } else{
            firstMatch = binarySearch(arr, target, 0, pivot);
            if(firstMatch == -1){
                System.out.println(binarySearch(arr, target, pivot+1, arr.length-1));
            } else{
                System.out.println(firstMatch);
            }
        }
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int pivotIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            // mid < end and mid > start to avoid IndexOutOfBoundsException
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
