/*
Задание №3
1. Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать понятное
для пользователя сообщение об ошибке.
2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
Исключение должно отображать понятное для пользователя сообщение об ошибке
3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно
отображать понятное для пользователя сообщение об ошибке.
 */
package Lesson_3.Task_3;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int index = 3;
        int [] array = {1,2,3,4};
        String path = "text.txt";
        try {
            doDiv(a,b);
        } catch (DivOnZeroException e){
            System.out.println(e);
        }

        try {
            getElem(index, array);
        } catch (NullPointerArray e){
            System.out.println(e);
        }

        try {
            getFile(path);
        } catch (FileNotFound e) {
            System.out.println(e);;
        }
    }
    public static void doDiv(int a, int b) throws DivOnZeroException{
        if( b != 0){
            System.out.println(a/b);
        } else {
            throw new DivOnZeroException();
        }
    }

    public static void getElem(int index, int[] array) throws NullPointerArray {
        if (array.length-1 < index) {
            throw new NullPointerArray(index);
        } else {
            System.out.println(array[index]);
        }
    }

    public static void getFile(String path) throws FileNotFound {
        if(path == null){
            throw new FileNotFound(path);
        } else {
            try(FileReader reader = new FileReader(path)) {
                System.out.println(reader.read());
            } catch (FileNotFoundException e) {
                throw new FileNotFound(path);
            } catch (IOException e) {
                throw new FileNotFound(path);
            }
        }
    }
}

class DivOnZeroException extends ArithmeticException{
    public DivOnZeroException(){
        super("Division by zero is not possible");
    }
}
class NullPointerArray extends NullPointerException{
    public NullPointerArray(int index){
        super("Element of massive is not exist. Your index is => " +index);
    }
}
class FileNotFound extends FileNotFoundException{
    public FileNotFound(String path){
        super("File is not exist. Your path is => " + path);
    }
}
