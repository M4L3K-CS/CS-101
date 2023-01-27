package CS101.Lab.Labwork_6;

/* Given the reverse() method in (1) write a static method that takes
 a String as an argument and returns true if it is a palindrome, false otherwise  */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome(String s) {
        String r = reverse(s);
        return s.equals(r); // or replace both lines with : retrun s.equals(reverse(s));
    }

    public static String reverse(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = c + result;
        }
        return result;
    }
}
