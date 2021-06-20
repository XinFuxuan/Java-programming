package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){
        System.out.println("warming up and starting the exercise");
    }

    /**abstract method, method without body just signature,
     * purpsose: letting sub classes implement/ override their own way
     */

    public abstract void perform();

    /**
     * another abstract method that concrete sub class will override
     * @param minutes - how long is exercise is performed
     * @return number of calories burned/used
     */

    public abstract int getCaloriesCount(int minutes);





}
