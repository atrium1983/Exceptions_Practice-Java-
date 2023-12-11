/*
Задание №4
1. Напишите метод,на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить
исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива,преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование
не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в
какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести
результат расчета (сумму элементов,при условии что подали на вход корректный массив).
 */

package Lesson_3.Task_4;

public class Task_4 {
    public static void main(String[] args) {
        String [][] array1 = {{"1","2","3","4"}, {"5","6","7","8"}, {"9","10","11","12"}, {"13","14","15","16"}};
        String [][] array2 = {{"1","2","3","4"}, {"5","6","7","8"}, {"9","10"}, {"13","14","15","16"}};
        String [][] array3 = {{"1","2","3","4"}, {"5","6","7","8"}, {"9","10","11","12"}};
        String [][] array4 = {{"1","2","3","4"}, {"5","6","7","8"}, {"9","10","11","a"}, {"13","14","15","16"}};
        try {
            System.out.println("Sum of elements = " + getSum(array4));
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e);
        }
    }

    public static int getSum(String [][] array){
        int sum = 0;
        for (int i = 0; i< array.length; i++) {
            if (array.length != array[i].length) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].matches("[0-9]+")){
                    sum += Integer.parseInt(array[i][j]);
                } else {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Size of array is not correct");
    }
}
class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int index1, int index2){
        super("Element with the following index is not possible to convert to int => " + index1 + ", " + index2);
    }
}
