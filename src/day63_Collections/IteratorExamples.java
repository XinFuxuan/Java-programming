package day63_Collections;

import homeWork.test4.Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("john");
        list.add("jamie");
        list.add("jorge");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        it.next();
        it.remove();
        System.out.println(list);
        Set<String>names = new HashSet<>();
        names.add("James");
        names.add("kinga");
        names.add("mj");
        names.add("john");
        names.add("Pavirn");

        Iterator<String> iterator = names.iterator(); // it start beoferthe firat elememnt
        while (iterator.hasNext()){
            String currentName = iterator.next();
            System.out.println(currentName);
            if(currentName.length()<3){
                iterator.remove();
            }
        }




    }
}
