package CS101.Lab.Labwork_7;

/* Write a program that tells you if a string is a palindrome without using the reverse methode. */
public class Main {
    public static void main(String[] args) {
        String s = "abbas";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(int i, int j, String s) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return isPalindrome(i + 1, j - 1, s);
    }

    public static boolean isPalindrome(String s) {
        return isPalindrome(0, s.length() - 1, s);
    }

}
