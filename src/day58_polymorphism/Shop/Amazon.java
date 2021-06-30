package day58_polymorphism.Shop;

public class Amazon extends OnlineShopping implements Prime{
    @Override
    public void primeShipping() {
        System.out.println("Free 2 days shipping for prime members");

    }

    @Override
    public void buy() {
        System.out.println("buying items on amazon.com");

    }

    @Override
    public void sell() {
        System.out.println("selling items on amazon.com");

    }


}
