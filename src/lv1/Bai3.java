package lv1;

import java.util.Scanner;

class MathProcessor {
    
    public int sumEvenNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}

public class Bai3 {

    public static void main(String[] args) {
        MathProcessor processor = new MathProcessor(); 
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH TÍNH TỔNG SỐ CHẴN ---");
        System.out.print("Mời bạn nhập số nguyên dương n: ");
        
        String inputLine = scanner.nextLine().trim();
        int n;

        try {
            n = Integer.parseInt(inputLine);
            if (n <= 0) {
                System.out.println("nhập dữ liệu ko hợp (phải là số nguyên dương)");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("nhập dữ liệu ko hợp");
            scanner.close();
            return;
        }

        int result = processor.sumEvenNumbers(n);
        System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + result);

        scanner.close();
    }
}