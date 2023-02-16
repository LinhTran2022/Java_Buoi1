package quanlybanhang;
import java.time.LocalDate;
import java.time.LocalDateTime; 
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class DonHang {
    public static int stt_donHang = 0;
    private String maDonHang;
    private String maMatHangBan;
    private String maKhachHangMua;
    private String maNhanVienBan;
    private int soLuongMua;
    private LocalDateTime thoiGianMua;

    public DonHang(){
        
    }
    
    public DonHang(String maMatHangBan, String maKhachHangMua, String maNhanVienBan, int soLuongMua, LocalDateTime thoiGianMua) {
        stt_donHang++;
        maDonHang = String.format("%06d",stt_donHang);
        this.maMatHangBan = maMatHangBan;
        this.maKhachHangMua = maKhachHangMua;
        this.maNhanVienBan = maNhanVienBan;
        this.soLuongMua = soLuongMua;
        this.thoiGianMua = thoiGianMua;
    }

    public static int getStt_donHang() {
        return stt_donHang;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public String getMaMatHangBan() {
        return maMatHangBan;
    }

    public String getMaKhachHangMua() {
        return maKhachHangMua;
    }

    public String getMaNhanVienBan() {
        return maNhanVienBan;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public LocalDateTime getThoiGianMua() {
        return thoiGianMua;
    }

    public static void setStt_donHang(int stt_donHang) {
        DonHang.stt_donHang = stt_donHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public void setMaMatHangBan(String maMatHangBan) {
        this.maMatHangBan = maMatHangBan;
    }

    public void setMaKhachHangMua(String maKhachHangMua) {
        this.maKhachHangMua = maKhachHangMua;
    }

    public void setMaNhanVienBan(String maNhanVienBan) {
        this.maNhanVienBan = maNhanVienBan;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public void setThoiGianMua(LocalDateTime thoiGianMua) {
        this.thoiGianMua = thoiGianMua;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Ma san pham: ");
        this.maMatHangBan = nhap.nextLine();
        System.out.print("Ma khach hang mua san pham: ");
        this.maKhachHangMua = nhap.nextLine();
        System.out.print("Ma nhan vien ban san pham: ");
        this.maNhanVienBan = nhap.nextLine();
        System.out.print("So luong hang da mua: ");
        this.soLuongMua = Integer.parseInt(nhap.nextLine());
        LocalDateTime thoiGianmua = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        this.thoiGianMua = thoiGianmua;
        
        try{
            FileWriter w = new FileWriter("DH.txt");
            w.write(this.toString());
            w.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    @Override
    public String toString() {
        return "Don Hang {" +
                "ma don hang =" + maDonHang +
                ", ma mat hang ban ='" + maMatHangBan + '\'' +
                ", ma khach hang mua ='" + maKhachHangMua + '\'' +
                ", ma nhan vien ban ='" + maNhanVienBan + '\'' +
                ", so luong =" + soLuongMua +
                ", thoi gian mua =" + thoiGianMua +
                '}';
    }
}
