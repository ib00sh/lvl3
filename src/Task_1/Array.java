package Task_1;
//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Integer[] intMass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] doubMass = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        String[] strMass = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        showResult(intMass,3,8);
        showResult(doubMass,5,1);
        showResult(strMass,2,7);
    }


    public static void sort(Object[] mass, int firstEl, int secondEl)  {
        Object temp = mass[firstEl];
        mass[firstEl] = mass[secondEl];
        mass[secondEl] = temp;
    }

    public static void showResult(Object[] mass, int firstEl, int secondEl)  {
        System.out.println(Arrays.toString(mass));
        sort(mass, firstEl, secondEl);
        System.out.println("Меняем местам элемент " + (firstEl+1) + " с элементом " + (secondEl + 1));
        System.out.println("Массив с измененнысм элементами");
        System.out.println(Arrays.toString(mass));
        System.out.println("______________");

    }
}


