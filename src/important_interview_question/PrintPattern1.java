package important_interview_question;

import java.util.Scanner;

public class PrintPattern1 {

    //  Write a Java Program to print pattern like bellow

    /*
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! How many stars would you like?");
        int numOfStar = scan.nextInt();

        for (int i = 1; i <= numOfStar; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = numOfStar-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
