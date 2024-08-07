class Palindrome{
    static boolean pal(int i, String s){
        if(i >= s.length() / 2) return true;

        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        return pal(i + 1, s);
    }

    public static void main(String[] args) {
        String s = "MADAM";
        System.out.println(pal(0,s));
    }
}