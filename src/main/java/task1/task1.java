package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class task1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(LocalDateTime.now());

            System.out.println("Введите свое имя"); // sout
            String name = reader.readLine();

            System.out.println("Привет " + name + "!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

