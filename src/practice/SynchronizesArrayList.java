package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizesArrayList {

    public static void main(String[] args) {

        List<String> names = Collections.synchronizedList(new ArrayList<>());
        names.add("Rashid");
        names.add("Sami");
        names.add("Ruma");
        names.add("Runa");
        System.out.println(names);

        synchronized (names){
            Iterator <String> it = names.iterator();
            while (it.hasNext()){

                System.out.println(it.next());
            }


        }
        CopyOnWriteArrayList<String> name = new CopyOnWriteArrayList<>();
        name.add("hasan");
        name.add("hasina");
        name.add("helena");
        name.add("hasi");
        for (String nm : name){
            System.out.println(nm);
        }
    }
}
