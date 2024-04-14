import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print multiplication table
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}
