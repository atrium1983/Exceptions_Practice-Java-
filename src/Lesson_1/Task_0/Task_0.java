//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//        Если длина массива меньше некоторого заданного минимума,
//        метод возвращает -1, в качестве кода ошибки, иначе - длину
//        массива.

package Lesson_1.Task_0;

public class Task_0 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        System.out.printf("Индекс = %d", getLength(array));
    }
    public static int getLength (int [] array){
        int min = 3;
        return array.length >= min ? array.length : -1;
    }
}
