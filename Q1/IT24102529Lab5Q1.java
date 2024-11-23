import java.util.Scanner;

public class IT24102529Lab5Q1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        // Calculate the smallest and largest numbers
        int smallest = num1;
        int largest = num1;

        // Find the smallest
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Find the largest
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Display the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
