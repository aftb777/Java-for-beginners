import java.util.*;

public class MessageUtils {

    private static int generateRandomShift() {
        Random random = new Random();
        return random.nextInt(25) + 1; 
    }

    public static String encrypt(String plainText, int shift) {
        return shiftText(plainText, shift);
    }

    public static String decrypt(String encryptedText, int shift) {
        return shiftText(encryptedText, -shift);
    }

    private static String shiftText(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char i : text.toCharArray()) {
            if (Character.isLetter(i)) {
                char base;
                if (Character.isLowerCase(i)) {
                    base = 'a';
                } else {
                    base = 'A';
                }
                result.append((char) ((i - base + shift + 26) % 26 + base));
            } else {
                result.append(i); 
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        String message = "";
        String encryptedMessage = "";

        int shift = 0;

        while (continueRunning) {
            if (message.isEmpty()) {
                System.out.print("Enter your message: ");
                message = scanner.nextLine();
                
                shift = generateRandomShift();

                encryptedMessage = encrypt(message, shift);
            }

            System.out.println("Choose an option:");
            System.out.println("1. View Encrypted Message");
            System.out.println("2. View Decrypted Message");
            System.out.println("3. View Both Encrypted and Decrypted Messages");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1, 2, 3, or 4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Encrypted Message: " + encryptedMessage);
                    System.out.println();
                    break;
                case 2:
                    String decryptedMessage = decrypt(encryptedMessage, shift);
                    System.out.println("Decrypted Message: " + decryptedMessage);
                    System.out.println();
                    break;
                case 3:
                    String decryptedMessageBoth = decrypt(encryptedMessage, shift);
                    System.out.println("Encrypted Message: " + encryptedMessage);
                    System.out.println("Decrypted Message: " + decryptedMessageBoth);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
                    break;
            }

            if (choice == 4) {
                message = "";
            }
        }

        scanner.close();
    }
}