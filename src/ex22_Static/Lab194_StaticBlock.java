package ex22_Static;

public class Lab194_StaticBlock {
}

class ATB1{
    {
        System.out.println("This is called when object is created");
    }

    static {
        System.out.println("Load the class, I will execute");
    }

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocumnet(){
        System.out.println("Non static method");
        //System.out.println();
    }
    static void doAssignment(){
        System.out.println("do assignment");
    }
}