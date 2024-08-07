import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows you want : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int num = 1;
        for(int i = 1; i <= x; i++){
            for(int j = 1; j<= num; j++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }

        scn.close();
    }
}
