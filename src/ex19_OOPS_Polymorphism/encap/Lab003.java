package ex19_OOPS_Polymorphism.encap;

public class Lab003 {
    public static void main(String[] args) {

        VWO_login vwo = new VWO_login("admin", "admin@123");
        System.out.println(vwo.password);
        vwo.password= "password@123";
        System.out.println(vwo.password);

        goodVWO_login vwo_login = new goodVWO_login("admin", "q123");

        goodVWO_login vwo_login1 = new goodVWO_login("admin", "123");
        System.out.println(vwo_login1.getUsername());
        System.out.println(vwo_login1.getPassword());

        vwo_login1.setUsername("Pooja");
        //vwo_login1.setPassword("1234");

        System.out.println(vwo_login1.getUsername());
        System.out.println(vwo_login1.getPassword());

        //vwo_login1.setPassword("12345", false);
        vwo_login1.setPassword("12345", true);
        System.out.println(vwo_login1.getPassword());

       // System.out.println(vwo_login.password);
    }
}

class VWO_login{
    String username;
    String password;

    public VWO_login(String username, String password) {
        this.username = username;
        this.password = password;
    }


}

class goodVWO_login{
    private String username;
    private String password;


    public goodVWO_login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

   public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }
        else{
            System.out.println("Not allowed");
        }
    }
}
