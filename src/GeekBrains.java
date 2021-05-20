import java.util.Scanner;

public class GeekBrains {
    public static void main(String[] args) {
        System.out.println("Введите операцию: ");
        System.out.println("1. Вычитание");
        System.out.println("2. Сложение");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int operetion = scanner.nextInt();
        System.out.println("Ведите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result;
        if (operetion == 1) {
            result = a -b;
        } else if (operetion == 2){
            result = a +b;
    } else if (operetion == 3) {
            result = a * b;
        } else result = a/b;
        System.out.println("Результат " + result);

        }
    }

