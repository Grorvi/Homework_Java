import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Вычисление n-ого треугольного числа
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("Треугольное число 1 + 2 + ... + " + n + " = " + triangleNumber);

        // Вычисление n!
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n! 1 * 2 * ... * " + n + " = " + factorial);
    }
}
