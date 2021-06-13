package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
       //TestData.ADMIN_USERNAME="change"; error final variable cannot be changed

    }
}
