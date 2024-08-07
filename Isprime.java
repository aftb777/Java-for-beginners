import java.util.Scanner;
public class Isprime{
    public static void main(String[]args){
        System.out.print("Enter the Number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int count = 0;
        for(int i = 1; i <= x; i++)
        {
            if(x%i == 0)
            {
                count++;
            }
        }

        if(count == 2){
            System.out.println("Prime number");
        } 
        else{
            System.out.println("Not prime number");
        }

        scn.close();
    }
}
