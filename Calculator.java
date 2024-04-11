import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first whole number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second whole numnber: ");
    int num2 = scanner.nextInt();

    System.out.println("Choose an operation (+ or -):");
    char operation = scanner.next().charAt(0);

    switch (operation) {
        case '+':
        System.out.println("The sum is: " + (num1 + num2));
        break;
        case '-':
        System.out.println("The diffrence is: " + (num1 - num2));
        break;
        default:
        System.out.println("Invalid operation.");
    }
    scanner.close();
    }
}