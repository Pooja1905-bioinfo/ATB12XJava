package ATBX_Tasks.Task_OOPs_Inheritance.Task003_MultilevelLoginSystem;

public class MainUser {
    public static void main(String[] args) {
        SuperAdmin user1 = new SuperAdmin();
        user1.login();
        user1.accessAdminPanel();
        user1.shutdownSystem();
    }
}
