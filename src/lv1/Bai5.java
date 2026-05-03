package lv1;

import java.util.Scanner;

class TextFormatter {
    
    public String getFirstLetters(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String[] words = input.trim().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            result.append(words[i].charAt(0));
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString().toUpperCase(); 
    }
}

public class Bai5 {

    public static void main(String[] args) {
        TextFormatter formatter = new TextFormatter(); 
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH IN CHỮ CÁI ĐẦU ---");
        System.out.print("Mời bạn nhập vào một chuỗi: ");
        
        String userInput = scanner.nextLine();

        String result = formatter.getFirstLetters(userInput);
        System.out.println("Kết quả (Output): \"" + result + "\"");

        scanner.close();
    }
}