package lv3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class WindowProcessor {
    
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int left = 0, right = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (targetMap.containsKey(c)) {
                windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
                if (windowMap.get(c).equals(targetMap.get(c))) {
                    count++;
                }
            }

            while (count == targetMap.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                if (targetMap.containsKey(leftChar)) {
                    if (windowMap.get(leftChar).equals(targetMap.get(leftChar))) {
                        count--;
                    }
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}

public class Bai3 {

    public static void main(String[] args) {
        WindowProcessor processor = new WindowProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- MINIMUM WINDOW SUBSTRING ---");
        
        System.out.print("Input s: ");
        String s = scanner.nextLine();
        
        System.out.print("Input t: ");
        String t = scanner.nextLine();

        if (s.isEmpty() || t.isEmpty()) {
            System.out.println("nhập dữ liệu ko hợp");
        } else {
            String result = processor.minWindow(s, t);
            System.out.println("Output: \"" + (result.isEmpty() ? "" : result) + "\"");
        }

        scanner.close();
    }
}