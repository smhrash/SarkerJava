package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 5, 4));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(numbers);

        ArrayList<Integer> numberWithoutDuplicate = new ArrayList<>(linkedHashSet);
        System.out.println(numberWithoutDuplicate);

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 32, 33, 4, 5, 68, 7, 8,68, 9, 7, 5, 4));

        List<Integer> uniqueNum = numbers1.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNum);
    }
}
