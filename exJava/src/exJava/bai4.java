package exJava;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nhap = new Scanner(System.in);
		
		System.out.println("nhap vao trong so can bac 2");
		int a = nhap.nextInt();
		int b = nhap.nextInt();
		int c = nhap.nextInt();
		
		double delta = Math.pow(b, 2)- 4*a*c;
		double canDelta = Math.sqrt(delta);
		
		System.out.printf("Delta có kết quả là: %.1f", delta);
		System.out.println();
		System.out.printf("Căn Delta có kết quả là: %.1f", (double)canDelta);
		
	}

}
