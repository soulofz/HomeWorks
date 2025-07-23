package HW12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();
        String documentNumber = "\\d{4}-\\d{4}-\\d{2}";
        String telephone = "\\+\\(\\d{2}\\)\\d{7}";
        String email = "[A-z]+\\d?[a-z]+?@[a-z]+.[a-z]+";
        Pattern docPattern = Pattern.compile(documentNumber);
        Pattern phonePattern = Pattern.compile(telephone);
        Pattern emailPattern = Pattern.compile(email);
        Matcher matcherDoc = docPattern.matcher(input);
        Matcher matcherPhone = phonePattern.matcher(input);
        Matcher matcherEmail = emailPattern.matcher(input);
        boolean result = false;
        while (matcherEmail.find()){
            System.out.println("Найден email адрес:");
            System.out.println(matcherEmail.group());
            result = true;
        }
        while (matcherDoc.find()){
            System.out.println("Найден номер документа:");
            System.out.println(matcherDoc.group());
            result = true;
        }
        while (matcherPhone.find()){
            System.out.println("Найден номер телефона:");
            System.out.println(matcherPhone.group());
            result=true;
        }
        if (!result){
            System.out.println("Ничего не найдено.");
        }
    }
}
