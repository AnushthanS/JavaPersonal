package cWH;

public class Finally {

    static boolean checkSort(int ...arr){
        boolean flag = true;
        for(int i=0;i< arr.length;i++){
            try{
                if (arr[i] > arr[i+1]) {
                    flag = false;
                    break;
                }
            }
            catch (Exception e){
                System.out.println("e");
            }
            finally {
                System.out.println("Always executed!");
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        if(checkSort(100,1,99)) {
            System.out.println("sorted");
        }
        else System.out.println("Not sorted");

        //finally block executed even after exception is thrown or program is stopped midway due to it
        int a=10,b=5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Finally block for b = "+b);
            }
            b--;
        }
    }
}
