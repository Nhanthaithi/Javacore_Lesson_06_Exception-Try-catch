package assignment.exception;

public class Question03 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("numbers = " + numbers[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Message error = " + e.getMessage());
        }
    }
}
