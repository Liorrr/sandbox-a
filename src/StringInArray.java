import java.util.Scanner;

public class StringInArray {
    public static void main(String[] args) {
        System.out.println("Please enter a string with spaces: ");
        Scanner scanner = new Scanner(System.in);
        boolean failed = true;
        String stringLine = scanner.nextLine();
        String[] arr = stringLine.split(" ");
        final int stringLineLength = arr.length;
        System.out.println("Please enter a single string, we will check if it's included in the last string: ");
        String checkText = scanner.next();
        for (int i = 0; i < stringLineLength; i++)
            if (arr[i].equals(checkText)) {
                System.out.println("TRUE");
                failed = false;
                return;
            }
        if (failed){
            System.out.println("False");;
        }
    }
}
