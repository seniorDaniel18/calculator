import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите две цифры:  ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double ans;

        System.out.print("Выберите действие (+, -, *, /): ");
        char op = scanner.next().charAt(0);


        switch (op) {
            case '+' -> ans = num1 + num2;
            case '-' -> ans = num1 - num2;
            case '*' -> ans = num1 * num2;
            case '/' -> ans = num1 / num2;
            default -> {
                System.out.print("Ошибка! Выберите правильное действие. ");
                return;
            }
        }
        System.out.print("Результат: ");
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);

    }

}
