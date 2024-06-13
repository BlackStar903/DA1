/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Dao.HoadonchitietDAO;
import dao1.BanDao;
import dao1.ChiTietGiamGiaDao;
import dao1.DaoGiamGia;
import dao1.DonViSanPhamDao;
import dao1.HoaDonDAO;
import dao1.SanPhamDao;
import model.DonViSanPham;
import model.GiamGiaChiTiet;
import model.HoaDonChiTiet;
import model.SanPham;
import model.GiamGia;
import model.Hoadon;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class NhapsoluongSanPhamJDialog extends javax.swing.JDialog {

    /**
     * Creates new form NhapsoluongSanPhamJDialog
     */
    static String MASP;
    static int MAHOADON;
    DonViSanPhamDao daodv = new DonViSanPhamDao();
    List<DonViSanPham> listdv;
    DaoGiamGia DAOGG = new DaoGiamGia();
    ChiTietGiamGiaDao DAOGGCT = new ChiTietGiamGiaDao();
    SanPhamDao DAOSP = new SanPhamDao();
    DonViSanPhamDao DAODVSP = new DonViSanPhamDao();
    BanDao DAOBAN = new BanDao();
    HoaDonDAO hdd = new HoaDonDAO();
    HoadonchitietDAO HDCT = new HoadonchitietDAO();
    public NhapsoluongSanPhamJDialog(java.awt.Frame parent, boolean modal,String masp, int MAHD) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        MASP = masp;
        MAHOADON = MAHD;
        fillcomboDonVi();
        Hoadon hd = hdd.selectById(MAHD);
        int idBan = DAOBAN.selectIDHD(hd.getIdHoaDon()).getIdBan();
        List<HoaDonChiTiet> hdct = HDCT.selectByIDBan(idBan);
        
       for(HoaDonChiTiet x : hdct){
           x.getSoluong();
           txtSoluong.setText(x.getSoluong()+"");
       }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSoluong = new javax.swing.JTextField();
        btnNhap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtghiChu = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboDonvi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(250, 182, 124));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(243, 170, 49)));

        txtSoluong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnNhap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNhap.setText("Nhập");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 182, 124));
        jLabel1.setText("Nhập số lượng sản phẩm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ghi chú:");

        txtghiChu.setColumns(20);
        txtghiChu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtghiChu.setLineWrap(true);
        txtghiChu.setRows(5);
        jScrollPane1.setViewportView(txtghiChu);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Size");

        cboDonvi.setBackground(new java.awt.Color(225, 193, 144));
        cboDonvi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboDonvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDonviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSoluong, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cboDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    HoadonchitietDAO DAOHDCT = new HoadonchitietDAO();
    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        // TODO add your handling code here:
        if (checknumber()) {
            return;
        }
        if (txtSoluong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập sô lượng!");
            return;
        }
        HoaDonChiTiet hdct = new HoaDonChiTiet();
        hdct.setID_Hoadon(MAHOADON);
        hdct.setID_SanPHam(MASP);
        hdct.setSoluong(Integer.parseInt(txtSoluong.getText()));
        txtSoluong.setText(hdct.getSoluong() + "");
        SanPham sp = DAOSP.selectID(MASP);       
        sp.setId_donviSP(daodv.selectByName(cboDonvi.getSelectedItem() + ""));
        hdct.setID_DonviSP(sp.getId_donviSP());
        int gia = GiaTheoSize(MASP);
        hdct.setGia(gia);
        int tongGia = gia * hdct.getSoluong();
        hdct.setTongGia(tongGia);
        hdct.setTrangThai(true);
        hdct.setLyDoHuy("");
        hdct.setGhiChu(txtghiChu.getText());
        DAOHDCT.insert(hdct);
        this.dispose();
    }//GEN-LAST:event_btnNhapActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cboDonviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDonviActionPerformed
//        // TODO add your handling code here:
      
    }//GEN-LAST:event_cboDonviActionPerformed
    public boolean checknumber(){
        try {
            int i = Integer.parseInt(txtSoluong.getText());
            if (i < 0 || i == 0) {
                JOptionPane.showMessageDialog(this, "số lượng ít nhất bằng 1 và số lượng không âm");
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "không phải là số! \nVui long nhập lại!!!");
            return true;
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhapsoluongSanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapsoluongSanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapsoluongSanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapsoluongSanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhapsoluongSanPhamJDialog dialog = new NhapsoluongSanPhamJDialog(new javax.swing.JFrame(), true, MASP, MAHOADON);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhap;
    private javax.swing.JComboBox<String> cboDonvi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextArea txtghiChu;
    // End of variables declaration//GEN-END:variables
    
    public int GiaTheoSize(String masp){
//          DaoGiamGia DAOGG = new DaoGiamGia();
//            ChiTietGiamGiaDao DAOGGCT = new ChiTietGiamGiaDao();
//            SanPhamDao DAOSP = new SanPhamDao();
//            DonViSanPhamDao DAODVSP = new DonViSanPhamDao();
        GiamGiaChiTiet ggct = DAOGGCT.selectbyIDSP(masp);
        SanPham sp = new SanPham();
        DonViSanPham dvdu = new DonViSanPham();
        sp = DAOSP.selectID(masp);
        dvdu = DAODVSP.selectID(sp.getId_donviSP());
        int gia = sp.getGia_sp();
       System.out.println(dvdu.getThemTien());
          if(ggct == null){
               gia = sp.getGia_sp() + dvdu.getThemTien();
          }else{
              gia = SanPhamGiamGia(masp, gia) + dvdu.getThemTien();
          }
          sp.setGia_sp(gia);
          return gia;
    }
    
public int SanPhamGiamGia(String masp, int gia){
    GiamGiaChiTiet ggct = DAOGGCT.selectbyIDSP(masp);
    if (ggct == null) {
        return 0;
    }
    GiamGia gg = DAOGG.selectByIdss(ggct.getidgiamgia());
    if (gg == null) {
        return 0;
    }
    try {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date datereal = new Date();
        String dareal = formatter.format(datereal);
        Date datenow = formatter.parse(dareal);
        Date datekt = gg.getNgayKT();
        Date datebd = gg.getNgayBD();
        if ((datenow.before(datekt) && datenow.after(datebd)) || datenow.equals(datekt) || datenow.equals(datebd)) {
            float tiengiam =(float) gia - (((float)ggct.getPhantramgiam()/100) * gia);
            //System.out.println((float) gia - ((float) ggct.getPhantramgiam()/100) * gia);
            int tiengiamint = (int) tiengiam;
           // System.out.println(tiengiamint);
            String a = tiengiamint+"";
            //System.out.println(a.length());
            if (a.length() == 4) {
                int soThu1 = Integer.parseInt(a.charAt(1)+"");
                if (soThu1 < 5) {
                    //System.out.println("heelo");
                    a = a.substring(0,1);
                    //System.out.println(a);
                    return Integer.parseInt(a+"000");
                }
                else{
                    a = a.substring(0,1);
                    tiengiamint = Integer.parseInt(a+"000");
                    return (int) tiengiamint + 1000;
                }
            }else{
                System.out.println("heelosssss");
                int soThu2 = Integer.parseInt(a.charAt(2)+"");
                if (soThu2 < 5) {
                    a = a.substring(0,2);;
                    return Integer.parseInt(a+"000");
                }else{
                    a = a.substring(0,2);
                    tiengiamint = Integer.parseInt(a+"000");
                    return (int) tiengiamint + 1000;
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return 0;
}
    

    private void fillcomboDonVi() {
        DefaultComboBoxModel modelDV = (DefaultComboBoxModel) cboDonvi.getModel();
        modelDV.removeAllElements();
        listdv = daodv.selectAll();
        for (DonViSanPham donviDoUong : listdv) {
            modelDV.addElement(donviDoUong.toString());
        }
    }
}
