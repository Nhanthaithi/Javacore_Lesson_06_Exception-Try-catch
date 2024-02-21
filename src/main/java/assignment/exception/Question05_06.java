package assignment.exception;

import java.util.Scanner;

public class Question05_06 {
    public static void main(String[] args) {
        boolean continueLoop = true;

        while (continueLoop) {
            try {
                int age = inputAge();

                if (age < 0) {
                    throw new Exception("The age must be greater than 0");
                }

                System.out.println("age = " + age);
                continueLoop = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong inputting! Please input an age as int, input again.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int inputAge() {
        System.out.println("Enter your Age");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
