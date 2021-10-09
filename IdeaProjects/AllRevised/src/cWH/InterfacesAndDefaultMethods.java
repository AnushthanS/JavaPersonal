package cWH;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("We use private methods if our default method needs to be broken down for easier OOP");
    }
    default void recordIn4k(){
        greet();
        System.out.println("This is a default method,kinda like switch case");
        System.out.println("Recording in 4k....");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int number){
        System.out.println("Calling "+number);
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
    public void takeSnap(){
        System.out.println("Taking a snap...");
    }
    public void recordVideo(){
        System.out.println("Recording...");
    }
   /* public void recordIn4k(){
        System.out.println("Overriding default method works as expected");
    }*/
    public String[] getNetworks(){
        System.out.println("Getting networks...");
        String[] ar={"Anushthan","Anushthan5G"};
        return ar;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}

public class InterfacesAndDefaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms =new MySmartPhone();
        String []net= ms.getNetworks();
        for(String element: net){
            System.out.println(element);
        }
        ms.connectToNetwork("Anushthan");
        ms.recordVideo();
        ms.recordIn4k();
    }
}
