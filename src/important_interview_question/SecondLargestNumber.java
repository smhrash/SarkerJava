package important_interview_question;

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] numbers = {24, 40, 50, 60, 70, 80, 90, 100};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];

            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("The Second Largest number: " + secondLargest);
    }
}
