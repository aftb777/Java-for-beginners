import java.util.Scanner;

class Recursion{
    static void func(int i, int n){
        if(i > n) return;
        System.out.println("Aftaab");

        func(i + 1, n);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of times : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        func(1,n);

        scn.close();
    }
}