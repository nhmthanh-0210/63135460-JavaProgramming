package lab2;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nhap = new Scanner(System.in);
		
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

	}

}
