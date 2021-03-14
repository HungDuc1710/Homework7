public abstract class Hinhhoc {
    public abstract double tinhChuVi();

    public abstract double tinhDienTich();

    public void display() {
        System.out.println("Chu vi: "+tinhChuVi()+" cm");
        System.out.println("Diện tích: "+tinhDienTich()+" cm2");
    }
}
