import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Filter {
    protected static int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public static List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        ListIterator<Integer> lItr = source.listIterator();
        int i = 0;
        logger.log("Запускаем фильтрацию");
        while (lItr.hasNext()) {
            int it = lItr.next();
            if (it >= treshold) {
                logger.log("Элемент \"" + it + "\" проходит");
                i++;
                result.add(it);
            } else {
                logger.log("Элемент \"" + it + "\" не проходит");
            }

        }
        logger.log("Прошло фильтр " + i + " элемента из " + source.size());
        logger.log("Выводим результат на экран");
        return result;
    }
}