package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someone){
        System.out.println("Chatting with "+someone);
    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Chantal");
    }
}
