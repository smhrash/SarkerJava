package interviewqustions;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int actualNum = num;
        while (num != 0) {

            rev = rev * 10 + num % 10;
            num = num / 10;

        }

        if (actualNum == rev) {
            System.out.println(actualNum + " is a palindrome");
        } else {
            System.out.println(actualNum + " is not a palindrome");
        }
    }
}
