package main.io;

import java.util.ArrayList;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IOReader {


    public ArrayList<Character> readPortion(FileInputStream in) {
        ArrayList<Character> list = new ArrayList<>();
        String line = null;

        try (BufferedReader buff =
                 new BufferedReader(
                     new InputStreamReader(
                         in)))
        {
           while (buff.ready()) {
               line = buff.readLine();

               for (int i = 0; i < line.length(); i++) {
                   list.add(line.charAt(i));
               }
           }

           return list;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
