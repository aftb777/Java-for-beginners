import arithmatic.*;
import java.util.*;

public class main {
    public static void main(String[] args) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enfter first number : ");
        int num1 = scn.nextInt();

        System.out.print("Enter second number : ");
        int num2 = scn.nextInt();
        
        int sum = addition.add(num1, num2);
        int difference = subtraction.sub(num1, num2);
        
        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);

        scn.close();
    }
}