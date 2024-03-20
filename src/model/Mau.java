package model;

public class Mau {

    private Integer ID;
    private String MaMau, TenMau;
    private Integer TrangThai; //0 ĐANG HỢP TÁC , 1 NGỪNG HỢP TÁC

    public Mau() {
    }

    public Mau(Integer ID, String MaMau, String TenMau, Integer TrangThai) {
        this.ID = ID;
        this.MaMau = MaMau;
        this.TenMau = TenMau;
        this.TrangThai = TrangThai;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMaMau() {
        return MaMau;
    }

    public void setMaMau(String MaMau) {
        this.MaMau = MaMau;
    }

    public String getTenMau() {
        return TenMau;
    }

    public void setTenMau(String TenMau) {
        this.TenMau = TenMau;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

}
