package BAI2;
import java.util.Scanner;

interface Hinh {
    float pi = 3.14f;
    void nhap();
    void xuat();
    float dienTich();
}

class HinhVuong implements Hinh {
    private float canh;

    public HinhVuong() {
        this.canh = 0;
    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        this.canh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Canh: " + canh + ", Dien tich: " + dienTich());
    }

    @Override
    public float dienTich() {
        return canh * canh;
    }
}

class HinhChuNhat implements Hinh {
    private float dai;
    private float rong;

    public HinhChuNhat() {
        this.dai = 0;
        this.rong = 0;
    }

    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.dai = scanner.nextFloat();
        System.out.print("Nhap chieu rong: ");
        this.rong = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Chieu Dai: " + dai + ",Chieu Rong: " + rong + ", Dien tich: " + dienTich());
    }

    @Override
    public float dienTich() {
        return dai * rong;
    }
}

class HinhTron implements Hinh {
    private float banKinh;

    public HinhTron() {
        this.banKinh = 0;
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        this.banKinh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Ban kinh: " + banKinh + ", Dien tich: " + dienTich());
    }

    @Override
    public float dienTich() {
        return pi * banKinh * banKinh;
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Hinh ds[] = new Hinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Chon hinh se nhap: ");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            System.out.print("Lua chon cua ban: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    ds[i].nhap();
                    break;
                case 2:
                    ds[i] = new HinhChuNhat();
                    ds[i].nhap();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    ds[i].nhap();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren");
                    i--;
                    break;
            }
        }
        System.out.println("\nDanh sach cac hinh:");
        for (Hinh hinh : ds) {
            hinh.xuat();
        }
        Hinh hinhDienTichLonNhat = ds[0];
        for (Hinh hinh : ds) {
            if (hinh.dienTich() > hinhDienTichLonNhat.dienTich()) {
                hinhDienTichLonNhat = hinh;
            }
        }
        System.out.println("\nHinh co dien tich lon nhat:");
        hinhDienTichLonNhat.xuat();
    }
}