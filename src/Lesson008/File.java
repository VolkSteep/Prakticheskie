package Lesson008;

import java.io.FileWriter;
import java.io.FileReader;

class File{
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("C://proga/text.txt");
        fw.append("\n");
        fw.append ("До свидания, люди!");
        fw.close();



    }
}