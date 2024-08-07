import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args){
        System.out.print("Enter the Number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int num = 1;
        int value = 1;
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(value + " ");
                value++;
            }
            num++;
            System.out.println();
        }


        scn.close();
    }
}
