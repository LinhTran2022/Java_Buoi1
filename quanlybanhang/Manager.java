package quanlybanhang;

import java.io.*;
import java.util.*;


public class Manager {
    private List<MatHang> danhSachMatHang;
    private List<NhanVien> danhSachNhanVien;
    private List<KhachHang> danhSachKhachHang;
    private List<DonHang> danhSachDonHang;
    
    public Manager() {
        danhSachMatHang = new ArrayList<MatHang>();
        danhSachNhanVien = new ArrayList<NhanVien>();
        danhSachKhachHang = new ArrayList<KhachHang>();
        danhSachDonHang = new ArrayList<DonHang>();
    }
    
    public void themMatHang() throws IOException{
        MatHang p = new MatHang();
        danhSachMatHang.add(p);
        p.nhap();
    }
    
    public void themNhanVien() throws IOException{
        NhanVien p = new NhanVien();
        danhSachNhanVien.add(p);
        p.nhap();
    }
    
    public void themKhachHang() throws IOException{
        KhachHang c = new KhachHang();
        danhSachKhachHang.add(c);
        c.nhap();
    }
    
    public void themDonHang(){
        DonHang o = new DonHang();
        danhSachDonHang.add(o);
        o.nhap();
    }
    
    public void inDanhSachMatHang(){
        for(MatHang i : danhSachMatHang){
            System.out.println(i.toString());
        }
    }
    
    public void inDanhSachNhanVien(){
        for(NhanVien i : danhSachNhanVien){
            System.out.println(i.toString());
        }
    }
    
    public void inDanhSachKhachHang(){
        for(KhachHang i : danhSachKhachHang){
            System.out.println(i.toString());
        }
    }
    
    public void sapXepDHtheoMaNV(){
        Collections.sort(danhSachDonHang, new Comparator<DonHang>(){
            @Override
            public int compare(DonHang o1, DonHang o2) {
                if(o1.getMaNhanVienBan().compareTo(o2.getMaNhanVienBan()) > 0){
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });
    }
    
}
