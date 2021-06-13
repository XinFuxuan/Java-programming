package day53_inheritance.hidding;

public class Parent {
    public String name = "parent > mike ";
    public void introduce1(){
        System.out.println("MY name "+ name);

    }
}
class Child extends Parent{
    public String name = " Child > Bob";
    public void introduce2(){
        System.out.println("MY name "+ name);
    }
}
class Runner {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.introduce1();
        Child child = new Child();
        child.introduce1();
        child.introduce2();
    }
}
