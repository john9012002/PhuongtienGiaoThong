import java.util.Scanner;

public class PhuongTienGiaoThong{
    protected String hangSanXuat;
    protected String tenPhuongTien;
    protected int namSanXuat;
    protected float vanTocToiDa;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String hangSanXuat, String tenPhuongTien, int namSanXuat, float vanTocToiDa) {
        this.hangSanXuat = hangSanXuat;
        this.tenPhuongTien = tenPhuongTien;
        this.namSanXuat = namSanXuat;
        this.vanTocToiDa = vanTocToiDa;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public float getVanTocToiDa() {
        return vanTocToiDa;
    }

    public void setVanTocToiDa(float vanTocToiDa) {
        this.vanTocToiDa = vanTocToiDa;
    }
    
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap hang san xuat: ");
        hangSanXuat = scanner.nextLine();
        System.out.print("Nhap ten phuong tien: ");
        tenPhuongTien = scanner.nextLine();
        System.out.print("Nhap nam san xuat: ");
        namSanXuat = scanner.nextInt();
        System.out.print("Nhap van toc toi da: ");
        vanTocToiDa = scanner.nextFloat();
    }

    public void xuatThongTin() {
        System.out.println("Hang san xuat: " + hangSanXuat);
        System.out.println("Ten phuong tien: " + tenPhuongTien);
        System.out.println("Nam san xuat: " + namSanXuat);
        System.out.println("Van toc toi da: " + vanTocToiDa);
    }
}