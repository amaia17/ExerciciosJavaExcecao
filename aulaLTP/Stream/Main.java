package Stream;

//exercicio 2

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        String file = "arquivo.txt";
        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            stream.forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}