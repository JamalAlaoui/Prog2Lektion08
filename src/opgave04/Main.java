package opgave04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(15, 0, -23, 42, 101, Integer.MIN_VALUE, 202, 0, -3));
        System.out.println(mergeSort(integers));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        //TODO --- base casen for mergesort er når en liste indeholder 1 eller 0 elementer

        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        ArrayList<Integer> sortedLeft = mergeSort(left);
        ArrayList<Integer> sortedRight = mergeSort(right);

        return merge(sortedLeft, sortedRight);
    }


    private static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //TODO


        // Total fletning
        ArrayList<Integer> results = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < list1.size() && i2 < list2.size()) {

            if (list1.get(i1) < list2.get(i2)) {
                results.add(list1.get(i1));
                i1++;
            } else {
                results.add(list2.get(i2));
                i2++;
            }
        }
        // tøm det resterende

        while (i1 < list1.size()) {
            results.add(list1.get(i1));
            i1++;
        }
        while (i2 < list2.size()) {
            results.add(list2.get(i2));
            i2++;
        }
        return results;
    }

}
