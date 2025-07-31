package HW14;

import java.io.*;

public class RomeoAndJuliet {
    public static void main(String[] args) {
        File input = new File("E:\\romeo-and-juliet.txt");
        File output = new File("E:\\longest_word.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output))
        ) {
            String longestWord = "";
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[^A-Za-z]+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            writer.write(longestWord);
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }
    }
}
