package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.Hi();
        ml.Bye();

        Greeting gt = new MountainLanguage();
        gt.Hi();
        gt.Bye();

        Japanese jp = new Japanese();
        jp.Hi();
        jp.Bye();

        gt= new Japanese();
        gt.Hi();
        gt.Bye();


    }
    }

