package ATBX_Tasks.Task_OOPs_Inheritance.MethodOverriding.Task003_EmployeeRoleInfo;

public class MainEmployee {
    public static void main(String[] args) {
        Employee clerk = new Clerk();
        Employee manager = new Manager();
        Employee tester = new Tester();
        Employee general = new Employee();
        clerk.role();
        manager.role();
        tester.role();
        general.role();

    }
}
