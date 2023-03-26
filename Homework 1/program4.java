import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();

        int q = -1, w = -1, e = -1;
        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c >= '0' && c <= '9') {
                if (q == -1) {
                    q = c - '0';
                } else if (w == -1) {
                    w = c - '0';
                } else if (e == -1) {
                    e = c - '0';
                }
            }
        }

        for (int i = 0; i <= 9; i++) {
            int q1 = q, w1 = w, e1 = e;
            if (q == -1) {
                q1 = i;
            } else if (w == -1) {
                w1 = i;
            } else if (e == -1) {
                e1 = i;
            }
            if (q1 + w1 == e1) {
                System.out.println(q1 + "" + w1 + " + " + w1 + "" + e1 + " = " + q1 + "" + w1 + e1);
            }
        }
    }
}
