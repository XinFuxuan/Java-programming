package day52_inheritance;

public class Instagram extends MobileApp {
    public void postPhoto(){
        System.out.println("Posting photo on instagram");
    }

    @Override
    public void useTheApp(int minute){
        super.useTheApp(20);
        System.out.println("Using the instagram app features ");
        postPhoto();
    }

}
