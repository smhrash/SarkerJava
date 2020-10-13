package important_interview_question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestAndSmallestNumber {


    // Write a Java Program to figure out largest and smallest numbers in a array
    public static void main(String[] args) {

        int numbers[] = {23, -10, 34, 666};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];

            }
        }
        System.out.println("Given array is " + Arrays.toString(numbers));
        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);


    }
}
