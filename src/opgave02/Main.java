package opgave02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(0, 14, 0, 42, 0, -1, 0, 101));
        int numberOfZeros = countZeros(integers);
        System.out.println(numberOfZeros);
    }

    public static int countZeros(ArrayList<Integer> integers) {
        return countZeros(integers, 0, integers.size() - 1);
    }


    private static int countZeros(ArrayList<Integer> integers, int startIndex, int slutIndex) {

        if (startIndex == slutIndex) {
            if (integers.get(startIndex) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int mid = startIndex + (slutIndex - startIndex) / 2;
            int set1 = countZeros(integers, startIndex, mid);
            int set2 = countZeros(integers, (mid + 1), slutIndex);

            return set2 + set1;
        }

    }
}
