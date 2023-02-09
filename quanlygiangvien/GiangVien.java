package quanlygiangvien;

public class GiangVien {
    protected String maGV;
    protected String tenGV;
    protected String email;
    protected String hocHam;
    protected String hocVi;
    protected String diaChi;
    protected String sdt;
    protected int soGioLamViec;
    protected float heSoLuong;
    
    public GiangVien() {};

    public GiangVien(String maGV, String tenGV, String email, String hocHam, String hocVi, String diaChi, String sdt, int soGioLamViec, float heSoLuong) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.email = email;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.soGioLamViec = soGioLamViec;
        this.heSoLuong = heSoLuong;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getEmail() {
        return email;
    }

    public String getHocHam() {
        return hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }
    
    public float tinhLuong() {
        return 0.0f;
    }
}
