package CS101.Lab.Labwork_5;

/* Write a static method that takes a string as an argument and returns it as another string. */
public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
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
