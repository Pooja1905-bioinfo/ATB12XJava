package ATBX_Tasks.Task_OOPs_Polymorphism.MethodOverriding.Task04_LoginFunctionality;

public class MainLogin {
    public static void main(String[] args) {
        User user1 = new AdminUser();
        User user2 = new RegularUser();
        user1.login();
        user2.login();

    }
}
