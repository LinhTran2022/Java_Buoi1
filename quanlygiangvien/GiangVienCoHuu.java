package quanlygiangvien;

public class GiangVienCoHuu extends GiangVien{
    private float luongCung;
    private int soGioQuyDinh;
    
    public GiangVienCoHuu() {}

    public GiangVienCoHuu(float luongCung, int soGioQuyDinh, String maGV, String tenGV, String email, String hocHam, String hocVi, String diaChi, String sdt, int soGioLamViec, float heSoLuong) {
        super(maGV, tenGV, email, hocHam, hocVi, diaChi, sdt, soGioLamViec, heSoLuong);
        this.luongCung = luongCung;
        this.soGioQuyDinh = soGioQuyDinh;
    }

    public float getLuongCung() {
        return luongCung;
    }

    public int getSoGioQuyDinh() {
        return soGioQuyDinh;
    }

    public void setLuongCung(float luongCung) {
        this.luongCung = luongCung;
    }

    public void setSoGioQuyDinh(int soGioQuyDinh) {
        this.soGioQuyDinh = soGioQuyDinh;
    }
    
    @Override
    public float tinhLuong() {
        return (luongCung + (super.getSoGioLamViec() - soGioQuyDinh) * 50000) * super.getHeSoLuong();
    }

    @Override
    public String toString() {
        return "GiangVienCoHuu{" + "MaGV=" + getMaGV() + ", TenGV=" + getTenGV() + ", Email=" + getEmail() + ", HocHam=" + getHocHam() + ", HocVi=" + getHocVi() + ", DiaChi=" + getDiaChi() + ", SDT=" + getSdt() + ", LuongCung=" + (int)luongCung + ", SoGioQuyDinh=" + soGioQuyDinh + '}';
    }
}
