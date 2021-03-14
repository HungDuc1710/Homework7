import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách giáo khoa muốn nhập: ");
        int slSgk = sc.nextInt();
        Sach sgk[] = new Sach[slSgk];

        for (int i = 0; i < slSgk; i++) {
            sgk[i] = new Sachgiaokhoa();
            sgk[i].input();
            System.out.println(sgk[i].toString()); 
        }
        
        System.out.println("\nNhập số lượng đồ án muốn nhập: ");
        int slDoAn = sc.nextInt();
        Sach doan[] = new Sach[slDoAn];

        for (int i = 0; i < slDoAn; i++) {
            doan[i] = new DoAn();
            doan[i].input();
            System.out.println(doan[i].toString());
        }

        System.out.println("\nNhập số lượng tài liệu điện tử muốn nhập: ");
        int slEbook = sc.nextInt();
        Sach ebook[] = new Sach[slEbook];

        for (int i = 0; i < slEbook; i++) {
            ebook[i] = new Ebook();
            ebook[i].input();
            System.out.println(ebook[i].toString());
        }
        sc.close();
    }
}
