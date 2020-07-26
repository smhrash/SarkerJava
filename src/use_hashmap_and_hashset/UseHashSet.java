package use_hashmap_and_hashset;

import java.util.HashSet;

public class UseHashSet {

    public static void main(String[] args) {

        HashSet<String> hs=new HashSet<String>();
        hs.add("Lemon");
        hs.add("Phone");
        hs.add("Computer");
        hs.add("car");
        hs.remove("Lemon");

        System.out.println(hs);

    }
}
