package important_interview_question;

import java.util.Scanner;

public class PrintPyramidPattern {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the layer number");
        int layerNum = input.nextInt();

        for (int i = 1; i <= layerNum; i++) {
            for (int j = i; j <= layerNum; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
