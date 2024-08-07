import java.util.*;

class stringhash{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s;
        s = scn.next();

        int[] hash = new int[256];
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i)]++;
        }
        int q ;
        q = scn.nextInt();
        while(q-- > 0){
            char c;
            c = scn.next().charAt(0);
            System.out.println(hash[c]);
        } 


        scn.close();
    }
}