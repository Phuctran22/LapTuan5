package BAI1;
import java.util.Scanner;
public class phucvu extends nhanvien {
    public phucvu() {
        super();
    }

    public phucvu(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan;
      
    }

}
