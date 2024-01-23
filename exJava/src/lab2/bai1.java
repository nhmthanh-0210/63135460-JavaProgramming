package lab2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhap vao a:");
		double a = nhap.nextDouble();
		
		System.out.println("Nhap vao b:");
		double b = nhap.nextDouble();
		
		double x = 0;
		
		
		
		if(a == 0){
			if(b == 0){
			  System.out.println("Vô số nghiệm");
			}
			else{
				System.out.println("Vô nghiệm");
			}
			
		}else{
				System.out.printf("kết quả của phương trình là: %.1f", x = -b/a);
			}
			
			
			
		}

}
