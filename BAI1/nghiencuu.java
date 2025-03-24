package BAI1;
import java.util.Scanner;
public class nghiencuu extends nhanvien{
    private String chuyenMon;
    private double phuCapDocHai;

    public nghiencuu() {
        super();
        this.chuyenMon = "";
        this.phuCapDocHai = 0;
    }

    public nghiencuu(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan, String chuyenMon, double phuCapDocHai) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }
    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }
    public void setPhuCapDocHai(double phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenMon = scanner.nextLine();
        System.out.print("Nhap phu cap doc hai: ");
        this.phuCapDocHai = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " +chuyenMon+ ",Phu cap doc hai: " +phuCapDocHai);
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan + this.phuCapDocHai;
    }

}
