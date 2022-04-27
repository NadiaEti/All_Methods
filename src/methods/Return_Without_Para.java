package methods;

public class Return_Without_Para {
    // AccessModifier DataType/class/object methodName() { return; }
    public void getDisplay() {    // non-return type
        System.out.println("This is a display method");
    }
    public int DoSummation() {
        System.out.println("This is DoSummation method");
        int num1 = 30;      // It's called declare value
        int num2 = 50;
        int Total = num1 + num2;
        System.out.println("Total value is " + Total);
        return Total;
    }
    public String getStuInfo() {
        String fname = "Nadia";
        String lname = "Eti";
        String fullname = fname + " " + lname;    //This + sign is for concatenation between fname and laname
        System.out.println("Fullname is " + fullname);
        return fullname;
    }
    public static void main(String[] args) {
        Return_without xyz = new Return_without();
        xyz.getDisplay();
        xyz.DoSummation();
        xyz.getStuInfo();
    }
}