package lab6;

import java.util.Scanner;

public class bai1 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập họ và tên: ");
	        String hoTen = scanner.nextLine();

	        int viTriKyTuTrangDau = hoTen.indexOf(" ");
	        int viTriKyTuTrangCuoi = hoTen.lastIndexOf(" ");

	        if (viTriKyTuTrangDau != -1 && viTriKyTuTrangCuoi != -1 && viTriKyTuTrangDau != viTriKyTuTrangCuoi) {
	            String ho = hoTen.substring(0, viTriKyTuTrangDau).toUpperCase();
	            String ten = hoTen.substring(viTriKyTuTrangCuoi + 1).toUpperCase();
	            String tenDem = hoTen.substring(viTriKyTuTrangDau + 1, viTriKyTuTrangCuoi);

	            System.out.println("Họ: " + ho);
	            System.out.println("Tên đệm: " + tenDem);
	            System.out.println("Tên: " + ten);
	        } else {
	            System.out.println("Họ và tên không hợp lệ.");
	        }

	  
	    }
}
