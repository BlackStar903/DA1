package model;

public class ChatLieu {

    private Integer ID;
    private String MaChatLieu;
    private String TenChatLieu;
    private Integer TrangThai; // 0 CÒN DÙNG , 1 KHÔNG DÙNG

    public ChatLieu() {
    }

    public ChatLieu( String MaChatLieu, String TenChatLieu, Integer TrangThai) {
        this.MaChatLieu = MaChatLieu;
        this.TenChatLieu = TenChatLieu;
        this.TrangThai = TrangThai;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMaChatLieu() {
        return MaChatLieu;
    }

    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    public String getTenChatLieu() {
        return TenChatLieu;
    }

    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

}
