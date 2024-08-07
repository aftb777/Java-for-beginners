import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        scn.close();
    }
}
