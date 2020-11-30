package practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class ArrayMethod {
    public static void main(String[] args) {

        ArrayList<String> lists = new ArrayList<>();

        lists.add("Tom");
        lists.add("Steve");
        lists.add("Denys");
        lists.add("Michel");
        lists.add("Tommy");

        ArrayList<String> lists1 = new ArrayList<>();
        lists1.add("Rash");
        lists1.add("Suma");
        lists1.add("Kazi");
        lists1.add("Shami");
        lists1.add("Hasi");

        System.out.println(lists);
        System.out.println(lists1);
        //lists.addAll(lists1);

//        lists.addAll(2,lists1);
//        System.out.println(lists);
//
//        lists.clear();
//        System.out.println(lists);

        ArrayList<String> cloneLists = (ArrayList) lists.clone();
        System.out.println(cloneLists);
        System.out.println(lists.contains("Denys"));
        System.out.println(lists.indexOf("Denys"));
        System.out.println(lists.indexOf("Denys") > 1);

        ArrayList<String> states = new ArrayList<>(Arrays.asList("NY", "NJ", "CA", "FL"));
        int i = states.lastIndexOf("FL");
        System.out.println(i);
        System.out.println(states);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        numbers.removeIf(num -> num % 2 != 0);
        System.out.println(numbers);

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Canada","Australia","Canada","USA","UK","Canada"));
        countries.retainAll(Collections.singleton("Canada"));
        System.out.println(countries);

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        ArrayList<Integer> sublist = new ArrayList<>(numbers1.subList(2,8));
        System.out.println(sublist);

    }
}
