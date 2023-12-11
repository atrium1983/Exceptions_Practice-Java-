//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
//        значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
//        например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
//        качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
//        4. придумайте свои варианты исключительных ситуаций и верните соответствующие
//        коды ошибок.
//        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
//        метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
//        значение и покажет читаемый результат пользователю. Например, если вернулся -2,
//        пользователю выведется сообщение: “Искомый элемент не найден”.

package Lesson_1.Task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int [] numbers = null;
        int [] numbers = {1,2,3,4,5,6,7,8};
//        int [] numbers = {1,2,3,4,5,6,7,8}
        System.out.println("Введите число : ");
        String num = scanner.nextLine();
        if(checkIfInt(num)){
            System.out.printf("Индекс = %d", getIndex(numbers, Integer.parseInt(num)));
        }
    }

    public static boolean checkIfInt(String text){
        if (text.matches("[0-9]+")){
            return true;
        } else {
//            throw new RuntimeException("Вы ввели некорректное значение. Введите целое число");
            System.out.println("Вы ввели некорректное значение. Введите целое число");;
            return false;
        }
    }

    public static int getIndex(int [] numbers, int num){
        int index = searchIndex(numbers, num);
        if(index == -1){
            throw new RuntimeException("длина массива меньше заданного минимума = 6");
        } else if (index == -2) {
            throw new RuntimeException("искомый элемент не найден");
        } else if (index == -3) {
            throw new RuntimeException("массив = null");
        } else {
            return index;
        }
//        switch (index){
//            case -1: throw new RuntimeException("длина массива меньше заданного минимума = 6");
//            case -2: throw new RuntimeException("искомый элемент не найден");
//            case -3: throw new RuntimeException("массив = null");
//            default: return index;
//        }
    }
    public static int searchIndex(int [] numbers, int num){
        int min = 6;
        if(numbers == null){
            return -3;
        } else if (numbers.length < min) {
            return -1;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == num){
                    return i;
                }
            }
        }
        return -2;
    }
}
