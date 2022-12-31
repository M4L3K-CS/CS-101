package CS101.Lab.Labwork_4;

/* Write a program that checks if a number is a palindrome. */
public class Main {
    public static void main(String[] args) {
        int num = 3553, reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }

    }
}