import java.util.Scanner;
public class palindromenum {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();
            int dummy = x;
            int y = 0;
            while(x > 0){
                int digit = x % 10; 
                y = y * 10 + digit;
                x = x/10;
            }
                {
                if(dummy == y){
                    System.out.print("true");
                }
                else{
                    System.out.println("false");
                }
                }

                scn.close();
    }
}