package lv2;

import java.util.Scanner;

class PalindromeChecker {
    
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }


        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleanInput.length() - 1;

        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Bai2 {

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker(); 
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH KIỂM TRA CHUỖI ĐỐI XỨNG ---");
        System.out.print("Mời bạn nhập vào một chuỗi: ");
        
        String userInput = scanner.nextLine();

        if (userInput.trim().isEmpty()) {
            System.out.println("nhập dữ liệu ko hợp");
            scanner.close();
            return;
        }
        boolean result = checker.isPalindrome(userInput);
        System.out.println("Kết quả: " + result);

        scanner.close();
    }
}