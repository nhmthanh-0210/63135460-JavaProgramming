package lab2;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhap vao a");
		double a = nhap.nextDouble();
		
		System.out.println("Nhap vao b:");
		double b = nhap.nextDouble();
		
		System.out.println("Nhap vao c:");
		double c = nhap.nextDouble();
		
		if(a == 0) {
			System.out.printf("kết quả của phương trình là: %.1f", -b/c);
		}
		else {
			double delta = Math.pow(b, 2) - 4*a*c;
			
			if(delta<0) {
				System.out.println("Phương trình vô nghiệm");
			}
			
			if(delta ==0 ) {
				System.out.printf("PT có nghiệm kép kết quả là: %.1f", -b/(2*a));
			}
			
			if(delta > 0) {
				System.out.println("PT có 2 nghiệm phân biệt:");
				System.out.printf ("x1 = %.1f", (-b+ Math.sqrt(delta))/(2*a));
				System.out.printf ("x2 = %.1f", (-b- Math.sqrt(delta))/(2*a));
			}
			
			
			}
		}
	}


