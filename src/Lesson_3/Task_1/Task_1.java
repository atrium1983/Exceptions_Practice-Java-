/*
Задание №1
Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
(тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение, которое
вызвал метод doSomething().
 */
package Lesson_3.Task_1;

public class Task_1 {
    public static void main(String[] args) {
        try {
            doSomething(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Try again!");
        }
    }
    public static void doSomething(String text) throws Exception {
        if(text == null){
            throw new Exception("Text is null");
        }
        System.out.println(text);
    }
}
