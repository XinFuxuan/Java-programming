package day47_constructor;

public class addressList {
    public static void main(String[] args) {
        Address cybertekAddress=new Address(); // calling the constructor automatically

        cybertekAddress.setStreet("7925 Jones Branch Drive Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("Cybertek address: "+cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Drive Suite 3200"); // resetting the setStreet

        Address newAddress=new Address();
        newAddress.setStreet("2159 Center Ave ");
        System.out.println(newAddress.toString());

        Address papaJon=new Address("2150 center ave ", "Fort Lee", "NJ", "07024");





    }
}
