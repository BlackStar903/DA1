package model;

public class DeGiay {

    private Integer ID;
    private String MaDeGiay;
    private String TenDeGiay;
    private Integer TrangThai; // 0 CÒN DÙNG , 1 KHÔNG DÙNG

    public DeGiay() {
    }

    public DeGiay(Integer ID, String MaDeGiay, String TenDeGiay, Integer TrangThai) {
        this.ID = ID;
        this.MaDeGiay = MaDeGiay;
        this.TenDeGiay = TenDeGiay;
        this.TrangThai = TrangThai;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMaDeGiay() {
        return MaDeGiay;
    }

    public void setMaDeGiay(String MaDeGiay) {
        this.MaDeGiay = MaDeGiay;
    }

    public String getTenDeGiay() {
        return TenDeGiay;
    }

    public void setTenDeGiay(String TenDeGiay) {
        this.TenDeGiay = TenDeGiay;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

}
