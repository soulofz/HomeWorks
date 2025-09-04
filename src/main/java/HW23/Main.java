package HW23;

import HW23.Model.Sonnet;
import HW23.Parsers.DOM.MainDom;
import HW23.Parsers.SAX.MainSax;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите формат парсинга 1 (SAX) или 2 (DOM) :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        try {
            Sonnet sonnet = null;
            if (input == 1) {
                sonnet = MainSax.parse();
            } else if (input == 2) {
                sonnet = MainDom.parse();
            } else {
                System.out.println("Неверное число.");
            }
            String fileName = sonnet.getAuthor().getFirstName() + "_"
                    + sonnet.getAuthor().getLastName() + "_"
                    + sonnet.getTitle() + ".txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                List<String> lines = sonnet.getLines();
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Файл создан.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
