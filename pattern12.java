import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int spaces = x * 2 - 2;
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = 1; k <= spaces; k++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            spaces = spaces - 2;
            System.out.println();
        }


        scn.close();
    }
}
