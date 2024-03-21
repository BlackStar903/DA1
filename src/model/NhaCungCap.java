package model;

public class NhaCungCap {
    private String maNcc,tenNCC;
    private int trangThai;

    public NhaCungCap() {
    }

    public NhaCungCap(String maNcc, String tenNCC, int trangThai) {
        this.maNcc = maNcc;
        this.tenNCC = tenNCC;
        this.trangThai = trangThai;
    }

    public String getMaNcc() {
        return maNcc;
    }

    public void setMaNcc(String maNcc) {
        this.maNcc = maNcc;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
