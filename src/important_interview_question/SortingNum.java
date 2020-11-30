package important_interview_question;

import java.util.Arrays;

public class SortingNum {

    //Write a Java program to sort an Array of Integer.
    public static void main(String[] args) {
        // Insertion sort
        int[] numbers = {24, 34, 76, 23, 2, 4, 70, 46, -40};
        // output: 2 4 23 24 34 46 70 76

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("=============== another way ===================");

        int[] number = {24, 34, 76, 23, 2, 4, 70, 46, 800, -3, 6};
        Arrays.sort(number);

        for (int nm : number) {
            System.out.print(nm + " ");

        }
        System.out.println();


    }
}
