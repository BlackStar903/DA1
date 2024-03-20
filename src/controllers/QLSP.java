package controllers;

import java.util.ArrayList;
import java.util.List;
import model.SanPham;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QLSP {

    List<SanPham> listSP = new ArrayList<>();

    public List<SanPham> getListSP() {
        return listSP;
    }

    public List<SanPham> fullDbSP() {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnect();
            String sqlSelect = "Select * from sanpham";
            ps = con.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
//                listSP.add(new SanPham(rs.getInt("SoLuongTon"), rs.getString("TenSP")
//                        , rs.getDouble("GiaNiemYet"), rs.getDouble("GiaBan"), rs.getString("MoTa")
//                        , rs.getString("NgayTao"), rs.getInt("TrangThai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listSP;
    }
}
