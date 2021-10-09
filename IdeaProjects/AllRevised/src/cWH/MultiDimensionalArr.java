package cWH;

public class MultiDimensionalArr {
    public static void main(String[] args) {
        int [][]flats = new int[2][3];
        flats[0][0]= 101;       //Think of this as 2 rows and 3 columns
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 201;
        flats[1][1]= 202;
        flats[1][2]= 203;
        //To print a multi dimensional array using for loop
        for(int j=0;j< flats.length;j++)
        {
            for(int i =0;i<flats[j].length;i++)
            {
                System.out.print(flats[j][i]+" ");
            }
            System.out.println();
        }
    }
}
