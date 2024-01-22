package exJava;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner nhap = new Scanner(System.in);
			
			System.out.println("Nhap vao canh cua khoi lap phuong");
			double canh = nhap.nextDouble();
			
			double theTich = Math.pow(canh, 3);
			
			System.out.printf("The tich khoi lap phuong la: %f", theTich);
	}

}
