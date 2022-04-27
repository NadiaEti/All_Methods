package methods;
public class Non_Return_With_Para {
    public void doSummation(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        System.out.println("Total summation value is " + total);
    }
    public void doSub(int num3, int num2) {
        int total = num3 - num2;
        System.out.println("Total subtraction value is " + total);
    }
    public void doMulti(float tax1, float tax2, float tax3) {
        float Multi = tax1 * tax2 * tax3;
        System.out.println("Average multiplication " + Multi);
    }
    public static void main(String[] args) {
        Non_Return_With_Para XXX = new Non_Return_With_Para();
        XXX.doSummation(20, 30, 100);
        XXX.doSub(599, 500);
        XXX.doMulti(20f, 3.95f, 50f);
    }
}