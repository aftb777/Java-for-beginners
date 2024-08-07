import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int spaces = x - 1;
        int stars = 1;
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= stars; k++){
                System.out.print(" * ");
            }
            spaces--;
            stars = stars + 2;
            System.out.println();
        }

        scn.close();
    }
}
