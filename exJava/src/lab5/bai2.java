package lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bai2 {
	static ArrayList<String> danhSach = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int luaChon;
        do {
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự newline từ lựa chọn trước đó

            switch (luaChon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    ngaunhien();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 6);
    }

    static void nhap() {
        System.out.print("Nhập số lượng họ và tên: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Đọc kí tự newline từ số lượng trước đó

        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhập họ và tên thứ " + (i + 1) + ": ");
            String hoTen = scanner.nextLine();
            danhSach.add(hoTen);
        }
    }

    static void xuat() {
        System.out.println("Danh sách họ và tên:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }

    static void ngaunhien() {
      Collections.shuffle(danhSach);
        System.out.println("Danh sách ngẫu nhiên:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }

    static void sapxep() {
        Collections.sort(danhSach);
        Collections.reverse(danhSach);
        System.out.println("Danh sách sắp xếp giảm dần:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }

    static void xoa() {
        System.out.print("Nhập họ và tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        boolean timThay = false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).equals(hoTenCanXoa)) {
                danhSach.remove(i);
                timThay = true;
                break;
            }
        }
        if (timThay) {
            System.out.println("Đã xóa '" + hoTenCanXoa + "' khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy '" + hoTenCanXoa + "' trong danh sách.");
        }
    }
}
