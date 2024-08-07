import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        for(int i = 1; i <= x; i++){
            for(int j = 0; j < x - i + 1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        scn.close();
    }
}
