import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args){
        System.out.print("Enter the Number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= x - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        scn.close();
    }    
}