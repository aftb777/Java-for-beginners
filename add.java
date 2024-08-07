import java.util.Scanner;
public class add 
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);

            System.out.print("Enter the number 1 : ");
                int num1 = num.nextInt();

            System.out.print("Enter the number 2 : ");
                int num2 = num.nextInt();

                System.out.print("The total is : ");
                System.out.println(num1 + num2);

                int _y = 10;
                System.out.println(_y);

                long x = 1000;
                int y = (int)x; //Explicit typecasting
                System.out.println(y);

                num.close();
    }
}