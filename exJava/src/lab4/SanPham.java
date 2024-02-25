package lab4;

import java.util.Scanner;

public class SanPham {
		public String tenSp;
		public double donGia;
		public double giamGia;
		
		public void getThueNhapKhau() {
				 double thueNhapKhau = (double) donGia/10;
				System.out.println("Thue nhap khau la: " + thueNhapKhau);
				
		}
		
		public void nhap() {
			Scanner thanh = new Scanner(System.in);
			
			System.out.println("Nhap vao ten sp");
			tenSp = thanh.next();
			
			System.out.println("Nhap vao don gia:");
			donGia = thanh.nextDouble();
			
			System.out.println("Nhap vao ma giam gia:");
			giamGia = thanh.nextDouble();
			
		}
		
		public void xuat(){
			System.out.println(tenSp);
			System.out.println(donGia);
			System.out.println(giamGia);
			
			}
}
