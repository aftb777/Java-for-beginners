import java.util.Scanner;
public class pattern16{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();

        for(int i = 0; i < x; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char)((int)('A' + i)) + " ");
            }
            System.out.println();
        }

        num.close();
    }
}