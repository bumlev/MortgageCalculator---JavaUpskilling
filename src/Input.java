import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static Double inputForDouble(Scanner scanner) {

        try {
            return scanner.nextDouble();
        }catch (InputMismatchException exception) {
            System.out.println("The value is not a double");
            System.exit(0);
        }
        return 0.0;
    }

    public static Integer inputForInteger(Scanner scanner) {

        try {
            return scanner.nextInt();
        }catch (InputMismatchException exception) {
            System.out.println("The value is not a double");
            System.exit(0);
        }
        return 0;
    }
}
