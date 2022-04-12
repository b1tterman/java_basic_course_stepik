import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        scanner.useLocale(Locale.ENGLISH);
        out.println("Введите число:");
        double sum = 0;
        while (scanner.hasNext()) {
            try {
                sum += Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
            }
        }
        System.out.printf("%.6f", sum);
    }
}