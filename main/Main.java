package main;

import main.io.IOReader;
import main.crypto.EnDeCrypt;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        EnDeCrypt crypto = new EnDeCrypt();

        crypto.action();
    }

}
