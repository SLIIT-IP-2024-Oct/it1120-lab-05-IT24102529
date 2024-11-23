import java.util.Scanner;

public class IT24102529Lab5Q3 {

    // Constants
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_10 = 10;
    public static final int DISCOUNT_20 = 20;

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Start date and End date
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1: Dates should be between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Date should be between 1 and 31.");
            return; // Exit the program
        }

        // Validation 2: Start date should be less than end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than end date.");
            return; // Exit the program
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate;

        // Calculate the discount based on the number of days
        int discountPercentage = 0;
        if (numberOfDays >= 5) {
            discountPercentage = DISCOUNT_20;
        } else if (numberOfDays >= 3) {
            discountPercentage = DISCOUNT_10;
        }

        // Calculate the total cost
        int totalCost = numberOfDays * ROOM_CHARGE_PER_DAY;
        int discountAmount = (totalCost * discountPercentage) / 100;
        int totalAmount = totalCost - discountAmount;

        // Display the result
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Total amount to be paid: Rs " + totalAmount);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
