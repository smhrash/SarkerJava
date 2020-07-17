package important_interview_question;

public class PrintPattern {

    //Write a Java Program to print a pattern like bellow

    /**
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { //print column
            for (int j = 1; j <= i; j++) { // print row
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
