package day55_abstraction.interfaces_demo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFox Driver navigating to "+url);

    }

    @Override
    public void findElement(String locator) {
        System.out.println("FireFox Driver locating element by"+locator );

    }

    @Override
    public void quit() {


    }

    @Override
    public String getTitle() {
        return getTitle();
    }
}
