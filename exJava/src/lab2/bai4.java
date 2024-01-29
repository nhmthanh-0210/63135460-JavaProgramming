package lab2;

import java.awt.DefaultFocusTraversalPolicy;
import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
       Scanner nhap = new Scanner(System.in);
       int luaChon;
       do {	
       System.out.println("----------------------------------------");
       System.out.println("1. Giải phương trình bậc nhất");
       System.out.println("2. Giải phương trình bậc hai");
       System.out.println("3. Tính tiền điện");
       System.out.println("4. Kết thúc");
       System.out.println("----------------------------------------");
		System.out.println("Chọn chức năng: ");
		 luaChon = nhap.nextInt();
		
		switch (luaChon) {
		case 1: 
			
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
			break;
		
		
		case 2:
			System.out.println("Nhap vao a");
			double a2 = nhap.nextDouble();
			
			System.out.println("Nhap vao b:");
			double b2 = nhap.nextDouble();
			
			System.out.println("Nhap vao c:");
			double c2 = nhap.nextDouble();
			
			if(a2 == 0) {
				System.out.printf("kết quả của phương trình là: %.1f", -b2/c2);
			}
			else {
				double delta = Math.pow(b2, 2) - 4*a2*c2;
				
				if(delta<0) {
					System.out.println("Phương trình vô nghiệm");
				}
				
				if(delta ==0 ) {
					System.out.printf("PT có nghiệm kép kết quả là: %.1f", -b2/(2*a2));
				}
				
				if(delta > 0) {
					System.out.println("PT có 2 nghiệm phân biệt:");
					System.out.printf ("x1 = %.1f", (-b2+ Math.sqrt(delta))/(2*a2));
					System.out.printf ("x2 = %.1f", (-b2- Math.sqrt(delta))/(2*a2));
				}
				
				
				}
			break;
		
		
		case 3:
			System.out.println("Nhap vao so dien su dung");
			int soDien = nhap.nextInt();
			int tien = 0;
			
			if(soDien >=0 && soDien <50) {
				 tien = soDien*1000;
				System.out.printf("so tien dien phai tra la: %d", tien );
				
			}else {
				tien = 50*1000 + (soDien - 50)*1200;
				System.out.printf("so tien dien phai tra la: %d", tien );
			}
			break;

		
		
		 case 4:
             System.out.println("Ket thuc");
              break;
          default:
             System.out.println("Lua chon khong hop le:");
	
			
		}
		
       } while (luaChon != 4);
		
	}

}
