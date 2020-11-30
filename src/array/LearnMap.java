package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnMap {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(2001,"Maria");
        students.put(2002,"Sofia");
        students.put(2003,"Denys");
        students.put(2004,"Anna");
        students.put(2005,"Jacob");

        students.forEach((k,v) -> System.out.println("Id: "+k+" and name: "+v));

        System.out.println("=================another way================");

        Set<Integer> stId= students.keySet();
        for (int id:stId) {
            System.out.println("Id: "+id+" and name: "+students.get(id));

        }
    }
}
