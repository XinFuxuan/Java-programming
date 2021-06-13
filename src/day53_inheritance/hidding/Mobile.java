package day53_inheritance.hidding;

public class Mobile extends Phone{
    String type = "Mobile Phone";

    // method hiding, we are higing use() statid method

    public static void use(){
        System.out.println("USing the phone ");
    }
    public void text(){
        use();
        System.out.println("sending a message");

    }
}
