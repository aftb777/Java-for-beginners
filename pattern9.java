import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int stars = 1;
        int spaces = x/2;

        for(int i = 1; i <= x; i++){
            for(int k = 1; k <= spaces; k++){
                System.out.print("   ");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print(" * ");
            }

           if(i <= x/2){
                stars = stars + 2;
                spaces--;
            }
            else{
                stars= stars -2;
                spaces++;
            }
            System.out.println();
        }

        scn.close();
    }
}
