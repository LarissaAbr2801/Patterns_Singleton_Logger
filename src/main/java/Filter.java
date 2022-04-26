import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        LoggerImpl logger = LoggerImpl.getInstance();

        List<Integer> result = new ArrayList<>();

        for (Integer number : source) {
            if (number > threshold) {
                logger.log("Элемент " + number + " подходит");
                result.add(number);

            } else {
                logger.log("Элемент " + number + " не подходит");
            }
        }
        logger.log("Прошло " + result.size() + " элемента из " + source.size());
        logger.log("Выводим результат на экран");
        return result;
    }
}