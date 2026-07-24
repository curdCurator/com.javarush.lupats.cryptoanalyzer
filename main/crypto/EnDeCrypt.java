package main.crypto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import main.io.IOReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class EnDeCrypt {

    private ArrayList<Character> list;
    private int bias;
    Scanner scanner = new Scanner(System.in);
    IOReader reader;

    public EnDeCrypt() {
    }

    public EnDeCrypt(ArrayList<Character> list, int bias) {
        this.list = list;
        this.bias = bias;
    }

    public void setList(ArrayList<Character> list) {
        this.list = list;
    }

    public void setBias(int bias) {
        this.bias = bias;
    }

    public ArrayList<Character> getList() {
        return this.list;
    }

    public int getBias() {
        return this.bias;
    }

    public void action() {
        try {

            FileInputStream fis = null;
            FileWriter fw = null;

            System.out.print("Введите файл-источник: ");
            String source = scanner.nextLine();
//          Path sourcePath = Path.of(source);
            fis = new FileInputStream(source);

            System.out.print("\nВведите смещение шифра: ");
            int bias = scanner.nextInt();

            reader = new IOReader();
            list = reader.readPortion(fis);
            Collections.rotate(list, bias);

            System.out.print("\nКуда писать зашифрованное? ");
            String output = scanner.nextLine();
//          Path outputPath = Path.of(output);

            fw = new FileWriter(output);

            fw.write(output);

            Collections.rotate(list, -bias);

            fis.close();
            fw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }

}
