package day58_polymorphism.Superman;

public class Superman extends Father implements Worker{

    @Override
    public void work(String job) {
        System.out.println("super man is working as "+job);
    }

    @Override
    public double getPaid() {
        System.out.println("superman is getting paid");
        return 8000;
    }
}
