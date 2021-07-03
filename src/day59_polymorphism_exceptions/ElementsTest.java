package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.getLinkHref();
        link.sendKeys("hi");

        WebElement loginLink = new Link();
        loginLink.click();
        String txt= loginLink.getText();
        System.out.println("txt = "+txt);
        //loginLink.getLinkHref(); --> error

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);




    }
}
