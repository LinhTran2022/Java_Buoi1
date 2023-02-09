package quanlygiangvien;

public class GiangVienThinhGiang extends GiangVien{
    private String diaChiCoQuan;
    private String sdtCoQuan;
    
    public GiangVienThinhGiang(){}

    public GiangVienThinhGiang(String diaChiCoQuan, String sdtCoQuan, String maGV, String tenGV, String email, String hocHam, String hocVi, String diaChi, String sdt, int soGioLamViec, float heSoLuong) {
        super(maGV, tenGV, email, hocHam, hocVi, diaChi, sdt, soGioLamViec, heSoLuong);
        this.diaChiCoQuan = diaChiCoQuan;
        this.sdtCoQuan = sdtCoQuan;
    }

    public String getDiaChiCoQuan() {
        return diaChiCoQuan;
    }

    public String getSdtCoQuan() {
        return sdtCoQuan;
    }

    public void setDiaChiCoQuan(String diaChiCoQuan) {
        this.diaChiCoQuan = diaChiCoQuan;
    }

    public void setSdtCoQuan(String sdtCoQuan) {
        this.sdtCoQuan = sdtCoQuan;
    }
    
    @Override
    public float tinhLuong() {
        return super.getSoGioLamViec() * 200000 * super.getHeSoLuong();
    }

    @Override
    public String toString() {
        return "GiangVienThinhGiang{" + "MaGV=" + getMaGV() + ", TenGV=" + getTenGV() + ", Email=" + getEmail() + ", HocHam=" + getHocHam() + ", HocVi=" + getHocVi() + ", DiaChi=" + getDiaChi() + ", SDT=" + getSdt() + ", SoGioLamViec=" + getSoGioLamViec() + ", HeSoLuong=" + getHeSoLuong() + ", DiaChiCoQuan=" + diaChiCoQuan + ", SDTCoQuan=" + sdtCoQuan + '}';
    }

}
