import java.util.Scanner;
public class MiddleTask_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 стороны треугольника");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b + c || b > a + c || c > b + a) {
            System.out.println("NO");
        } else System.out.println("YES");
    }
}
