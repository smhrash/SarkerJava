package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String[] args) {

        ArrayList <Object>elements= new ArrayList<>();
        elements.add("Java");
        elements.add(5);
        elements.add(true);
        elements.add(2.5);
        System.out.println(elements);
        System.out.println(elements.get(2));
        System.out.println(elements.size());

        ArrayList<String> students = new ArrayList<>();

        students.add("Tom");
        students.add("Tommy");
        students.add("Tomalo");
        students.add("Tamim");
        for (int i = 0; i <students.size(); i++){
            System.out.println(students.get(i));

        }
        for (String st : students){
            System.out.println(st);
        }

        Iterator<String> it= students.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());

        }
            System.out.println("==================");

            ArrayList<Integer>  numbers = new ArrayList<>(Arrays.asList(23,45,677,88,34,90));
            System.out.println(numbers);

    }
}
