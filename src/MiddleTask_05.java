import java.util.Scanner;

    public class MiddleTask_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите a: ");
            double a = scanner.nextDouble();

            System.out.print("Введите b: ");
            double b = scanner.nextDouble();

            System.out.print("Введите c: ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (discriminant >= 0) {


                System.out.println("Есть действительные корни");
            } else {
                System.out.println("Уравнение не имеет корней");
            }
        }
    }

