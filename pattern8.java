import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int stars = 2 * x -1;
        int spaces = 0;
        for(int i =1; i <= x; i++){
            for(int k = 1; k <= spaces; k++){
                System.out.print("   ");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print(" * ");
            }

            stars = stars - 2;
            spaces++;
            System.out.println();
        }


        scn.close();
    }
}
