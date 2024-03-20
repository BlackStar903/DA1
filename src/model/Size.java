package model;

public class Size {

    private Integer ID;
    private String MaSize;
    private String TenSize;
    private Integer TrangThai; // 0 CÒN DÙNG , 1 KHÔNG DÙNG

    public Size() {
    }

    public Size( String MaSize, String TenSize, Integer TrangThai) {
        this.MaSize = MaSize;
        this.TenSize = TenSize;
        this.TrangThai = TrangThai;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMaSize() {
        return MaSize;
    }

    public void setMaSize(String MaSize) {
        this.MaSize = MaSize;
    }

    public String getTenSize() {
        return TenSize;
    }

    public void setTenSize(String TenSize) {
        this.TenSize = TenSize;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

}
