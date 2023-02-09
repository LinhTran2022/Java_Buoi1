package quanlygiangvien;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager { // thieu : sua giang vien, tim giang vien gan dung, tinh tong/tbinh luong, gvien luong cao nhat
    private ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public static Matcher matcher;
    public static Pattern chp = Pattern.compile("CH[0-9]{3}");
    public static Pattern tgp = Pattern.compile("TG[0-9]{3}");
    
    public Manager(){}
    
    public void Menu(){
        System.out.println("+--------------------MENU--------------------+");
        System.out.println("| 1. Giang vien co huu                       |");
        System.out.println("| 2. Giang vien thinh giang                  |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon: ");
    }
    
    public void Menu1(){
        System.out.println("+--------------------MENU--------------------+");
        System.out.println("| 1. Khong co                                |");
        System.out.println("| 2. Giao su                                 |");
        System.out.println("| 3. Pho giao su                             |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon: ");
    }
    
    public void Menu2(){
        System.out.println("+--------------------MENU--------------------+");
        System.out.println("| 1. Dai hoc                                 |");
        System.out.println("| 2. Thac si                                 |");
        System.out.println("| 3. Tien si                                 |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon: ");
    }
    
    public void Menu3(){
        System.out.println("+--------------------------------------------+");
        System.out.println("| 1. Sap xep theo ten                        |");
        System.out.println("| 2. Sap xep theo he so luong                |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon: ");
    }
    
    public void Menu4(){
        System.out.println("+--------------------MENU--------------------+");
        System.out.println("| 1. Nhap them giang vien                    |");
        System.out.println("| 2. In danh sach giang vien                 |");
        System.out.println("| 3. Xoa giang vien                          |");
        System.out.println("| 4. In danh sach giang vien co huu          |");
        System.out.println("| 5. In danh sach giang vien thinh giang     |");
        System.out.println("| 6. Tinh luong 1 giang vien                 |");
        System.out.println("| 7. Sap xep giang vien                      |");
        System.out.println("| 8. Exit                                    |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon: ");
    }
    
    public void nhapGiangVien(){
        Menu();
        int pick = sc.nextInt(); sc.nextLine();
        
        // nhap ma giang vien
        String maGV;
        while (true){
            System.out.print("Nhap ma giang vien: ");
            maGV = sc.nextLine();
            if ((pick == 1 && !chp.matcher(maGV).matches()) || (pick == 2 && !tgp.matcher(maGV).matches())){
                continue;
            }
            else break;
        }
        
        // Nhap ten, email
        System.out.print("Nhap ten giang vien: ");
        String tenGV = sc.nextLine();
        System.out.print("Nhap email giang vien: ");
        String email = sc.nextLine();
        
        // Nhap hoc ham, hoc vi, cap nhat he so luong
        String hocHam = "";
        float heSoLuong = 0.f; 
        Menu1();
        int check = sc.nextInt(); sc.nextLine();
        switch(check){
            case 1 :
                hocHam = "Khong co";
                break;
            case 2:
                hocHam = "Giao su";
                heSoLuong += 0.2f;
                break;
            case 3:
                hocHam = "Pho giao su";
                heSoLuong += 0.1f;
                break;
        }
        String hocVi = "";
        Menu2();
        int check1 = sc.nextInt(); sc.nextLine();
        switch(check1){
            case 1 :
                hocVi = "Dai hoc";
                heSoLuong += 1.f;
                break;
            case 2:
                hocHam = "Thac si";
                heSoLuong += 1.1f;
                break;
            case 3:
                hocHam = "Tien si";
                heSoLuong += 1.2f;
                break;
        }
        
        // Nhap dia chi, sdt, so gio lam viec
        System.out.print("Dia Chi :");
        String diaChi = sc.nextLine();
        System.out.print("So Dien Thoai :");
        String sdt = sc.nextLine();
        System.out.print("So Gio Lam Viec :");
        int soGioLamViec = sc.nextInt(); sc.nextLine();
        
        switch(pick){
            case 1 -> {
                System.out.print("Nhap luong cung: ");
                float luongCung = sc.nextFloat(); sc.nextLine();
                int soGioQuyDinh = 40;
                GiangVien gv1 = new GiangVienCoHuu(luongCung, soGioQuyDinh, maGV, tenGV, email, hocHam, hocVi, diaChi, sdt, soGioLamViec, heSoLuong);
                danhSachGiangVien.add(gv1);
            }
            case 2 -> {
                System.out.print("Nhap dia chi co quan: ");
                String diaChiCoQuan = sc.nextLine();
                System.out.print("Nhap sdt co quan: ");
                String sdtCoQuan = sc.nextLine();
                GiangVien gv2 = new GiangVienThinhGiang(diaChiCoQuan, sdtCoQuan, maGV, tenGV, email, hocHam, hocVi, diaChi, sdt, soGioLamViec, heSoLuong);
                danhSachGiangVien.add(gv2);
            }
        }
    }
    
    public void xuatGiangVien(){
        System.out.println("Danh sach giang vien");
        for (GiangVien gv : danhSachGiangVien) {
            System.out.println(gv.toString());
        }
        System.out.println("Tong so giang vien: " + danhSachGiangVien.size());
    }
    
    public void xoaGiangVien(){
        System.out.print("Nhap ma giang vien can xoa: ");
        String MaGV = sc.nextLine();
        for (GiangVien gv : danhSachGiangVien) {
            if(gv.getMaGV().equals(MaGV)){
                danhSachGiangVien.remove(gv);
                System.out.println("Xoa thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay giang vien");
    }
    
    public void xuatGiangVienCoHuu(){
        System.out.println("Danh sach giang vien co huu :");
        int cnt = 0;
        for (GiangVien gv : danhSachGiangVien) {
            if(gv instanceof GiangVienCoHuu){
                System.out.println(gv.toString());
                cnt++;
            }
        }
        System.out.println("Tong so giang vien co huu: " + cnt);
    }
    
    public void xuatGiangVienThinhGiang(){
        System.out.println("Danh sach giang vien thinh giang : ");
        int cnt = 0;
        for (GiangVien gv : danhSachGiangVien) {
            if(gv instanceof GiangVienThinhGiang){
                System.out.println(gv.toString());
                cnt++;
            }
        }
        System.out.println("Tong so giang vien thinh giang: " + cnt);
    }
    
    public void tinhLuongGiangVienTheoMaGV(){
        System.out.print("Nhap ma giang vien can tinh luong: ");
        String maGV = sc.nextLine();
        for (GiangVien gv : danhSachGiangVien) {
            if(gv.getMaGV().equals(maGV)){
                System.out.println("Luong cua giang vien " + gv.getTenGV() + " la: " + (int)gv.tinhLuong());
                return;
            }
        }
        System.out.println("Khong tim thay giang vien");
    }
    
    public void sapXepGiangVien(){
        Menu3();
        int chon = sc.nextInt(); sc.nextLine();
        if (chon == 1){
            Collections.sort(danhSachGiangVien, (GiangVien a, GiangVien b)->{
                return a.getMaGV().compareTo(b.getMaGV());
            });
        }
        else{
            Collections.sort(danhSachGiangVien, (GiangVien a, GiangVien b)->{
                if (a.getHeSoLuong()>=b.getHeSoLuong()) return 1;
                else return -1;
            });
        }
    }
    
    public void runProgram(){
        int pick = 0, stop = 0;
        while (stop == 0){
            Menu4();
            pick = sc.nextInt(); sc.nextLine();
            switch (pick) {
                case 1:
                    nhapGiangVien();
                    break;
                case 2:
                    xuatGiangVien();
                    break;
                case 3 :
                    xoaGiangVien();
                    break;
                case 4:
                    xuatGiangVienCoHuu();
                    break;
                case 5:
                    xuatGiangVienThinhGiang();
                    break;
                case 6:
                    tinhLuongGiangVienTheoMaGV();
                    break;
                case 7 :
                    sapXepGiangVien();
                    break;
                case 8 :
                    stop = 1;
                default:
                    System.out.println("Nhap sai...");
            }
        }
    }
}
