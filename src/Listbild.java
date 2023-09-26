import java.util.*;

public class Listbild {
    public static List listbild(int size, int maxValue) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        while (size > 0) {
            list.add(random.nextInt(maxValue));
            size--;
        }
        Logger logger = Logger.getInstance();
        logger.log("Создаём и наполняем список");
        return list;
    }
}
