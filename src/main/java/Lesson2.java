import java.util.Scanner;

/**
 * @author OVoronina
 * @see #main(String[])
 */

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Выберете действие: \n1 - сложение \n2 - вычитание \n3 - умножение \n4 - деление");
        int znak = scanner.nextInt();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();


        //здесь могла быть ваша реклама
        Lesson2_calculator result = new Lesson2_calculator();
        System.out.print("Результат: ");
        System.out.printf("%.4f", result.result(a, b, znak));



    }
}
