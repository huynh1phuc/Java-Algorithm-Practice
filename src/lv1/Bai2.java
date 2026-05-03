package lv1;

import java.util.Scanner;
import java.util.Arrays;

class ArrayProcessor {
    public int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return max2;
    }
}

public class Bai2 {

    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH TÌM SỐ LỚN THỨ 2 TRONG MẢNG ---");
        System.out.print("Mời bạn nhập số lượng phần tử của mảng: ");
        
        String inputLine = scanner.nextLine().trim();
        int n;

        try {
            n = Integer.parseInt(inputLine);
            if (n < 0) {
                System.out.println("nhập dữ liệu ko hợp");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("nhập dữ liệu ko hợp");
            scanner.close();
            return;
        }

        if (n < 2) {
            System.out.println("Output: " + Integer.MIN_VALUE + " (Do mảng có ít hơn 2 phần tử)");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Mời bạn nhập các giá trị (có thể nhập số âm):");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            String elementInput = scanner.nextLine().trim();
            
            try {
                arr[i] = Integer.parseInt(elementInput);
            } catch (NumberFormatException e) {
                System.out.println("nhập dữ liệu ko hợp");
                scanner.close();
                return;
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("Mảng bạn vừa nhập: " + Arrays.toString(arr));

        int result = processor.findSecondLargest(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("Output: " + result + " (Không tìm thấy số lớn thứ hai hợp lệ)");
        } else {
            System.out.println("Output: " + result);
        }

        scanner.close();
    }
}