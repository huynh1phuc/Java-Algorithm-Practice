package lv1;

import java.util.Scanner;

class TextAnalyzer {
    
    public int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        
        return words.length;
    }
}

// 2. LỚP CHÍNH CHỨA HÀM MAIN
public class Bai4{

    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer(); 
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH ĐẾM SỐ TỪ ---");
        System.out.print("Mời bạn nhập vào một chuỗi: ");
        
        String userInput = scanner.nextLine(); 

        int result = analyzer.countWords(userInput);
        System.out.println("Số từ trong chuỗi là: " + result);

        scanner.close();
    }
}