package task7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) {

        writeFile(createLine());
    }

    static StringBuilder createLine() {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append("TEST ");
        }
        System.out.println(str);
        return str;
    }


    static void writeFile(StringBuilder str) {

        try (PrintWriter writer = new PrintWriter("task7.txt", StandardCharsets.UTF_8);){

                writer.write(String.valueOf(str));

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
