import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng ô tô: ");
        int n = scanner.nextInt();
        OTo[] danhSachOTo = new OTo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin ô tô thứ " + (i + 1) + ":");
            danhSachOTo[i] = new OTo();
            danhSachOTo[i].nhapThongTin();
        }

        System.out.println("Thông tin các ô tô:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ô tô thứ " + (i + 1) + ":");
            danhSachOTo[i].xuatThongTin();
            System.out.println("Vận tốc cơ sở: " + danhSachOTo[i].tinhVanTocCoSo());
            System.out.println();
        }

        OTo.sapXepGiamDan(danhSachOTo);

        System.out.println("Danh sách các ô tô sau khi sắp xếp theo vận tốc cơ sở giảm dần:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ô tô thứ " + (i + 1) + ":");
            danhSachOTo[i].xuatThongTin();
            System.out.println("Vận tốc cơ sở: " + danhSachOTo[i].tinhVanTocCoSo());
            System.out.println();
        }
    }
}
