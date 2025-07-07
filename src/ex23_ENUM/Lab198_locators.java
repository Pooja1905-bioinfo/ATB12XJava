package ex23_ENUM;

public class Lab198_locators {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocator());
    }
}

enum Locators{
    page_button("#btn"),
    page_input("#input1");

    private String locator;

    Locators(String locator){
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}
