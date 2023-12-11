/*
Задание №2
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить
исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт.
Подумайте какой тип исключения подойдет лучше всего.
 */
package Lesson_3.Task_2;

import java.io.IOException;


public class Task_2 {
    public static void main(String[] args) {
        try (Counter counter = new Counter(5)) {
            try {
                System.out.println(counter.getCount());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Counter implements AutoCloseable{
    private Integer count;

    public Counter(Integer count) {
        this.count = count;
    }

    public void add() throws IOException {
        getCount();
        this.count++;
    }
    public Integer getCount() throws IOException {
        checkClose();
        return count;
    }
    public void checkClose() throws IOException {
        if(this.count == null){
            throw new IOException("Экземпяр класса закрыт");
        }
    }

    @Override
    public void close() {
        this.count = null;
    }
}

