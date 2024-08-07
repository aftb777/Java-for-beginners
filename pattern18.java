import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        for(int i = 0; i < x; i++){
            for(char ch =(char) (int) ('A'+x-1-i); ch <= (char) (int) ('A' + x - 1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
