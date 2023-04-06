import java.util.Scanner;
import java.util.Stack;

public class Prog3 {
    public class Calculator {
        private static Stack<Integer> stack = new Stack<Integer>();
        private static Stack<Integer> history = new Stack<Integer>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Введите число или операцию (+, -, *, /, undo): ");
                String input = scanner.nextLine();
                if (input.equals("+")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int result = a + b;
                    stack.push(result);
                    history.push(result);
                    System.out.println("Ответ: " + result);
                } else if (input.equals("-")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int result = b - a;
                    stack.push(result);
                    history.push(result);
                    System.out.println("Ответ: " + result);
                } else if (input.equals("*")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int result = a * b;
                    stack.push(result);
                    history.push(result);
                    System.out.println("Ответ: " + result);
                } else if (input.equals("/")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int result = b / a;
                    stack.push(result);
                    history.push(result);
                    System.out.println("Ответ: " + result);
                } else if (input.equals("undo")) {
                    if (!history.isEmpty()) {
                        history.pop();
                        if (!history.isEmpty()) {
                            int result = history.peek();
                            stack.push(result);
                            System.out.println("Отмена -> " + result);
                        }
                    }
                } else {
                    int number = Integer.parseInt(input);
                    stack.push(number);
                }
            }
        }
    }
}
