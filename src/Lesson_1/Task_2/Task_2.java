//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.
//        При этом накладываем на метод 2 ограничения: метод может работать только с
//        квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
//        только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
//        ошибке.

package Lesson_1.Task_2;

public class Task_2 {
    public static void main(String[] args) {
        int [][] array1 = {{0,1,0}, {1,1,1,1}, {0,0,1}};
        int [][] array2 = {{0,1,0}, {1,1,3}, {0,0,1}};
        int [][] array3 = {{0,1,0}, {1,1,1}, {0,0,1}};

//        System.out.printf("Cумма = %d", getSum(array1));
//        System.out.printf("Cумма = %d", getSum(array2));
        System.out.printf("Cумма = %d", getSum(array3));
    }
    public static boolean checkArray(int [][] array){
        for (int [] item: array) {
            for (int elem : item) {
                if (elem != 0 && elem != 1) {
                    throw new RuntimeException("Значения массива не соответствуют 0 и 1");
                }
            }
            if (array.length != item.length) {
                throw new RuntimeException("Массив не является квадратом");
            }
        }
        return true;
    }

    public static int getSum(int [][] array){
        int sum = 0;
        if(checkArray(array)) {
            for (int[] item : array) {
                for (int elem : item) {
                    sum += elem;
                }
            }
        }
        return sum;
    }
}

