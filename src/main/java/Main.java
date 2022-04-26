import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя вести входные данные для списка");

        System.out.println("Введите размер списка:");
        int size = in.nextInt();

        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = in.nextInt();

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            source.add( random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + source);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int threshold = in.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        System.out.println("Отфильтрованный список: " + filter.filterOut(source));

        logger.log("Завершаем работу программы");
    }
}