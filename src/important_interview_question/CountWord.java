package important_interview_question;

import java.util.HashMap;
import java.util.Map;

public class CountWord {

    public static void main(String[] args) {

        String str = "I am am living living in New York York";

        Map <String, Integer> map = new HashMap<>();

        Integer count = 1;
        String [] arr = str.split(" ");

        for (int i = 0; i <str.length(); i++){
            if (!map.containsKey(arr[i])){

                map.put(arr[i], count);
            }else {
                map.put(arr[i], map.get(arr[i])+1);
            }


        }
        for (String x:map.keySet()) {

            System.out.println(x + " : "+map.get(x));

        }

    }
}
