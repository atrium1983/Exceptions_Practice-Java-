package Lesson_2.Task_2;
import java.io.*;

public class Task_2 {
    public static void main(String[] args) {
        /*
        1. Нет файла
        2. Файл пуст
        */
        String path = "C:\\Users\\den_m\\IdeaProjects\\expensions\\src\\1.txt";
        try{
            File file = new File(path);
            int count = 0;
            if (file.length() == 0)
                System.out.println("Файл пустой!");
            FileReader data = new FileReader(file);
            BufferedReader read = new BufferedReader(data);
            String line = read.readLine();
            while (line != null){
                count++;
                line = read.readLine();
            }
            data = new FileReader(file);
            read = new BufferedReader(data);
            String[] row_file = new String[count];
            for (int i = 0; i < count; i++) {
                line = read.readLine();
                row_file[i] = line;
            }
            for (int i = 0; i < row_file.length; i++){
                if (row_file[i] != null) {
                    if (row_file[i].contains("?")) {
                        int countCharName = row_file[i].length() - 2;
                        row_file[i] = row_file[i].replace("?", Integer.toString(countCharName));
                    }
                }
            }
            for (int i = 0; i < row_file.length; i++){
                System.out.println(row_file[i]);
            }
            FileWriter fw = new FileWriter(path);
            for (int i = 0; i < row_file.length; i++){
                fw.write(row_file[i] + "\n");
            }
            fw.flush();

        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        catch (IOException e){
            System.out.println("Ошибка");
        }
    }
}
