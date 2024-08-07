import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        for(int i = 0; i < x; i++){
          
            // for printing the spaces.
            for(int j = 0; j < x - i - 1; j++){
                System.out.print(" ");
            }
            
            // for printing the characters.
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for(int j = 1; j <= 2 * i + 1; j++){
                
                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            
            // for printing the spaces again.
            for(int j = 0; j < x - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        scn.close();
    }
}
