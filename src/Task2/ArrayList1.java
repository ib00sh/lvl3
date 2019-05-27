package Task2;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Double[] doubArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        String[] strArray = {"один", "два", "три", "четыре", "пять", "шесть"};
        arrayToArrayList(intArray);
        arrayToArrayList(doubArray);
        arrayToArrayList(strArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubArray));
        System.out.println(Arrays.toString(strArray));
    }

    private static <T> ArrayList arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
