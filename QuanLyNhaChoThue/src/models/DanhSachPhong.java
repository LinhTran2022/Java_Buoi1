package models;

public class DanhSachPhong {
    private String maKH;
    private String tenKH;
    private String maP;
    private String batDauThue;
   
    public DanhSachPhong(){}

    public DanhSachPhong(String maKH, String tenKH, String maP, String batDauThue) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maP = maP;
        this.batDauThue = batDauThue;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getMaP() {
        return maP;
    }

    public String getBatDauThue() {
        return batDauThue;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public void setBatDauThue(String batDauThue) {
        this.batDauThue = batDauThue;
    }
    
    
}
