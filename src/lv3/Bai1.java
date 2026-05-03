package lv3;

import java.util.Arrays;
import java.util.Scanner;

class AlgorithmProcessor {
    
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}

public class Bai1 {

    public static void main(String[] args) {
        AlgorithmProcessor processor = new AlgorithmProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- TWO SUM II - INPUT ARRAY IS SORTED ---");
        
        try {
            System.out.print("Nhập số lượng phần tử mảng: ");
            int n = Integer.parseInt(scanner.nextLine());
            
            int[] numbers = new int[n];
            System.out.println("Nhập mảng (đã sắp xếp tăng dần):");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                numbers[i] = Integer.parseInt(scanner.nextLine());
                if (i > 0 && numbers[i] < numbers[i - 1]) {
                    System.out.println("hãy nhập dãy tăng dần"); 
                    return;
                }
            }
            

            System.out.print("Nhập số target: ");
            int target = Integer.parseInt(scanner.nextLine());

            int[] result = processor.twoSum(numbers, target);
            
            if (result.length == 2) {
                System.out.println("Output: " + Arrays.toString(result));
            } else {
                System.out.println("Không tìm thấy cặp số thỏa mãn.");
            }

        } catch (Exception e) {
            System.out.println("nhập dữ liệu ko hợp");
        } finally {
            scanner.close();
        }
    }
}