import java.util.Scanner;
public class pattern1{
    public static void main(String[] args){
        System.out.print("Enter the number of stars : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        for(int i = 1; i <= x; i++){
            
            for(int j=1; j <= x; j++){
            System.out.print(" * ");
            }
            System.out.println();
        }

        scn.close();
    }
}