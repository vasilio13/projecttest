package com.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //FileInputStream fileInputStream = new FileInputStream("D://v/test.txt");
        File file = new File("D://v/test.txt");
        //String[] list = file.list();
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
                int read = 0;
                do {
                    read = bufferedInputStream.read();
                    System.out.print((char) read);

                } while (read != -1);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
