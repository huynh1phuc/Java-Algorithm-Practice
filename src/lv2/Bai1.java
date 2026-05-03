package lv2;

import java.util.Scanner;

class TaxCalculator {
    
    public double calculateIncomeTax(double income) {
        if (income < 0) return -1; 

        if (income <= 5) {
            return income * 0.05;
        } else if (income <= 10) {
            return income * 0.10;
        } else if (income <= 18) {
            return income * 0.15;
        } else if (income <= 32) {
            return income * 0.20;
        } else if (income <= 52) {
            return income * 0.25;
        } else if (income <= 80) {
            return income * 0.30;
        } else {
            return income * 0.35;
        }
    }
}

public class Bai1 {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH TÍNH THUẾ THU NHẬP CÁ NHÂN ---");
        System.out.print("Mời bạn nhập thu nhập hàng năm (triệu đồng): ");
        
        String inputStr = scanner.nextLine().trim();
        double income;

        try {
            income = Double.parseDouble(inputStr);
        } catch (NumberFormatException e) {
            System.out.println("nhập dữ liệu ko hợp");
            scanner.close();
            return;
        }

        double tax = calculator.calculateIncomeTax(income);

        if (tax < 0) {
            System.out.println("nhập dữ liệu ko hợp");
        } else {
        	String formattedTax = String.format("%.2f", tax);
            System.out.println("Với thu nhập " + income + " triệu, số thuế phải trả là: " + formattedTax + " triệu");
        }

        scanner.close();
    }
}