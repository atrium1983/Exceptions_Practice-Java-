/*
Задание №0
Перепишите код, используя ресурсный try
 */
package Lesson_3.Task_0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task_0 {
    public static void main(String[] args) {

    }

    public void rwLine (Path pathRead, Path pathWrite) throws IOException {
        // код до
//        BufferedReader in = null;
//        BufferedWriter out = null;
//        try {
//            in = Files.newBufferedReader(pathRead);
//            out = Files.newBufferedWriter(pathWrite);
//        } finally {
//            try {
//                if (in != null){
//                    in.close();
//                }
//            } catch (IOException e){
//
//            }
//            try {
//                if(out != null){
//                    out.close();
//                }
//            } catch (IOException e){
//
//            }
//        }
        // код после
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(1);
        }
    }
}
