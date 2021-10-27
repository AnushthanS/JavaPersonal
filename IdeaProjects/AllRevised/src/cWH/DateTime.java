package cWH;
//System.currentTimeMillis() counts milliseconds in a long format from 1 January 1970.
//Starting year for Java is 1900
public class DateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int noOfYearsRoughly = (int)Math.floor(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println(noOfYearsRoughly);
    }
}
