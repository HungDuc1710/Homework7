public class Hinhtron extends Hinhhoc implements InHinhtron {
    private double banKinh;
    
 
    @Override
    public double tinhChuVi() {
        
        return banKinh * 2 * Math.PI;
    }

    @Override
    public double tinhDienTich() {

        return Math.pow(banKinh, 2) * Math.PI;
    }

    @Override
    public double duongKinh() {

        return banKinh * 2;
    }
    
    @Override
    public void display() {
        System.out.println("Thông tin hình tròn: ");
        System.out.println("Bán kính :" + banKinh+" cm");
        System.out.println("Đường kính:  "+duongKinh()+" cm");
        super.display();

    }
    
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public Hinhtron(double banKinh) {
        this.banKinh = banKinh;
    }

    public Hinhtron() {
    }


}
