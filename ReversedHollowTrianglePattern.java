import java.util.Scanner;

public class ReversedHollowTrianglePattern {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the triangle: ");
        int n = scanner.nextInt();

        // Check for valid input
        if (n <= 0) {
            System.out.println("Number of rows must be greater than zero.");
            return;
        }

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Print leading spaces for the current row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print the pattern
            for (int j = 0; j < n - i; j++) {
                if (j == 0 || j == n - i - 1 || i == 0) {
                    System.out.print("*"); // Print star for edges and top row
                } else {
                    System.out.print(" "); // Print space for hollow part
                }
            }
            
            // Move to the next line
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
