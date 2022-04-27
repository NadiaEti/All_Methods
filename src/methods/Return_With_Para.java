package methods;

public class Return_With_Para {
    // AccessModifier DataType/class/object methodName( parameter ) { return; }
// Dynamic parameterized method because this method will accept any kind of value.

    public String getStuInfo(String name) {    //(3:41 min)
        System.out.println("Student name is " + name);
        return name;
    }

    public double doSummation(double num1, double num2, double num3) {
        System.out.println("Total Summation value of three " + (num1 + num2 + num3));
        return num1 + num2 + num3;
    }
    public int getMulti(int num1, int num2) {
        return (num1 * num2);    // don't want to sysout here
    }
    public boolean isPizzaAvailable(String PizzaName, char Size, int Price) {
        char PizzaSize = Size;         //if large size pizza is available then say yes, elsa say no
        double pizzaPrice = Price;
        if (PizzaSize == 'L') {
            System.out.println(" Yes L size pizza is available");
        } else {
            System.out.println("No L sise pizza is no available");
        }
        return PizzaSize == 'L';
    }
    public static void main(String[] args) {
        Return_parameterize abc = new Return_parameterize();
        abc.getStuInfo("Nibeen");
        abc.getStuInfo("Emti");

        Return_parameterize xyz = new Return_parameterize();
        System.out.println("Total summation value is " + xyz.doSummation(20, 30));

        abc.getMulti(5, 5, 5);

        abc.isPizzaAvailable("Margarita", 'M', 20);
    }
}