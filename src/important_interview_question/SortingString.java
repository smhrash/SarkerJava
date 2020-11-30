package important_interview_question;

import java.util.*;

public class SortingString {

    public static void main(String[] args) {

        String[] names = {"Denys", "Anna", "Maria", "Nelson", "Richard", "Amy"};

        System.out.println("============ Input Unsorted List ===================");

        showList(names);

        System.out.println("============ Sorted List ===================");

        Arrays.sort(names);
        showList(names);

        System.out.println("============ Case Sorted List ===================");

        Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
        showList(names);


    }

    public static void showList(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();


    }
}
