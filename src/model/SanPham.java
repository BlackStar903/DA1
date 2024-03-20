package model;

public class SanPham {

    //Degiay
    private Integer idDeGiay;
    private String maDG, tenDG;
    private Integer trangThaiDG; //-- 0 CÒN HÀNG , 1 TẠM HẾT , 2 DỪNG BÁN

    //ThuongHieu
    private Integer idThuongHieu;
    private String maTH, tenTH;
    private Integer trangThaiTH; //-- 0 CÒN HÀNG , 1 TẠM HẾT , 2 DỪNG BÁN

    //ChatLieu
    private Integer idChatLieu;
    private String maCL, tenCL;
    private Integer trangThaiCL; //-- 0 CÒN HÀNG , 1 TẠM HẾT , 2 DỪNG BÁN

    //Mau
    private Integer idMau;
    private String maMau, tenMau;
    private Integer trangThaiMau; //-- 0 CÒN HÀNG , 1 TẠM HẾT , 2 DỪNG BÁN

    //Size
    private Integer idSize;
    private String maSize, tenSize;
    private Integer trangThaiSize; //-- 0 CÒN HÀNG , 1 TẠM HẾT , 2 DỪNG BÁN

    //SanPham
    private Integer id, idSP, soLuongTon;
    private String tenSp;
    private Double giaNiemYet, giaBan;
    private String moTa, ngayTao;
    private Integer trangThai; //-- 0 CÒN HÀNG , 1 TẠM HẾT , 2 DỪNG BÁN

    //thuoctinh
    private String ma, loai, chiTiet;

    public SanPham(Integer trangThai, String ma, String loai, String chiTiet) {
        this.trangThai = trangThai;
        this.ma = ma;
        this.loai = loai;
        this.chiTiet = chiTiet;
    }

    public SanPham() {
    }

    public SanPham(String maDG, String tenDG, Integer trangThaiDG, String maTH, String tenTH, Integer trangThaiTH, String maCL, String tenCL, Integer trangThaiCL, String maMau, String tenMau, Integer trangThaiMau, String maSize, String tenSize, Integer trangThaiSize) {
        this.maDG = maDG;
        this.tenDG = tenDG;
        this.trangThaiDG = trangThaiDG;
        this.maTH = maTH;
        this.tenTH = tenTH;
        this.trangThaiTH = trangThaiTH;
        this.maCL = maCL;
        this.tenCL = tenCL;
        this.trangThaiCL = trangThaiCL;
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.trangThaiMau = trangThaiMau;
        this.maSize = maSize;
        this.tenSize = tenSize;
        this.trangThaiSize = trangThaiSize;
    }

    public SanPham(Integer idDeGiay, String maDG, String tenDG, Integer idThuongHieu, String maTH, String tenTH, Integer idChatLieu, String maCL, String tenCL, Integer idMau, String maMau, String tenMau, Integer idSize, String maSize, String tenSize, Integer id, Integer idSP, Integer soLuongTon, String tenSp, Double giaNiemYet, Double giaBan, String moTa, String ngayTao, Integer trangThai) {
        this.idDeGiay = idDeGiay;
        this.maDG = maDG;
        this.tenDG = tenDG;
        this.idThuongHieu = idThuongHieu;
        this.maTH = maTH;
        this.tenTH = tenTH;
        this.idChatLieu = idChatLieu;
        this.maCL = maCL;
        this.tenCL = tenCL;
        this.idMau = idMau;
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.idSize = idSize;
        this.maSize = maSize;
        this.tenSize = tenSize;
        this.id = id;
        this.idSP = idSP;
        this.soLuongTon = soLuongTon;
        this.tenSp = tenSp;
        this.giaNiemYet = giaNiemYet;
        this.giaBan = giaBan;
        this.moTa = moTa;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public Integer getIdDeGiay() {
        return idDeGiay;
    }

    public void setIdDeGiay(Integer idDeGiay) {
        this.idDeGiay = idDeGiay;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getTenDG() {
        return tenDG;
    }

    public void setTenDG(String tenDG) {
        this.tenDG = tenDG;
    }

    public Integer getIdThuongHieu() {
        return idThuongHieu;
    }

    public void setIdThuongHieu(Integer idThuongHieu) {
        this.idThuongHieu = idThuongHieu;
    }

    public String getMaTH() {
        return maTH;
    }

    public void setMaTH(String maTH) {
        this.maTH = maTH;
    }

    public String getTenTH() {
        return tenTH;
    }

    public void setTenTH(String tenTH) {
        this.tenTH = tenTH;
    }

    public Integer getIdChatLieu() {
        return idChatLieu;
    }

    public void setIdChatLieu(Integer idChatLieu) {
        this.idChatLieu = idChatLieu;
    }

    public String getMaCL() {
        return maCL;
    }

    public void setMaCL(String maCL) {
        this.maCL = maCL;
    }

    public String getTenCL() {
        return tenCL;
    }

    public void setTenCL(String tenCL) {
        this.tenCL = tenCL;
    }

    public Integer getIdMau() {
        return idMau;
    }

    public void setIdMau(Integer idMau) {
        this.idMau = idMau;
    }

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public Integer getIdSize() {
        return idSize;
    }

    public void setIdSize(Integer idSize) {
        this.idSize = idSize;
    }

    public String getMaSize() {
        return maSize;
    }

    public void setMaSize(String maSize) {
        this.maSize = maSize;
    }

    public String getTenSize() {
        return tenSize;
    }

    public void setTenSize(String tenSize) {
        this.tenSize = tenSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSP() {
        return idSP;
    }

    public void setIdSP(Integer idSP) {
        this.idSP = idSP;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Double getGiaNiemYet() {
        return giaNiemYet;
    }

    public void setGiaNiemYet(Double giaNiemYet) {
        this.giaNiemYet = giaNiemYet;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getTrangThaiDG() {
        return trangThaiDG;
    }

    public void setTrangThaiDG(Integer trangThaiDG) {
        this.trangThaiDG = trangThaiDG;
    }

    public Integer getTrangThaiTH() {
        return trangThaiTH;
    }

    public void setTrangThaiTH(Integer trangThaiTH) {
        this.trangThaiTH = trangThaiTH;
    }

    public Integer getTrangThaiCL() {
        return trangThaiCL;
    }

    public void setTrangThaiCL(Integer trangThaiCL) {
        this.trangThaiCL = trangThaiCL;
    }

    public Integer getTrangThaiMau() {
        return trangThaiMau;
    }

    public void setTrangThaiMau(Integer trangThaiMau) {
        this.trangThaiMau = trangThaiMau;
    }

    public Integer getTrangThaiSize() {
        return trangThaiSize;
    }

    public void setTrangThaiSize(Integer trangThaiSize) {
        this.trangThaiSize = trangThaiSize;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

}
