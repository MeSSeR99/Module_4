import java.util.Scanner;
public class MiddleTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 значение");
        int a = scanner.nextInt();
        System.out.println("Введите 2 значение");
        int b = scanner.nextInt();
        double res = (a / b);
        if (a % b == 0) {
            System.out.println("Первое число кратно второму числу.");
        } else {
            System.out.println("Первое число не кратно второму числу.");
            System.out.println("Остаток от деления: " + a % b);
        }
    }
}