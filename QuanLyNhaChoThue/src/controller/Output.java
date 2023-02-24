package controller;

import java.util.ArrayList;
import models.KhachHang;
import models.Phong;
import models.DanhSachPhong;


public class Output {
    public Output(){}
    
    public void showMenu(){
        System.out.println("========MENU========");
        System.out.println("1. Them khach hang.");
        System.out.println("2. Them phong.");
        System.out.println("3. Liet ke thong tin khach hang.");
        System.out.println("4. Liet ke cac phong co san theo phan loai.");
        System.out.println("5. Them danh sach phong duoc thue.");
        System.out.println("6. Thong ke luong khach hang chon thue cac loai phong.");
        System.out.println("7. Thong tin thue phong theo ten khach hang.");
        System.out.println("8. Sap xep khach hang theo ten.");
        System.out.println("9. Sap xep khach hang theo thoi gian thue phong.");
        System.out.println("0. Exit.");
    }
    public void xuatDanhSachKhachHang(ArrayList<KhachHang> danhSachKhachHang){
        System.out.println("Danh sach khach hang : ");
        for(KhachHang i : danhSachKhachHang){
            System.out.println(i.toString());
        }
    }
    
    public void xuatDanhSachPhong(ArrayList<Phong> danhSachPhong){
        System.out.println("Danh sach phong VIP : ");
        for(Phong i : danhSachPhong){
            if(i.getLoaiP().compareTo("Phong VIP") == 0){
                System.out.println(i.toString());
            }
        }
        
        System.out.println("Danh sach phong chat luong cao : ");
        for(Phong i : danhSachPhong){
            if(i.getLoaiP().compareTo("Phong chat luong cao") == 0){
                System.out.println(i.toString());
            }
        }
        
        System.out.println("Danh sach phong thuong : ");
        for(Phong i : danhSachPhong){
            if(i.getLoaiP().compareTo("Phong thuong") == 0){
                System.out.println(i.toString());
            }
        }
    }
    
    public void xuatTongHopDanhSachPhong(ArrayList<DanhSachPhong> tongHopDanhSachPhong, ArrayList<KhachHang> danhSachKhachHang){
        System.out.println("Danh sach phong da duoc thue: ");
        for(DanhSachPhong i : tongHopDanhSachPhong){
            System.out.println("\t* Ma phong : " + i.getMaP());
            System.out.println("\tMa khach hang: " + i.getMaKH());
            System.out.print("\tTen khach hang : ");
            
            KhachHang temp = Process.coKhachHang(danhSachKhachHang, i.getMaKH());
            if(temp != null){
                i.setTenKH(temp.getTenKH());
                System.out.println(temp.getTenKH());
            }
            
            System.out.println("\tThoi gian bat dau thue : " + i.getBatDauThue());
        }
    }
}