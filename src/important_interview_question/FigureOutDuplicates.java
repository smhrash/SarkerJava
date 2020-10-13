package important_interview_question;

import java.util.HashSet;
import java.util.Set;

public class FigureOutDuplicates {

    public static void main(String[] args) {

        String names[] = {"Java", "Ruby", "C", "Python", "Java", "C"};

        //1. solution but this is not a good solution
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].equals(names[j])) {

                    System.out.println("The duplicate value is " + names[i]);
                }
            }
        }
        System.out.println("========================================");

        // 2. using hash set and this is a good solution
        Set <String> store = new HashSet<>();
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("The duplicate value is " + name);
            }
        }

    }
}
