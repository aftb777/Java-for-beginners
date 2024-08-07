import java.util.*;
class code{
static boolean ArmstrongNumber(int n){
    int originalno = n;
    int count = 0;
    int temp = n;
    while (temp != 0){
        count++;
        temp = temp / 10;
    }
    int sumofpower = 0;
    while (n != 0){
        int digit = n % 10;
        sumofpower += Math.pow(digit,count);
        n /= 10;
    }
    return (sumofpower == originalno);
}
public static void main(String args[]){
    System.out.print("Enter the number : ");
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    if (ArmstrongNumber(x)){
        System.out.println("Yes, it is an Armstrong Number\n");
    }
    else{
        System.out.println("No, it is not an Armstrong Number\n");
    }  

    scn.close();
}
}