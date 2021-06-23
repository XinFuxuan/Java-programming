package day56_abstraction.greeting;

public class Japanese implements Greeting{
    @Override
    public void Hi() {
        System.out.println("こんにちは");
    }

    @Override
    public void Bye() {
        System.out.println("さようなら");

    }
}
