package task8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getCurrentFolderContent() {
        File dir = new File(".");
        return dir.list();
    }
    public static void writeToFile(String[] content) {
        try {
            FileWriter fw = new FileWriter("currentFolder.txt");
            for (String s : content) {
                fw.write(s + "\n");
            }
            fw.close();
        } catch (IOException e) {
            try {
                FileWriter log = new FileWriter("log.txt");
                log.write("Error occurred while writing to file: " + e.getMessage());
                log.close();
            } catch (IOException e2) {
                System.out.println("Error occurred while writing to log file: " + e2.getMessage());
            }
        }
    }
}
