import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= star; j++){
                System.out.print(" * ");
            }
            star++;
            System.out.println();
        }

        scn.close();
    }
}
