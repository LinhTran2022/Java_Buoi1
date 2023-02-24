package models;

public class Phong {
    private static int sttP = 0;
    private String maP;
    private String tenP;
    private String loaiP;
    
    public Phong(){}

    public Phong(String tenP, String loaiP) {
        sttP++;
        this.maP = String.format("%03d",sttP);
        this.tenP = tenP;
        this.loaiP = loaiP;
    }

    public static int getSttP() {
        return sttP;
    }

    public String getMaP() {
        return maP;
    }

    public String getTenP() {
        return tenP;
    }

    public String getLoaiP() {
        return loaiP;
    }

    public static void setSttP(int sttP) {
        Phong.sttP = sttP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public void setTenP(String tenP) {
        this.tenP = tenP;
    }

    public void setLoaiP(String loaiP) {
        this.loaiP = loaiP;
    }
    
    @Override
    public String toString(){
        return "Ma phong : P" + maP + "\t"
                            + "Ten phong : " + tenP + "\t"
                            + "Loai phong : " + loaiP + "\t";
    }
    
}
