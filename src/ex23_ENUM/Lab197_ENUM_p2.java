package ex23_ENUM;

public class Lab197_ENUM_p2 {
    public static void main(String[] args) {
        if(URLS.katalon.equals("katalon")){
            System.out.println("Do something");
        }
    }
}
enum URLS{
    google, katalon, vwo
}