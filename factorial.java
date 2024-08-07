import java.util.Scanner;

class Factorial{
    public static int fact(int n){
        if(n == 1 || n ==0){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int result = fact(n);
        System.out.println(result);

        scn.close();
    }
}