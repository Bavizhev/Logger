import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner in = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int size = UserInput.userInput(in.next(), "Введите размер списка: ");

        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = UserInput.userInput(in.next(), "Введите верхнюю границу для значений: ");

        List list = Listbild.listbild(size, maxValue);
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int fil = UserInput.userInput(in.next(), "Введите порог для фильтра: ");

        List<Integer> result = new ArrayList<>();

        Filter filter = new Filter(fil);
        result = Filter.filterOut(list);
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}
