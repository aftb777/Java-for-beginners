import java.util.Scanner;

class Reverse{ 
    static void func(int i, int n){
        if(i < 1)return;
        System.out.println(i);

        func(i - 1, n);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of times : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        func(n,n);

        scn.close();
    }
}