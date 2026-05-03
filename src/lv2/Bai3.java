package lv2;

import java.util.Scanner;

class StringDeleter {
    
    public String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            
            if (result.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }
        
        return result.toString();
    }
}

public class Bai3 {

    public static void main(String[] args) {
        StringDeleter deleter = new StringDeleter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH XÓA KÝ TỰ LẶP LẠI ---");
        System.out.print("Input: ");

        if (!scanner.hasNextLine()) {
            System.out.println("nhập dữ liệu ko hợp");
            scanner.close();
            return;
        }

        String userInput = scanner.nextLine();

        if (userInput.isEmpty()) {
            System.out.println("nhập dữ liệu ko hợp");
            scanner.close();
            return;
        }

        String output = deleter.removeDuplicates(userInput);
        System.out.println("Output: \"" + output + "\"");

        scanner.close();
    }
}