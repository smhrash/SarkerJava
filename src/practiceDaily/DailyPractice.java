package practiceDaily;

import java.awt.*;
import java.text.Collator;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class DailyPractice {

    public static void main(String[] args) {


        List<Integer> arrayList =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 5, 4));

        Set<Integer> numSet = new HashSet<>(arrayList);

        System.out.println(numSet);







    }
}


