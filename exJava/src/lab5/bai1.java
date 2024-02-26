package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Nhập các số thực (nhập 'N' để kết thúc):");
        while (true) {
            Double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); 
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }

   
        System.out.println("Danh sách số thực đã nhập:");
        for (Double num : list) {
            System.out.println(num);
        }

       
        double sum = 0;
        for (Double num : list) {
            sum += num;
        }
        System.out.println("Tổng của các số: " + sum);
    
	}

}
