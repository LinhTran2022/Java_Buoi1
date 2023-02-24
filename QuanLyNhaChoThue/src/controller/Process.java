package controller;
import java.util.*;
import models.KhachHang;
import models.Phong;
import models.DanhSachPhong;

public class Process {
    private int soPhongVip;
    private int soPhongCLC;
    private int soPhongThuong;
    
    private static Map<String, Integer> soPhong = new HashMap<>();
    
    
    
    public static void thongKePhong(ArrayList<DanhSachPhong> tongHopdanhSachPhong, ArrayList<Phong> danhSachPhong){
        soPhong.put("Phong VIP", 0);
        soPhong.put("Phong chat luong cao", 0);
        soPhong.put("Phong thuong", 0);
        
        if(tongHopdanhSachPhong != null && danhSachPhong != null){
            for(DanhSachPhong i : tongHopdanhSachPhong){
                Phong temp = Process.coPhong(danhSachPhong, i.getMaP());
                if(temp != null){
                    soPhong.put(temp.getLoaiP(), soPhong.get(temp.getLoaiP()) + 1);
                }
            }

            for(Map.Entry<String, Integer> i : soPhong.entrySet()){
                System.out.println(i.getKey() + ": " + (float)i.getValue()/tongHopdanhSachPhong.size());
            }
        }
    }
    
    public static Phong coPhong(ArrayList<Phong> danhSachPhong, String maP){
        for(Phong i : danhSachPhong){
            if(i.getMaP().compareTo(maP) == 0){
                return i;
            }
        }
        return null;
    }
    
    public static KhachHang coKhachHang(ArrayList<KhachHang> danhSachKhachHang, String maKH){
        for(KhachHang i : danhSachKhachHang){
            if(i.getMaKH().compareTo(maKH) == 0){
                return i;
            }
        }
        return null;
    }
    
    public static void sapXepTheoTenKhachHang(ArrayList<DanhSachPhong> tongHopDanhSachPhong){
        Collections.sort(tongHopDanhSachPhong, new Comparator<DanhSachPhong>(){
            @Override
            public int compare(DanhSachPhong o1, DanhSachPhong o2) {
                if(o1.getTenKH().compareTo(o2.getTenKH()) < 0){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
    }
    
    public static void sapXepTheoThoiGianThue(ArrayList<DanhSachPhong> tongHoDanhSachPhong){
        Collections.sort(tongHoDanhSachPhong, new Comparator<DanhSachPhong>(){
            @Override
            public int compare(DanhSachPhong o1, DanhSachPhong o2) {
                if(o1.getBatDauThue().compareTo(o2.getBatDauThue()) > 0){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
    }
}
