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
		
		
		System.out.printf("Chu vi hinh chu nhat la: %f", (chieuDai + chieuRong) * 2);
		
	}

}
