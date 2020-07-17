package interviewqustions;

import java.util.HashSet;
import java.util.Set;

public class FindOutDuplicate {

    public static void main(String[] args) {

        String names[] = {"Java", "JavaScript", "C", "Ruby", "Python", "Java", "C"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].equals(names[j])) {

                    System.out.println("The duplicate value is " + names[i]);
                }
            }
        }
        System.out.println("================================================");
        // using Hashset
        Set<String> store = new HashSet<>();
        // for each loop
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("The duplicate value is " + name);

            }
        }

    }
}
