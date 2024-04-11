import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first whole number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second whole numnber: ");
    int num2 = scanner.nextInt();

    int sum = num1 + num2;
    System.out.println("The sum is: " + sum);

    scanner.close();
    }
}