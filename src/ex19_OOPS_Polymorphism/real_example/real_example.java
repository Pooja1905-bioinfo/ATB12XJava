package ex19_OOPS_Polymorphism.real_example;

public class real_example {
    public static void main(String[] args) {
        chromeOpen t = new chromeOpen();
        t.openBrowser();
    }


}
    class CommonToAll{
        void openBrowser(){
            System.out.println("Open the browser");

        }
    }
    class chromeOpen extends CommonToAll{
        void openBrowser(){
            System.out.println("starting the browser");
        }
    }


