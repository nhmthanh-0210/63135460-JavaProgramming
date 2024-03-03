package lab6;

import java.util.ArrayList;
import java.util.Scanner;

class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Hãng: " + hang);
        System.out.println();
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Nhập hãng: ");
        hang = scanner.nextLine();
    }
}
public class bai2 {
	public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham("", 0, "");
            sp.nhap();
            danhSachSanPham.add(sp);
        }

        
        System.out.println("Các sản phẩm của hãng Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }
}
