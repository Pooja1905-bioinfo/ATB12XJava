package ex19_OOPS_Polymorphism.Superkeyword;

public class Lab004_Superkeyword {
}

class Baseclass {
    private String browser;

    public Baseclass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin){
        this.browser = browser;}
        else{
            System.out.println("You are not allowed");}
    }
    void openBrowser(){
        System.out.println("Open Browser!");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser!" + browserName);
    }

    void closeBrowser(){
        System.out.println("Close the browser");
    }
}

class Testcase1 extends Baseclass{
    public Testcase1(String browser){
        super(browser);
        super.openBrowser();
        super.openBrowser("Chrome");
        super.setBrowser("Edge", true);
    }
}
