

import java.util.Scanner;

public class HardTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты пешки (X, Y):");
        char pawnX = scanner.next().charAt(0);
        int pawnY = scanner.nextInt();

        System.out.println("Введите координаты слона (X, Y):");
        char elephantX = scanner.next().charAt(0);
        int elephantY = scanner.nextInt();

        int a = (pawnX - pawnY);
        int b = (elephantX - elephantY);

        if (a == b) {
            System.out.println("Пешка находится под боем слона.");
        } else {
            System.out.println("Пешка не находится под боем слона.");
        }
    }
}