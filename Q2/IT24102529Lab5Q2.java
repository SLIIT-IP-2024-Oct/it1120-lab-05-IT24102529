import java.util.Scanner;

public class IT24102529Lab5Q2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();
        
        // Validate the input (should be greater than or equal to 0)
        if (newMembers < 0) {
            System.out.println("Invalid input. The number of new members must be greater than or equal to 0.");
        } else {
            // Use a switch statement to determine the prize
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
            }
            
            // Display the prize the customer is entitled to
            System.out.println("The prize you are entitled to is: " + prize);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
