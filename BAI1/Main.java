package BAI1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<nhanvien> danhSachNhanVien = new ArrayList<>();

        // Tạo một đối tượng QuanLy với maNhanVien = "QL001", tenNhanVien = "Nguyen Van A",
        // trinhDo = "Dai hoc", chuyenMon = "Quan tri", phuCapChucVu = 2000000
        quanly quanLy = new quanly("QL001", "Nguyen Van A", "Dai hoc", 5000000, "Quan tri", 2000000);

        // Gọi phương thức nhap() để nhập thông tin cho quanLy
        System.out.println("Nhap thong tin cho nhan vien quan ly:");
        quanLy.nhap();

        // Gọi phương thức xuat() để in thông tin của quanLy
        System.out.println("\nThong tin nhan vien quan ly:");
        quanLy.xuat();

        // In lương của quanLy
        // Sử dụng phương thức tinhLuong()
        System.out.println("Luong: " + quanLy.tinhLuong());

        // Tạo một đối tượng NghienCuu với maNhanVien = "NC001", tenNhanVien = "Tran Thi B",
        // trinhDo = "Thac si", chuyenMon = "Hoa hoc", phuCapDocHai = 1500000
        nghiencuu nghienCuu = new nghiencuu("NC001", "Tran Thi B", "Thac si", 1000000, "Hoa hoc", 1500000);

        // Gọi phương thức nhap() để nhập thông tin cho nghienCuu
        System.out.println("\nNhap thong tin cho nhan vien nghien cuu:");
        nghienCuu.nhap();

        // Gọi phương thức xuat() để in thông tin của nghienCuu
        System.out.println("\nThong tin nhan vien nghien cuu:");
        nghienCuu.xuat();

        // In lương của nghienCuu
        // Sử dụng phương thức tinhLuong()
        System.out.println("Luong: " + nghienCuu.tinhLuong());

        // Tạo một đối tượng PhucVu với maNhanVien = "PV001", tenNhanVien = "Le Van C",
        // trinhDo = "Trung cap"
        phucvu phucVu = new phucvu("PV001", "Le Van C", "Trung cap", 3500000);

        // Gọi phương thức nhap() để nhập thông tin cho phucVu
        System.out.println("\nNhap thong tin cho nhan vien phuc vu:");
        phucVu.nhap();

        // Gọi phương thức xuat() để in thông tin của phucVu
        System.out.println("\nThong tin nhan vien phuc vu:");
        phucVu.xuat();

        // In lương của phucVu
        // Sử dụng phương thức tinhLuong()
        System.out.println("Luong: " + phucVu.tinhLuong());

        // Thêm các nhân viên vào danh sách
        danhSachNhanVien.add(quanLy);
        danhSachNhanVien.add(nghienCuu);
        danhSachNhanVien.add(phucVu);

        // Xuất thông tin và lương của tất cả nhân viên trong danh sách
        System.out.println("\nDanh sach nhan vien:");
        for (nhanvien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
        }
    }
}