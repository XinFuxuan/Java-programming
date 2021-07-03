package day59_polymorphism_exceptions;

public class WebElementUtil {

    /**
     * method with polymorphic parameter
     * WebElement element can accept any child object, such as Link, inputfield etc
     * clickElement(new Link());
     * clickElement(new InputField())
     *
     */
    String name;
    public static void clickElement(WebElement element){
        System.out.println("clicking on element");
        element.click();

    }

    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt = "+txt);
        return new Link();
    }

}
