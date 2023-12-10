import java.util.Scanner;
public class HardTask_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру для вычисления площади:");
        System.out.println("1. Прямоугольник");
        System.out.println("2. Треугольник");
        System.out.println("3. Круг");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Введите длину прямоугольника: ");
                double length = scanner.nextDouble();
                System.out.print("Введите ширину прямоугольника: ");
                double width = scanner.nextDouble();
                double area = length * width;
                System.out.println("Площадь прямоугольника: " + area);
                break;
            case 2:
                System.out.print("Введите основание треугольника: ");
                double base = scanner.nextDouble();
                System.out.print("Введите высоту треугольника: ");
                double height = scanner.nextDouble();
                double area1 = (base * height) / 2;
                System.out.println("Площадь треугольника: " + area1);
                break;
            case 3:
                System.out.print("Введите радиус круга: ");
                double radius = scanner.nextDouble();
                double area2 = Math.PI * radius * radius;
                System.out.println("Площадь круга: " + area2);
                break;
            default:
                System.out.println("Некорректный выбор фигуры.");
                break;
        }
    }
}


