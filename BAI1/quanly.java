package BAI1;
import java.util.Scanner;
public class quanly extends nhanvien {
    private String chuyenMon;
    private double phuCapChucVu;

    public quanly() {
        super();
        this.chuyenMon = "";
        this.phuCapChucVu = 0;
    }

    public quanly(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan, String chuyenMon, double phuCapChucVu) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapChucVu = phuCapChucVu;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }
    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }
    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenMon = scanner.nextLine();
        System.out.print("Nhap phu cap chuc vu: ");
        this.phuCapChucVu = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " +chuyenMon+ ",Phu cap chuc vu: " +phuCapChucVu);
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan + this.phuCapChucVu;
    }
}
