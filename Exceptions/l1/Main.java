package lesson_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 3, 2, 1};
//        System.out.println(findDivision(1, 0));
//        System.out.println(findDivisionTwo(1, 0));
//        System.out.println(findDivisionThree(1, 0));
        System.out.println(Arrays.toString(Newarray(array1, array2)));
    }

    public static int findDivision(int numX, int numY){
        int division;
        if (numY == 0) {
            throw new RuntimeException("На ноль делить нельзя. Ошибка -1");
        } else {
            division = numX / numY;
        }
        return division;
    }

    public static int findDivisionTwo(int numX, int numY){
        int division;
        if (numY == 0) {
            return -1;
        } else {
            division = numX / numY;
        }
        return division;
    }

    public static int findDivisionThree(int numX, int numY){
        int division;
        division = numX / numY;
        return division;
    }

    public static int[] Newarray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не совпадают. Ошибка -1");
        }
        int[] array = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i] - array2[i];
        }
        return array;
    }
}