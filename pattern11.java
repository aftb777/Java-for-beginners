import java.util.Scanner;
public class pattern11{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int start = 1;
        for(int i = 0; i < x; i++){
                if(i % 2 == 0){
                    start = 1;
                }
                else{
                    start = 0;
                }
                for(int j = 0; j<= i; j++){
                    System.out.print(start);
                    start = 1 - start;
                }
                System.out.println();
            }

            scn.close();
        }
    }