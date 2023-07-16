import java.util.Arrays;
import java.util.Scanner;

public class OTo extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuDongCo;

    public OTo() {
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public OTo(String hangSanXuat, String tenPhuongTien, int namSanXuat, float vanTocToiDa, int soChoNgoi, String kieuDongCo) {
        super(hangSanXuat, tenPhuongTien, namSanXuat, vanTocToiDa);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chỗ ngồi: ");
        soChoNgoi = scanner.nextInt();
        System.out.print("Nhập kiểu động cơ: ");
        kieuDongCo = scanner.next();
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số chỗ ngồi: " + soChoNgoi);
        System.out.println("Kiểu động cơ: " + kieuDongCo);
    }

    public float tinhVanTocCoSo() {
        return vanTocToiDa / soChoNgoi;
    }

    public static void sapXepGiamDan(OTo[] danhSachOTo) {
        Arrays.sort(danhSachOTo, (oto1, oto2) -> {
            float vanTocCoSo1 = oto1.tinhVanTocCoSo();
            float vanTocCoSo2 = oto2.tinhVanTocCoSo();
            if (vanTocCoSo1 < vanTocCoSo2) {
                return 1;
            } else if (vanTocCoSo1 > vanTocCoSo2) {
                return -1;
            }
            return 0;
        });
    }
}