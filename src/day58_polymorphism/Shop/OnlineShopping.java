package day58_polymorphism.Shop;

public abstract class OnlineShopping {
   public abstract void buy();
   public abstract void sell();
   public void ship(){
       System.out.println("shipping the purchased items");
   }

}
