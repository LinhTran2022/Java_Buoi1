package models;

public class KhachHang {
    private static int sttKH = 0;
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String sdt;
    private String loaiKH;
    
    //constructor
    public KhachHang(){}

    public KhachHang(String tenKH, String diaChi, String sdt, String loaiKH) {
        sttKH++;
        this.maKH = String.format("%05d",sttKH);
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.loaiKH = loaiKH;
    }
    // set

    public static void setSttKH(int sttKH) {
        KhachHang.sttKH = sttKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }
    // get

    public static int getSttKH() {
        return sttKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public String getLoaiKH() {
        return loaiKH;
    }
    
    @Override
    public String toString(){
        return "Ma khach hang : KH" + maKH + "\t"
                            + "Ten khach hang : " + tenKH + "\t"
                            + "Dia chi : " + diaChi + "\t"
                            + "SDT : " + sdt + "\t"
                            + "Loai khach hang : " + loaiKH + "\t";
    }
}
