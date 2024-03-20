package model;

public class SanPham {
    private Integer ID,IdSP,IdThuongHieu,IdMau,IdSize,IdDeGiay,IdChatLieu,SoLuongTon;
    private Double GiaNiemYet,GiaBan;
    private String MoTa,NgayTao;     
    private Integer trangThai; //-- 0 CÒN HÀNG , 1 TẠM HẾT , 2 DỪNG BÁN

    public SanPham() {
    }

    public SanPham(Integer ID, Integer IdSP, Integer IdThuongHieu, Integer IdMau, Integer IdSize, Integer IdDeGiay, Integer IdChatLieu, Integer SoLuongTon, Double GiaNiemYet, Double GiaBan, String MoTa, String NgayTao, Integer trangThai) {
        this.ID = ID;
        this.IdSP = IdSP;
        this.IdThuongHieu = IdThuongHieu;
        this.IdMau = IdMau;
        this.IdSize = IdSize;
        this.IdDeGiay = IdDeGiay;
        this.IdChatLieu = IdChatLieu;
        this.SoLuongTon = SoLuongTon;
        this.GiaNiemYet = GiaNiemYet;
        this.GiaBan = GiaBan;
        this.MoTa = MoTa;
        this.NgayTao = NgayTao;
        this.trangThai = trangThai;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getIdSP() {
        return IdSP;
    }

    public void setIdSP(Integer IdSP) {
        this.IdSP = IdSP;
    }

    public Integer getIdThuongHieu() {
        return IdThuongHieu;
    }

    public void setIdThuongHieu(Integer IdThuongHieu) {
        this.IdThuongHieu = IdThuongHieu;
    }

    public Integer getIdMau() {
        return IdMau;
    }

    public void setIdMau(Integer IdMau) {
        this.IdMau = IdMau;
    }

    public Integer getIdSize() {
        return IdSize;
    }

    public void setIdSize(Integer IdSize) {
        this.IdSize = IdSize;
    }

    public Integer getIdDeGiay() {
        return IdDeGiay;
    }

    public void setIdDeGiay(Integer IdDeGiay) {
        this.IdDeGiay = IdDeGiay;
    }

    public Integer getIdChatLieu() {
        return IdChatLieu;
    }

    public void setIdChatLieu(Integer IdChatLieu) {
        this.IdChatLieu = IdChatLieu;
    }

    public Integer getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(Integer SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public Double getGiaNiemYet() {
        return GiaNiemYet;
    }

    public void setGiaNiemYet(Double GiaNiemYet) {
        this.GiaNiemYet = GiaNiemYet;
    }

    public Double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
    
}
