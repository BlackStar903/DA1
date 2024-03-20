package controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChatLieu;
import model.DeGiay;
import model.Mau;
import model.SanPham;
import model.Size;
import model.ThuongHieu;

public class QLThuocTinhSP {

    List<SanPham> listFullThuocTinh = new ArrayList<>();
    List<DeGiay> listDeGiay = new ArrayList<>();
    List<Size> listSize = new ArrayList<>();
    List<Mau> listMau = new ArrayList<>();
    List<ChatLieu> listCl = new ArrayList<>();
    List<ThuongHieu> listTH = new ArrayList<>();

    public List<SanPham> fullDBThuocTinh() {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnect();
            String sqlFullDb = "select dg.MaDeGiay,dg.TenDeGiay,dg.TrangThai,th.MaThuongHieu,th.TenThuongHieu,th.TrangThai"
                    + ",cl.MaChatLieu,cl.TenChatLieu,cl.TrangThai,m.MaMau,m.TenMau,m.TrangThai,s.MaSize,s.TenSize,s.TrangThai"
                    + " from sanpham sp join degiay dg on sp.iddegiay = dg.id join thuonghieu th on th.id = sp.idthuonghieu "
                    + "join chatlieu cl on cl.id = sp.idchatlieu join mau m on m.id = sp.idmau join size s on s.id=sp.idsize";
            ps = con.prepareStatement(sqlFullDb);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listFullThuocTinh.add(new SanPham(rs.getString("MaDeGiay"), rs.getString("TenDeGiay"), rs.getInt("TrangThai"),
                        rs.getString("MaThuongHieu"), rs.getString("TenThuongHieu"), rs.getInt("TrangThai"),
                        rs.getString("MaChatLieu"), rs.getString("TenChatLieu"), rs.getInt("TrangThai"),
                        rs.getString("MaMau"), rs.getString("TenMau"), rs.getInt("TrangThai"),
                        rs.getString("MaSize"), rs.getString("TenSize"), rs.getInt("TrangThai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listFullThuocTinh;
    }

    public List<DeGiay> fullDG() {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnect();
            String sqlFullDb = "select * from degiay dg";
            ps = con.prepareStatement(sqlFullDb);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listDeGiay.add(new DeGiay(rs.getString("MaDeGiay"), rs.getString("TenDeGiay"), rs.getInt("TrangThai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listDeGiay;
    }

    public List<Size> fullSize() {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnect();
            String sqlFullDb = "select * from Size";
            ps = con.prepareStatement(sqlFullDb);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listSize.add(new Size(rs.getString("MaSize"), rs.getString("TenSize"), rs.getInt("TrangThai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listSize;
    }

    public List<Mau> fullMau() {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnect();
            String sqlFullDb = "select * from Mau";
            ps = con.prepareStatement(sqlFullDb);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listMau.add(new Mau(rs.getString("MaMau"), rs.getString("TenMau"), rs.getInt("TrangThai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listMau;
    }

    public List<ChatLieu> fullCl() {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnect();
            String sqlFullDb = "select * from ChatLieu";
            ps = con.prepareStatement(sqlFullDb);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listCl.add(new ChatLieu(rs.getString("MaChatLieu"), rs.getString("TenChatLieu"), rs.getInt("TrangThai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listCl;
    }

    public List<ThuongHieu> fullTH() {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnect();
            String sqlFullDb = "select * from ThuongHieu";
            ps = con.prepareStatement(sqlFullDb);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listTH.add(new ThuongHieu(rs.getString("MaThuongHieu"), rs.getString("TenThuongHieu"), rs.getInt("TrangThai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listTH;
    }

    public List<DeGiay> themDeGiay(DeGiay d) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            for (DeGiay dg : listDeGiay) {
                if (dg.getMaDeGiay().equalsIgnoreCase(d.getMaDeGiay())) {
                    return null;
                }
            }
            con = DBConnection.getConnect();
            String sqlInsertDG = "insert into DeGiay(MaDeGiay,TenDeGiay,TrangThai) values(?,?,?)";
            ps.setString(1, d.getMaDeGiay());
            ps.setString(2, d.getTenDeGiay());
            ps.setInt(3, d.getTrangThai());
            int inserted = ps.executeUpdate();
            if (inserted > 0) {
                listDeGiay.add(new DeGiay(d.getMaDeGiay(), d.getTenDeGiay(), d.getTrangThai()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLThuocTinhSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listDeGiay;
    }

}
