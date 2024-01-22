package exJava;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhap vao chieu dai");
		double chieuDai = nhap.nextDouble();
		
		System.out.println("Nhap vao chieu rong");
		double chieuRong = nhap.nextDouble();
		
		double min = Math.min(chieuDai, chieuRong);
		
		System.out.printf("Chu vi hinh chu nhat la: %f", (chieuDai + chieuRong) * 2);
		System.out.println();
		System.out.printf("Dien tich hinh chu nhat la: %f", chieuDai * chieuRong);
		System.out.println();
		System.out.printf("Cạnh nhỏ của hình chữ nhật là: %f", min);
	}

}
