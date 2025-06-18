package opgave01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> integers = new ArrayList<>(List.of(17, 34, -23, 0, 202, 1));
        int sum = sum(integers).intValue();
        System.out.println("sum = " + sum);
    }

    private static Number sum(ArrayList<Number> integers) {
        return sum(integers, 0, integers.size() - 1);
    }

    private static int sum(ArrayList<Number> integers, int left, int right) {
        //TODO
        if (left == right){
            return integers.get(left).intValue();
        } else {
            int mid = (integers.size() -1) / 2;

            int sum1 = sum(integers, left, mid);
            int sum2 = sum(integers,  mid + 1, right);

            return sum1 + sum2;
        }
    }
}
