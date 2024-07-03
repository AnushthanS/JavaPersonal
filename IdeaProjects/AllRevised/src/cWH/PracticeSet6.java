package cWH;
import java.util.Scanner;
public class PracticeSet6 {
    public static void main(String[] args) {
        /*Problem 1
        float []ar1={10.5f,20.5f,30,40,50};
        float sum=0.0f;
        for(int i = 0;i< ar1.length;i++)
        {
         sum += ar1[i];
        }
        System.out.println("Sum : "+sum);*/

        /*Problem 2
        Scanner sc = new Scanner(System.in);
        int tally=0;
        int n = sc.nextInt();
        int []ar = {10,15,20,5,25,30,35};
        for (int i=0;i<ar.length;i++)
        {
            if (n==ar[i])tally++;
        }
        if (tally>0) System.out.println("The entry exists "+tally+" times");
        else System.out.println("Entry doesn't exist");

        //Problem 2 different method
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []ar = {10,15,20,5,25,30,35};
        boolean isInArray=false; //default boolean is true so always set to false
        for(int element: ar)
        {
            if(n==element)
            {
                isInArray=true;
                break;
            }
        }
        if(isInArray) System.out.println("Entry found");
        else System.out.println("No such entry found");*/

        /*Problem 3
        float []marks={98,99,97,96,97,98};
        float sum=0.0f;
        for(float element: marks)
        {
            sum+= element;
        }
        float avg = sum/(float)marks.length;
        System.out.println("Average : "+avg);

        Problem 4
        int [][]mat1= {{1,2,3},
                       {4,5,6}};
        int [][]mat2= {{3,4,5},
                       {6,7,8}};
        int [][]matSum= new int[2][3];
        for(int i=0;i<mat1.length;i++) //rows
        {
            for(int j=0;j<mat1[i].length;j++) //columns
            {
                matSum[i][j]= mat1[i][j]+mat2[i][j];
            }
        }
        for (int i =0;i< matSum.length;i++)
        {
            for(int j=0;j<matSum[i].length;j++)
            {
                System.out.print(matSum[i][j]+" ");
            }
            System.out.println();
        }

        Problem 5
        int []original = {10,20,30,40};
        int []reverse = new int[original.length];
        for(int i =original.length-1,j=0;i>=0;i--,j++)
        {
            reverse[j]=original[i];
        }
        for(int element: reverse)
        {
            System.out.print(element+" ");
        }

        //Problem 5 second method
        int temp;
        int []arr={1,2,3,4,5,6,7,8,9};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        for(int i=0;i<n;i++)
        {
            temp = arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int ar : arr)
        {
            System.out.print(ar+" ");
        }*/

        /*Problem 6
        int []arr1={1,2,3,300,4,5,6,698,7,8,9};
        int maxM=Integer.MIN_VALUE;
        for(int e : arr1)
        {
            if(maxM<e) maxM=e;
        }
        System.out.printf("Greatest element is %d",maxM);*/

        /*Problem 7
        int []arr={-1,2,3,300,-4,5,-6,698,7,8,9};
        int min=Integer.MAX_VALUE;
        for(int element:arr)
        {
            if(element<min) min=element;
        }
        System.out.printf("Smallest element is %d",min);*/

        //Problem 8
        int []arr={-1,2,3,300,-4,5,-6,698,7,8,9};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++)
        {
            if (arr[i]>arr[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if (isSorted) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
