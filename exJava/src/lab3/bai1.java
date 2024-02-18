package lab3;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen tu ban phim");
		int n = nhap.nextInt();
		
		boolean ok = true;
		for(int i=2; i < n-1; i++){ 
		if(n % i == 0){
		ok = false;
		break;
		}
		 i++;
		}
		
		
		 if (ok && n > 1) {
	            System.out.println(n + " là số nguyên tố.");
	        } else {
	            System.out.println(n + " không phải là số nguyên tố.");
	        }
		
		
		
	}

}
