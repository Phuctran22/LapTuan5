package lap5bai5;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ConNguoi {
protected String hoTen;
    protected int namSinh;

    public ConNguoi() {
        this.hoTen = "";
        this.namSinh = 0;
    }

    public ConNguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = scanner.nextInt();
        scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
    }
}

class HocVien extends ConNguoi {
    private float diem1;
    private float diem2;
    private float diem3;

    public HocVien() {
        super();
        this.diem1 = 0.0f;
        this.diem2 = 0.0f;
        this.diem3 = 0.0f;
    }

    public HocVien(String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float getDiem1() {
        return this.diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return this.diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return this.diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem 1: ");
        this.diem1 = scanner.nextFloat();
        System.out.print("Nhap diem 2: ");
        this.diem2 = scanner.nextFloat();
        System.out.print("Nhap diem 3: ");
        this.diem3 = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Diem 1: " + this.diem1);
        System.out.println("Diem 2: " + this.diem2);
        System.out.println("Diem 3: " + this.diem3);
    }
}

class PhongKhoaBan {
    private String maPhongKhoaBan;
    private String tenPhongKhoaBan;

    public PhongKhoaBan() {
        this.maPhongKhoaBan = "";
        this.tenPhongKhoaBan = "";
    }

    public PhongKhoaBan(String maPhongKhoaBan, String tenPhongKhoaBan) {
        this.maPhongKhoaBan = maPhongKhoaBan;
        this.tenPhongKhoaBan = tenPhongKhoaBan;
    }

    public String getMaPhongKhoaBan() {
        return this.maPhongKhoaBan;
    }

    public void setMaPhongKhoaBan(String maPhongKhoaBan) {
        this.maPhongKhoaBan = maPhongKhoaBan;
    }

    public String getTenPhongKhoaBan() {
        return this.tenPhongKhoaBan;
    }

    public void setTenPhongKhoaBan(String tenPhongKhoaBan) {
        this.tenPhongKhoaBan = tenPhongKhoaBan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma phong khoa ban: ");
        this.maPhongKhoaBan = scanner.nextLine();
        System.out.print("Nhap ten phong khoa ban: ");
        this.tenPhongKhoaBan = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ma phong khoa ban: " + this.maPhongKhoaBan);
        System.out.println("Ten phong khoa ban: " + this.tenPhongKhoaBan);
    }
}

class NhanVien extends ConNguoi {
    private double luong;
    private Date ngayNhanViec;
    private PhongKhoaBan phongKhoaBan;

    public NhanVien() {
        super();
        this.luong = 0.0;
        this.ngayNhanViec = null;
        this.phongKhoaBan = null;
    }

    public NhanVien(String hoTen, int namSinh, double luong, Date ngayNhanViec, PhongKhoaBan phongKhoaBan) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongKhoaBan = phongKhoaBan;
    }

    public double getLuong() {
        return this.luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Date getNgayNhanViec() {
        return this.ngayNhanViec;
    }

    public void setNgayNhanViec(Date ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PhongKhoaBan getPhongKhoaBan() {
        return this.phongKhoaBan;
    }

    public void setPhongKhoaBan(PhongKhoaBan phongKhoaBan) {
        this.phongKhoaBan = phongKhoaBan;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        this.luong = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap ngay nhan viec (dd/MM/yyyy): ");
        String ngayNhanViecStr = scanner.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.ngayNhanViec = sdf.parse(ngayNhanViecStr);
        } catch (Exception e) {
            System.out.println("Loi dinh dang ngay, gan mac dinh la null");
            this.ngayNhanViec = null;
        }
        System.out.println("Nhap thong tin phong khoa ban:");
        this.phongKhoaBan = new PhongKhoaBan();
        this.phongKhoaBan.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong: " + this.luong);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngay nhan viec: " + (this.ngayNhanViec != null ? sdf.format(this.ngayNhanViec) : "Khong co"));
        System.out.println("Thong tin phong khoa ban:");
        if (this.phongKhoaBan != null) {
            this.phongKhoaBan.xuat();
        } else {
            System.out.println("Khong co thong tin phong khoa ban");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin hoc vien:");
        HocVien hocVien = new HocVien();
        hocVien.nhap();

        System.out.println("Nhap thong tin nhan vien:");
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhap();

        System.out.println("\nThong tin hoc vien:");
        hocVien.xuat();

        System.out.println("\nThong tin nhan vien:");
        nhanVien.xuat();

        scanner.close();
    }
}
