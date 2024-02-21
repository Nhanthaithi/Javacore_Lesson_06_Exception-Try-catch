package assignment.exception;


public class Question04 {
    private static String[] departments = new String[3];

    public static void main(String[] args) {

        try {
            String result = getIndex(4);
            System.out.println("result = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department");
        }

    }

    public static String getIndex(int index) {
        return departments[index];
    }
}
