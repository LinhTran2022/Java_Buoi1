package quanlybanhang;

import java.util.*;
import java.io.*;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private String loaiNhanVien;

    public NhanVien(){        
    }
    public NhanVien(String maNhanVien, String hoTen, String diaChi, String soDienThoai, String loaiNhanVien) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.loaiNhanVien = loaiNhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
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

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
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

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public void nhap() throws IOException {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Ma nhan vien: ");
        this.maNhanVien = nhap.nextLine();
        System.out.print("Ho ten nhan vien: ");
        this.hoTen = nhap.nextLine();
        System.out.print("Dia chi nhan vien: ");
        this.diaChi = nhap.nextLine();
        System.out.print("So dien thoai nhan vien: ");
        this.soDienThoai = nhap.nextLine();
        
        try{
            FileWriter w = new FileWriter("NV.txt");
            w.write(this.toString());
            w.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    @Override
    public String toString() {
        return "Nhan vien {" +
                "ma nhan vien ='" + maNhanVien + '\'' +
                ", ho ten ='" + hoTen + '\'' +
                ", dia chi ='" + diaChi + '\'' +
                ", so dien thoai ='" + soDienThoai + '\'' +
                ", loai nhan vien ='" + loaiNhanVien + '\'' +
                '}';
    }
}
