package day56_abstraction.transportation;

public abstract class Transportation {
    public abstract void transportPeople();
    public abstract void cost (int miles);
    public void start() {
        System.out.println("Starting the engine");
    }
    public void stop(){
            System.out.println("Shut off the engine");
        }
}
