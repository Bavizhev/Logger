import java.util.Scanner;

public class UserInput {
    public static int userInput(String input, String text) {
        Scanner in = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        int i;
        while (true) {
            System.out.print("");
            try {
                System.out.print("");
                i = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                logger.log("Некорректный ввод");
                System.out.print(text);
                input = in.next();
            }
        }
        return i;
    }
}
