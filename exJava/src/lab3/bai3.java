package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nhap = new Scanner(System.in);
        
	       
        System.out.print("Nhập độ dài của mảng: ");
        int length = nhap.nextInt();
        
       
        int[] arr = new int[length];
        
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < length; i++) {
            arr[i] = nhap.nextInt();
        }
        
        // Sắp xếp mảng
        Arrays.sort(arr);
        
        // Xuất mảng sau khi đã sắp xếp
        System.out.println("Mảng sau khi đã sắp xếp:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Tìm và xuất phần tử nhỏ nhất
        int min = arr[0];
        for (int i = 1; i < length; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
        
        // Tính và xuất trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + average);
        } else {
            System.out.println("Không có phần tử nào trong mảng chia hết cho 3.");
        }
		
	}

}
