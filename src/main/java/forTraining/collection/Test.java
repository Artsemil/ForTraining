package forTraining.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        Date date = new Date();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        feelCollections(arrayList, linkedList);
        System.out.println(date.getTime());
        System.out.println("Array list time: " + date.getTime() + "     " + arrayList.get(50000));
        System.out.println("Array list time: " + date.getTime() + "     " + linkedList.get(50000));

    }

    static void feelCollections(List list1, List list2) {
        for (int i = 0; i < 100000; i++) {
            list1.add(i);
            list2.add(i);
        }
    }
}
