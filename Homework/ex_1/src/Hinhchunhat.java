public class Hinhchunhat extends Hinhhoc implements InHinhchunhat {
    private double chieuDai;
    private double chieuRong; 

    
    @Override
    public double tinhDuongcheo() {
       
        return Math.sqrt(Math.pow(chieuDai, 2) + Math.pow(chieuRong, 2)) ;
    }

    @Override
    public double tinhChuVi() {
        
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    @Override
    public void display() {
        System.out.println("\nThông tin hình chữ nhật: ");
        System.out.println("Chiều dài: " + chieuDai+" cm");
        System.out.println("Chiều rộng: " + chieuRong+" cm");
        System.out.println("Đường chéo: " + tinhDuongcheo()+" cm");
        super.display();
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public Hinhchunhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public Hinhchunhat() {
    }
    
}
