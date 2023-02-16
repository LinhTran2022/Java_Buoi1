package quanlybanhang;

import java.util.*;
import java.io.*;

public class MatHang {
    public static int stt_matHang = 0;
    private String maHang;
    private String tenHang;
    private String nhomHang;
    private double giaBan;

    public MatHang(){ 
    }
    
    public MatHang(String tenHang, String nhomHang, double giaBan) {
        stt_matHang++;
        maHang = String.format("%04d",stt_matHang);
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setNhomHang(String nhomHang) {
        this.nhomHang = nhomHang;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public void nhap() throws IOException{
        Scanner nhap = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        this.tenHang = nhap.nextLine();
        System.out.print("Nhom hang (1. Thoi trang \t2. Tieu dung \t3. Dien may \t4. Gia dung): ");
        int c = Integer.parseInt(nhap.nextLine());
        switch(c){
            case 1: {
                this.nhomHang = "Hang thoi trang";
                break;
            }
            case 2: {
                this.nhomHang = "Hang tieu dung";
                break;
            }
            case 3: {
                this.nhomHang = "Hang dien may";
                break;
            }
            case 4: {
                this.nhomHang = "Hang gia dung";
                break;
            }
        }
        System.out.print("Gia san pham: ");
        this.giaBan = Double.parseDouble(nhap.nextLine());
        
        try {
            FileWriter w = new FileWriter("MH.txt");
            w.write(this.toString());
            w.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Success...");
        
    }
    @Override
    public String toString() {
        return "Mat hang {" +
                "ma hang =" + maHang +
                ", ten hang ='" + tenHang + '\'' +
                ", nhom hang='" + nhomHang + '\'' +
                ", gia ban =" + giaBan +
                '}';
    }
}
