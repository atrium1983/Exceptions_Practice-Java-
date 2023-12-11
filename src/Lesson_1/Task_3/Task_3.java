//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
//        целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и проверить что он не равен null.
//        А теперь реализуйте следующую логику:
//        1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
//        пользователя
//        2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
//        “подсветить”

package Lesson_1.Task_3;

public class Task_3 {
    public static void main(String[] args) {
        Integer [] array1 = {0,1,2,3,4,5};
        Integer [] array2 = {0,null,2,3,4,5};
        Integer [] array3 = {0,null,2,null,null,5};

        System.out.println(checkIfNull(array1));
        System.out.println(checkIfNull(array2));
        System.out.println(checkIfNull(array3));
    }

    public static boolean checkIfNull(Integer [] array){
        Boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                System.out.println("Элемент с индеком "+i+" = null");
                flag = false;
            }
        }
        return flag;
    }
}
