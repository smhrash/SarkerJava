package important_interview_question;

public class ReverseInteger {

    // Write a Java Program to reverse the integer number
    public static void main(String[] args) {
        // 1. using Java algorithm
        long num = 123456789;
        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse number is " + rev);

        // using StringBuffer method
        long num1 = 123456;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }


}
