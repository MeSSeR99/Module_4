
import java.util.Scanner;

public class MiddleTask_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите список продуктов через запятую:");
        String productsInput = scanner.nextLine();
        String[] products = productsInput.split(",");

        boolean Eggs = false;
        boolean Milk = false;
        boolean Coffee = false;

        for (String product : products) {
            String trimmedProduct = product.trim().toLowerCase();

            if (trimmedProduct.equals("яйца")) {
                Eggs = true;
            } else if (trimmedProduct.equals("молоко")) {
                Milk = true;
            } else if (trimmedProduct.equals("кофе")) {
                Coffee = true;
            }
        }

        System.out.println("Возможные блюда:");

        if (Eggs) {
            System.out.println("- Яичница");
        }

         if (Eggs && Milk) {
            System.out.println("- Омлет");
        }

        if (Coffee && Milk) {
            System.out.println("- Кофе");
        }

    }
}