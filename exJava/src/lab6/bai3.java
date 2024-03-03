package lab6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SinhVien {
    String hoTen;
    String email;
    String soDienThoai;
    String chungMinhNhanDan;

    public SinhVien(String hoTen, String email, String soDienThoai, String chungMinhNhanDan) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.chungMinhNhanDan = chungMinhNhanDan;
    }

    public void xuat() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Chứng minh nhân dân: " + chungMinhNhanDan);
        System.out.println();
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập email: ");
        email = scanner.nextLine();
        while (!kiemTraEmail(email)) {
            System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            email = scanner.nextLine();
        }
        System.out.print("Nhập số điện thoại: ");
        soDienThoai = scanner.nextLine();
        while (!kiemTraSoDienThoai(soDienThoai)) {
            System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            soDienThoai = scanner.nextLine();
        }
        System.out.print("Nhập chứng minh nhân dân: ");
        chungMinhNhanDan = scanner.nextLine();
        while (!kiemTraCMND(chungMinhNhanDan)) {
            System.out.println("Chứng minh nhân dân không hợp lệ. Vui lòng nhập lại.");
            chungMinhNhanDan = scanner.nextLine();
        }
    }

    private boolean kiemTraEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean kiemTraSoDienThoai(String soDienThoai) {
        String regex = "^\\d{10,11}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        return matcher.matches();
    }

    private boolean kiemTraCMND(String chungMinhNhanDan) {
        String regex = "^\\d{9,12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(chungMinhNhanDan);
        return matcher.matches();
    }
}
public class bai3 {
	public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

     
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien("", "", "", "");
            sv.nhap();
            danhSachSinhVien.add(sv);
        }

        
        System.out.println("Thông tin các sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
        }
    }
}
