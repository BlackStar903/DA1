package model;

public class ThuongHieu {

    private Integer ID;
    private String MaThuongHieu, TenThuongHieu;
    private Integer trangThai; // 0 ĐANG HỢP TÁC , 1 NGỪNG HỢP TÁC

    public ThuongHieu() {
    }

    public ThuongHieu( String MaThuongHieu, String TenThuongHieu, Integer trangThai) {
        this.MaThuongHieu = MaThuongHieu;
        this.TenThuongHieu = TenThuongHieu;
        this.trangThai = trangThai;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMaThuongHieu() {
        return MaThuongHieu;
    }

    public void setMaThuongHieu(String MaThuongHieu) {
        this.MaThuongHieu = MaThuongHieu;
    }

    public String getTenThuongHieu() {
        return TenThuongHieu;
    }

    public void setTenThuongHieu(String TenThuongHieu) {
        this.TenThuongHieu = TenThuongHieu;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

}
