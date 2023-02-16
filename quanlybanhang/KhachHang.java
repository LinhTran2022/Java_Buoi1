
package quanlybanhang;

import java.util.*;
import java.io.*;

public class KhachHang {
    public static int stt_khachHang = 0;
    private String maKhachHang;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private String gmail;

    public KhachHang(){
        
    }
    
    public KhachHang(String hoTen, String diaChi, String soDienThoai, String gmail) {
        stt_khachHang++;
        maKhachHang = String.format("%05d",stt_khachHang);;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.gmail = gmail;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getGmail() {
        return gmail;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    
    public void nhap() throws IOException {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Ho ten khach hang: ");
        this.hoTen = nhap.nextLine();
        System.out.print("Dia chi khach hang: ");
        this.diaChi = nhap.nextLine();
        System.out.print("So dien thoai khach hang: ");
        this.soDienThoai = nhap.nextLine();
        System.out.print("Gmail khach hang: ");
        this.gmail = nhap.nextLine();
        
        try{
            FileWriter w = new FileWriter("KH.txt");
            w.write(this.toString());
            w.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    @Override
    public String toString() {
        return "Khach hang {" +
                "ma khach hang =" + maKhachHang +
                ", ho ten ='" + hoTen + '\'' +
                ", dia chi ='" + diaChi + '\'' +
                ", so dien thoai ='" + soDienThoai + '\'' +
                ", gmail ='" + gmail + '\'' +
                '}';
    }
}
