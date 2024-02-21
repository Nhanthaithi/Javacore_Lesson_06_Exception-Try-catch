package assignment.exception;

public class Question1_2 {
    public static void main(String[] args) {

        try {
            float result = divide(7, 0);
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("cannot divide 0");
        }finally {
            System.out.println("divide completed!");
        }
    }

    public static float divide(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
