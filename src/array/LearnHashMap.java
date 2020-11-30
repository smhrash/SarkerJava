package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnHashMap {

    public static void main(String[] args) {

        HashMap <Integer,String> students = new HashMap<>();
        students.put(101,"Kazi Maoya");
        students.put(102,"Sarker Rashid");
        students.put(103,"Ruposri Bowmic");
        students.put(104,"Sami Sheikh");
        students.put(105,"Sami Sheikh");

        System.out.println(students.get(101));

        Set<Integer> keys = students.keySet();
        for (int stKey: keys){
            System.out.println("Student's ID: "+stKey+" and Name: "+students.get(stKey));

        }
        System.out.println("========= After Change ==============");

        students.replace(104,"Hasan Selim");

        Set<Integer> keys1 = students.keySet();
        for (int stKey1: keys1){
            System.out.println("Student's ID: "+stKey1+" and Name: "+students.get(stKey1));


        }

        System.out.println("============= Another way to fetch the value ================");

        Set <Map.Entry<Integer, String>> values = students.entrySet();

        for (Map.Entry <Integer,String> en:values){
            System.out.println("Student's ID: "+en.getKey()+ " and Name: "+en.getValue());

            System.out.println("============= Advanced way to fetch the value ================");

           students.forEach((k,v) ->{
               System.out.println("Student's id: "+k+" and Student's name: "+v);
           });

        }
    }
}
