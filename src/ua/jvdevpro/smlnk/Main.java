package ua.jvdevpro.smlnk;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        // создается пустой файл.txt;
        File fl = new File("A.txt");
        try {
            fl.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // создается пустой каталог;
        File folder = new File("A");
        folder.mkdir();

        // переименовываем файл;
        // fl.renameTo(new File("B.txt"));

        // удаляем файл;
        File fl2 = new File("B.txt");
        fl2.delete();

        // получаем содержание каталога и выводим на экран;

        File fileView = new File(".");
        if (fileView.isDirectory()) {
            String[] filenames = fileView.list();
            for (String file : filenames

            ) {
                pw.println(file);
            }
        }
    }
}
