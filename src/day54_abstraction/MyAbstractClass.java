package day54_abstraction;

public abstract class MyAbstractClass { // abstract keyword id used to creat an abstract class in java
    int num = 55;
   public void learn (){
       System.out.println("Learning ... ");
   }

   public abstract void close(); // this is abstract method,. method with no implementation, just the signature
                                 // only shows what classes can do, but not how.
}

//class Sub extends MyAbstractClass{ //  error, cuz sub class must implement orverride close() abstract method

class Sub extends MyAbstractClass{ // sub class also concrete class overrides/ implements the abstract method by following
                                   // rules of the overriding
    public void close(){
        System.out.println("close abstract method implementation ");
    }

}

class MyObjects {
    public static void main(String[] args) {
        //MyAbstractClass mac = new MyAbstractClass();

        Sub sub = new Sub();
        sub.learn();
        System.out.println(sub.num);
        sub.close();
    }
}