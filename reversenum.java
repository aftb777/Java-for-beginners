import java.util.*;
public class reversenum {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();

            int revnum = 0;
            while(x != 0){
                int ld = x % 10;
                revnum = (revnum * 10) + ld;
                x = x/ 10;
            }
            System.out.print(revnum);

            scn.close();
    }
}