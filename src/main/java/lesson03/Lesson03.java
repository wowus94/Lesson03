package lesson03;

import java.util.Scanner;

public class Lesson03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean f = true;
        while (f) {
            System.out.println("Выберите игру:");
            System.out.println("1 - Угадайте число.");
            System.out.println("2 - Угадайте слово.");
            System.out.println("0 - Завершение работы приложения.");
            System.out.print("Ваш выбор: ");

            if (scanner.hasNextInt()) {
                int no = scanner.nextInt();
                scanner.nextLine();
                switch (no) {
                    case 0:
                        System.out.println("Завершение работы приложения.");
                        scanner.close();
                        f = false;
                        break;
                    case 1:
                        int n = 3;
                        boolean result = true;
                        while (result) {
                            int randNumb = (int) (Math.random() * 10);
                            task1(n, randNumb);
                            System.out.println("Повторить игру? (1-да, 0-нет)");
                            Scanner scanner = new Scanner(System.in);
                            int otv = scanner.nextInt();
                            if (otv == 0)
                                result = false;
                        }
                        break;
                    case 2:
                        task2();
                        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
                        System.out.println("Угадайте слово");

                        break;
                    default:
                        System.out.println("Вы ввели некорректный номер подпрограммы.\nПожалуйста, повторите попытку ввода.");
                }
            } else {
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите попытку ввода.");
                scanner.nextLine();
            }
        }
    }


    static void task1(int n, int randNumb) {
        System.out.println("Игра ''Угадайте число''\nПрограмма загадала число от 0 до 9.\nУ Вас есть 3 попытки,чтобы угадать. ");
        System.out.println("Загаданное число: ");
        for (int i = 0; i < n; i++) {
            int scannerNumb = scanner.nextInt();
            if (scannerNumb == randNumb) {
                System.out.println("Вы угадали");
                return;
            } else if (scannerNumb > randNumb) {
                System.out.println("Загаданное число меньше");
                System.out.println("Осталось попыток:" + (n - 1 - i));
            } else {
                System.out.println("Загаданное число больше");
                System.out.println("Осталось попыток:" + (n - 1 - i));
            }
        }
        System.out.println("Загаданное число:" + randNumb);

    }

    static void task2() {
        System.out.println("Угадайте слово");
    }
}
