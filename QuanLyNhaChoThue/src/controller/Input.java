package controller;

import java.util.*;
import models.KhachHang;
import models.Phong;
import models.DanhSachPhong;

public class Input {
    private Scanner input = new Scanner(System.in);
    
    public void Input(){}
    
    public int nhapLuaChon(){
        System.out.print("Nhap lua chon : ");
        return Integer.parseInt(input.nextLine());
    }
    
    public KhachHang nhapKhachHang(){
        System.out.print("Nhap ten khach hang : ");
        String tenKH = input.nextLine();
        System.out.print("Nhap dia chi : ");
        String diaChi = input.nextLine();
        System.out.print("Nhap so dien thoai: ");
        String sdt = input.nextLine();
        System.out.print("Chon loai khach hang (1. Sinh vien \t2. Ho gia dinh \t3. Doanh nghiep): ");
        int i = Integer.parseInt(input.nextLine());
        String loaiKH = "";
        loaiKH = switch (i) {
            case 1 -> "Sinh vien";
            case 2 -> "Ho gia dinh";
            default -> "Doanh nghiep";
        };
        
        return new KhachHang(tenKH, diaChi, sdt, loaiKH);
    }
    
    public Phong nhapPhong(){
        System.out.print("Nhap ten phong : ");
        String tenP = input.nextLine();
        System.out.print("Nhap loai phong (1. Phong VIP \t2. Phong chat luong cao \t3. Phong thuong): ");
        int i = Integer.parseInt(input.nextLine());
        String loaiP = "";
        loaiP = switch (i) {
            case 1 -> "Phong VIP";
            case 2 -> "Phong chat luong cao";
            default -> "Phong thuong";
        };
        return new Phong(tenP,loaiP);
    }
    
    public DanhSachPhong nhapDanhSachPhong(ArrayList<KhachHang> danhSachKhachHang){
        System.out.print("Ma khach hang : ");
        String maKH = input.nextLine();
        System.out.print("Ma phong : ");
        String maP = input.nextLine();
        System.out.print("Thoi gian thue : ");
        String batDauThue = input.nextLine();
        
        String tenKH = "";
        KhachHang temp = Process.coKhachHang(danhSachKhachHang, maKH);
        if(temp != null){
            tenKH = temp.getTenKH();
        }
        return new DanhSachPhong(maKH, tenKH, maP, batDauThue);
    }
}
