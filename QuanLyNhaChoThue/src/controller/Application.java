package controller;

import java.util.ArrayList;
import models.KhachHang;
import models.Phong;
import models.DanhSachPhong;

public class Application {
    private ArrayList<KhachHang> danhSachKhachHang;
    private ArrayList<Phong> danhSachPhong;
    private ArrayList<DanhSachPhong> tongHoDanhSachPhong;
    
    private Input input = new Input();
    private Output output = new Output();

    public Application() {
        danhSachKhachHang = new ArrayList<>();
        danhSachPhong = new ArrayList<>();
        tongHoDanhSachPhong = new ArrayList<>();
    }
    
    public void run(){
        int c = -1;
        while(c != 0){
            output.showMenu();
            c = input.nhapLuaChon();
            switch(c){
                case 1:{
                    danhSachKhachHang.add(input.nhapKhachHang());
                    break;
                }
                case 2:{
                    danhSachPhong.add(input.nhapPhong());
                    break;
                }
                case 3:{
                    output.xuatDanhSachKhachHang(danhSachKhachHang);
                    break;
                }
                case 4:{
                    output.xuatDanhSachPhong(danhSachPhong);
                    break;
                }
                case 5:{
                    tongHoDanhSachPhong.add(input.nhapDanhSachPhong(danhSachKhachHang));
                    break;
                }
                case 6:{
                    Process.thongKePhong(tongHoDanhSachPhong, danhSachPhong);
                    break;
                }
                
                case 7:{
                    output.xuatTongHopDanhSachPhong(tongHoDanhSachPhong, danhSachKhachHang);
                    break;
                }
                case 8:{
                    Process.sapXepTheoTenKhachHang(tongHoDanhSachPhong);
                    output.xuatTongHopDanhSachPhong(tongHoDanhSachPhong, danhSachKhachHang);
                    break;
                }
                case 9:{
                    Process.sapXepTheoThoiGianThue(tongHoDanhSachPhong);
                    output.xuatTongHopDanhSachPhong(tongHoDanhSachPhong, danhSachKhachHang);
                    break;
                }
            }
        }
    }
}
