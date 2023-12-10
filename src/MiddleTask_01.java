import java.util.Scanner;

public class MiddleTask_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 значения");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid;
        if (a > min && a < max) {
            mid = a;
        } else if (b > min && b < max) {
            mid = b;
        } else {
            mid = c;
        }
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальное значение " + min);
        System.out.println("Среднее значение " + mid);
    }
}
