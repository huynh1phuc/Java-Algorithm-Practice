package lv1;

import java.util.Scanner;

class StringProcessor {
    
    public String removeVowels(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char lowerC = Character.toLowerCase(c);

            if (lowerC != 'a' && lowerC != 'e' && lowerC != 'i' && lowerC != 'o' && lowerC != 'u') {
                result.append(c);
            }
        }
        return result.toString();
    }
}

public class Bai1 {

    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH XÓA NGUYÊN ÂM ---");
        System.out.print("Mời bạn nhập vào một chuỗi bất kỳ: ");
        
        String userInput = scanner.nextLine();
        
        String output = processor.removeVowels(userInput);
        System.out.println("Chuỗi sau khi xử lý (Output): " + output);

        scanner.close();
    }
}