import java.util.Scanner;
public class EasyTask_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число х");
        int x = scanner.nextInt();
        if (x>0) {
        System.out.println("y = " + 2 * x );
        } else {
        System.out.println("y = " + x * -2 );}
    }
}
