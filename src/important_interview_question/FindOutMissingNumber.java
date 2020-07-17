package important_interview_question;

public class FindOutMissingNumber {

    // Write a Java Program to find out the missing number

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 8};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        System.out.println(sum);

        int sum1 = 0;
        for (int j = 1; j <= 8; j++) {
            sum1 = sum1 + j;
        }
        System.out.println(sum1);
        System.out.println("Missing number is " + (sum1 - sum));


    }
}
