import java.util.ArrayList;
import java.util.List;

public class Prog2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int min = numbers.get(0);
        int max = numbers.get(0);
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
            sum += current;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее арифметическое: " + average);
    }
}
