package BufferedReader;
//exercicio 1

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String file = "arquivo.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(file))) 
        {
            String line;
            while ((line = br.readLine()) != null) {
            System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}