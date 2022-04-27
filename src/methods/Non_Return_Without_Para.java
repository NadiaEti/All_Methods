package methods;

public class Non_Return_Without_Para {
    //AccessModifier returnType methodName() {}
    public void doSummation(){  // non_return type method
            int num1 = 20;
            int num2 = 50;
            int num3 = 80;
            int total = num1 + num2 +num3;
            System.out.println("Total summation value is " + total );
    }
    public void doDivision1(){
        float tax1 = 300.99f;
        float tax = 50f;
        float total = tax1/tax;
        System.out.println("Average tax is " +total);
    }
    public static void main(String[] args) {
        Non_ReturnType_WithoutPara A = new Non_ReturnType_WithoutPara();
        A.doSummation();  // non_return type of value is not return anything but only printing the value
        A.doDivision();
    }
    }
