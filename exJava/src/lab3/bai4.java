package lab3;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner nhap = new Scanner(System.in);
	        
	       
	        System.out.print("Nhập số lượng sinh viên: ");
	        int n = nhap.nextInt();
	        
	       
	        String[] names = new String[n];
	        double[] scores = new double[n];
	        
	        
	        for (int i = 0; i < n; i++) {
	        	nhap.nextLine(); 
	            System.out.print("Nhập họ tên của sinh viên thứ " + (i + 1) + ": ");
	            names[i] = nhap.nextLine();
	            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
	            scores[i] = nhap.nextDouble();
	        }
	        
	       
	        System.out.println("Thông tin sinh viên và học lực:");
	        for (int i = 0; i < n; i++) {
	            String grade;
	            if (scores[i] < 5) {
	                grade = "Yếu";
	            } else if (scores[i] < 6.5) {
	                grade = "Trung bình";
	            } else if (scores[i] < 7.5) {
	                grade = "Khá";
	            } else if (scores[i] < 9) {
	                grade = "Giỏi";
	            } else {
	                grade = "Xuất sắc";
	            }
	            System.out.println("Họ tên: " + names[i]);
	            System.out.println("Điểm: " + scores[i]);
	            System.out.println("Học lực: " + grade);
	            System.out.println();
	        }
	        
	     
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (scores[j] > scores[j + 1]) {
	                   
	                    String tempName = names[j];
	                    names[j] = names[j + 1];
	                    names[j + 1] = tempName;
	                   
	                    double tempScore = scores[j];
	                    scores[j] = scores[j + 1];
	                    scores[j + 1] = tempScore;
	                }
	            }
	        }
	        
	        
	        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
	        for (int i = 0; i < n; i++) {
	            System.out.println(names[i] + " - Điểm: " + scores[i]);
	        }
	        
	}

}
