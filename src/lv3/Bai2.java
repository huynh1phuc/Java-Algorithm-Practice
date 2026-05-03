package lv3;

import java.util.Scanner;

class PalindromeFinder {
    
    public String findLongestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

public class Bai2 {

    public static void main(String[] args) {
        PalindromeFinder finder = new PalindromeFinder(); 
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- LONGEST PALINDROMIC SUBSTRING ---");
        System.out.print("Input: ");
        
        String userInput = scanner.nextLine();

        if (userInput.isEmpty()) {
            System.out.println("nhập dữ liệu ko hợp");
        } else {
            String result = finder.findLongestPalindrome(userInput);
            System.out.println("Output: \"" + result + "\"");
        }

        scanner.close();
    }
}