package day55_abstraction.interfaces_demo;

public class ChromeDriver implements WebDriver{
    public ChromeDriver(){
        System.out.println("lunching chrome driver");
    }
    @Override
    public void get(String url) {
        System.out.println("Chrome Driver navatigatring to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chrome Driver locating element by"+locator );

    }

    @Override
    public void quit() {
        System.out.println("quitting the driver");

    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
