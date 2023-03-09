package Hoaqua;

import java.util.Scanner;

public class Hoaqua{
public double giaban;
public String nguongocxuatxu;
public String ngaynhap;
public double soluong;
    public double getSoluong() {
        return soluong;
    }
    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }
    public Hoaqua(double giaban, String nguongocxuatxu, String ngaynhap, double soluong) {
        this.giaban = giaban;
        this.nguongocxuatxu = nguongocxuatxu;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
    
    public double getGiaban() {
        return giaban;
    }
    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }
    public String getNguongocxuatxu() {
        return nguongocxuatxu;
    }
    public void setNguongocxuatxu(String nguongocxuatxu) {
        this.nguongocxuatxu = nguongocxuatxu;
    }
    public String getNgaynhap() {
        return ngaynhap;
    }
    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    void nhap()
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("nhap gia ban");
    giaban =sc.nextDouble();
    System.out.println("nhap nguon goc xuat xu");
    nguongocxuatxu=sc.nextLine();
    System.out.println("nhap ngay nhap");
    ngaynhap = sc.nextLine();
    System.out.println("nhap so luong");
    soluong = sc.nextDouble();
    }
    void thanhtien(double thanhtien)
    {
    thanhtien =soluong*giatien;
    }
}
class Quacam extends Hoaqua
{
    public Quacam(double giaban, String nguongocxuatxu, String ngaynhap, double soluong)
    {
    super(giaban, nguongocxuatxu, ngaynhap, soluong);
    }
public String mausac;
public String loaicam;
public String dochuangot;
}
class Quatao extends Hoaqua
{
    public Quatao(double giaban, String nguongocxuatxu, String ngaynhap, String soluong)
    { 
    super(giaban, nguongocxuatxu, ngaynhap, soluong);
    }
public String mausac;
public String loaitao;
}
class Camsanh extends Quacam
{
    public Camsanh(double giaban, String nguongocxuatxu, String ngaynhap, double soluong)
    {
    super(giaban, nguongocxuatxu, ngaynhap, soluong);
    }
public String ngot;
}
class Camcaophong extends Quacam
{
    public Camcaophong(dounle giaban, String nguongocxuatxu, String ngaynhap, double soluong)
    {
    super(giaban, nguongocxuatxu, ngaynhap, soluong);
    }
public String chua;
}
class main
{
public static void main(String[] arg)
{
Hoaqua hq = new Hoaqua();
hq.nhap();
}
}
        