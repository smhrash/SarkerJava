package important_interview_question;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence or word");
        String str = sc.nextLine();
        char [] letters = str.toCharArray();

        int count = 0;
        for (char ltr:letters) {


            switch (ltr){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    count++;
                    break;



            }


        }
        System.out.println("The vowel number is: "+count);
    }
}
