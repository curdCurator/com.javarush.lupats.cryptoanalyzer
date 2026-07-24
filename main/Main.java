package main;

import main.io.IOReader;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/storage/emulated/0/Download/voynaimir.txt"))

        {
            IOReader iReader = new IOReader();

            System.out.println(iReader.readPortion(fis));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
