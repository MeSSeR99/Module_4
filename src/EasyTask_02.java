import java.util.Scanner;
public class EasyTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4");
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("Зима");
        } else if (x == 2) {
            System.out.println("Весна");
        } else if (x==3) {
            System.out.println("Лето");
        } else if (x==4) {
            System.out.println("Осень");
        } else {
            System.out.println("Введено некоректное значение");}
    }
}
