package HW14;

import java.io.*;
import java.util.Scanner;

public class DocumentValidator {
    public static void main(String[] args) {
        System.out.println("Введите расположение файла:");
        Scanner scanner = new Scanner(System.in);
        String fileWay = scanner.nextLine();
        File input = new File(fileWay);
        File validOutput = new File("E:\\Valid_Docs.txt");
        File invalidOutput = new File("E:\\Invalid_Docs.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validOutput));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidOutput))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String docNumber = line.trim();
                String error = null;
                if (docNumber.length() != 15) {
                    error = "Длина номера документа должна быть 15 символов.";
                } else if (!(docNumber.startsWith("docnum") || docNumber.startsWith("contract"))) {
                    error = "Номер документа должен начинаться с 'docnum' либо 'contract'";
                } else if (!docNumber.matches("[A-Za-z0-9]+")) {
                    error = "Номер документа должен содержать только буквы и цифры.";
                }
                if (error == null) {
                    validWriter.write(docNumber);
                    validWriter.newLine();
                } else {
                    invalidWriter.write(docNumber + " " + error);
                    invalidWriter.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }
    }
}
