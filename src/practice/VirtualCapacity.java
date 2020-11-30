package practice;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;

public class VirtualCapacity {

    public static void main(String[] args) {
        ArrayList<Object> lists = new ArrayList<>(20);

        System.out.println(lists.size());
        lists.add(200);
        lists.add(300);
        lists.add(400);
        lists.add(500);
        lists.add(600);
        lists.add(700);
        System.out.println(lists);
        System.out.println(lists.size());

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(456676);


    }


}
