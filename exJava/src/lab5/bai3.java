package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai3 {

	class SanPham {
	    String ten;
	    double gia;

	    public SanPham(String ten, double gia) {
	        this.ten = ten;
	        this.gia = gia;
	    }

	    public String getTen() {
	        return ten;
	    }

	    public double getGia() {
	        return gia;
	    }
	}

	public class Main {
	    static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        menu();
	    }

	    static void menu() {
	        int luaChon;
	        do {
	            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
	            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
	            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
	            System.out.println("4. Xuất giá trung bình của các sản phẩm");
	            System.out.println("5. Kết thúc");
	            System.out.print("Nhập lựa chọn của bạn: ");
	            luaChon = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (luaChon) {
	                case 1:
	                    nhap();
	                    break;
	                case 2:
	                    sapXepGiamDanTheoGia();
	                    break;
	                case 3:
	                    xoaSanPhamTheoTen();
	                    break;
	                case 4:
	                    xuatGiaTrungBinh();
	                    break;
	                case 5:
	                    System.out.println("Kết thúc chương trình.");
	                    break;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
	            }
	        } while (luaChon != 5);
	    }

	    static void nhap() {
	        System.out.print("Nhập số lượng sản phẩm: ");
	        int soLuong = scanner.nextInt();
	        scanner.nextLine(); 

	        for (int i = 0; i < soLuong; i++) {
	            System.out.print("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
	            String ten = scanner.nextLine();
	            System.out.print("Nhập giá sản phẩm: ");
	            double gia = scanner.nextDouble();
	            scanner.nextLine();

	            SanPham sanPham = new SanPham(ten, gia);
	            danhSachSanPham.add(sanPham);
	        }
	    }

	    static void sapXepGiamDanTheoGia() {
	        Comparator<SanPham> comp = new Comparator<SanPham>() {
	            @Override
	            public int compare(SanPham o1, SanPham o2) {
	                return Double.compare(o2.getGia(), o1.getGia());
	            }
	        };
	        Collections.sort(danhSachSanPham, comp);
	        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
	        for (SanPham sanPham : danhSachSanPham) {
	            System.out.println(sanPham.ten + " - " + sanPham.gia);
	        }
	    }

	    static void xoaSanPhamTheoTen() {
	        System.out.print("Nhập tên sản phẩm cần xóa: ");
	        String tenCanXoa = scanner.nextLine();
	        boolean timThay = false;
	        for (int i = 0; i < danhSachSanPham.size(); i++) {
	            if (danhSachSanPham.get(i).ten.equals(tenCanXoa)) {
	                danhSachSanPham.remove(i);
	                timThay = true;
	                break;
	            }
	        }
	        if (timThay) {
	            System.out.println("Đã xóa sản phẩm '" + tenCanXoa + "' khỏi danh sách.");
	        } else {
	            System.out.println("Không tìm thấy sản phẩm '" + tenCanXoa + "' trong danh sách.");
	        }
	    }

	    static void xuatGiaTrungBinh() {
	        if (danhSachSanPham.size() == 0) {
	            System.out.println("Danh sách sản phẩm trống.");
	            return;
	        }
	        double tongGia = 0;
	        for (SanPham sanPham : danhSachSanPham) {
	            tongGia += sanPham.gia;
	        }
	        double giaTrungBinh = tongGia / danhSachSanPham.size();
	        System.out.println("Giá trung bình của các sản phẩm là: " + giaTrungBinh);
	    }
	}
	
}
