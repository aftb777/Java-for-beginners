import java.util.Scanner;
public class countnum {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int count = 0;
        while(x != 0){
            int lastdigit = x % 10;
            x = x/10;
            count++;
            System.out.println(lastdigit);
        }
        System.out.println("Total no of digits in x is " + count);


        scn.close() ;
    }
}
