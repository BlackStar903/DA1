package views;

import controllers.QLThuocTinhSP;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import model.ChatLieu;
import model.DeGiay;
import model.Mau;
import model.NhaCungCap;
import model.SanPham;
import model.Size;
import model.ThuongHieu;

public class ThuocTinhSanPham_View extends javax.swing.JFrame {

    DefaultTableModel dtm;
    QLThuocTinhSP qltt = new QLThuocTinhSP();
    List<SanPham> listSp = qltt.fullDBThuocTinh();
    List<DeGiay> listDG = qltt.fullDG();
    List<Size> listSize = qltt.fullSize();
    List<Mau> listMau = qltt.fullMau();
    List<ThuongHieu> listTH = qltt.fullTH();
    List<ChatLieu> listCL = qltt.fullCl();
    List<NhaCungCap> listNCC = qltt.fullNCC();

    public ThuocTinhSanPham_View() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBanHang = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnVoucher = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cboTimKiem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        rdoConSD = new javax.swing.JRadioButton();
        rdoNgungSD = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtLoai = new javax.swing.JTextField();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        btnBanHang.setBackground(new java.awt.Color(255, 255, 204));
        btnBanHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBanHang.setText("Bán Hàng");
        btnBanHang.setAlignmentY(0.0F);

        btnSanPham.setBackground(new java.awt.Color(255, 255, 204));
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSanPham.setText("SẢN PHẨM");
        btnSanPham.setAlignmentY(0.0F);

        btnHoaDon.setBackground(new java.awt.Color(255, 255, 204));
        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHoaDon.setText("HÓA ĐƠN");
        btnHoaDon.setAlignmentY(0.0F);

        btnNhanVien.setBackground(new java.awt.Color(255, 255, 204));
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhanVien.setText("NHÂN VIÊN");
        btnNhanVien.setAlignmentY(0.0F);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnVoucher.setBackground(new java.awt.Color(255, 255, 204));
        btnVoucher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVoucher.setText("VOURCHER ");
        btnVoucher.setAlignmentY(0.0F);

        btnKhachHang.setBackground(new java.awt.Color(255, 255, 204));
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKhachHang.setText("KHÁCH Hàng");
        btnKhachHang.setAlignmentY(0.0F);

        btnThongKe.setBackground(new java.awt.Color(255, 255, 204));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setAlignmentY(0.0F);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Họ , Tên : ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Chức Vụ :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        btnThoat.setBackground(new java.awt.Color(255, 255, 51));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.setAlignmentY(0.0F);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBanHang)
                .addGap(18, 18, 18)
                .addComponent(btnSanPham)
                .addGap(18, 18, 18)
                .addComponent(btnHoaDon)
                .addGap(18, 18, 18)
                .addComponent(btnNhanVien)
                .addGap(18, 18, 18)
                .addComponent(btnVoucher)
                .addGap(17, 17, 17)
                .addComponent(btnKhachHang)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Loại");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel5.setText("Tìm kiếm");

        cboTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size", "Màu", "Đế giày", "Chất liệu", "Thương hiệu", "Nhà cung cấp" }));
        cboTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTimKiemActionPerformed(evt);
            }
        });

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã", "Loại", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInfo);

        jLabel6.setText("Trạng thái");

        buttonGroup1.add(rdoConSD);
        rdoConSD.setText("Còn hàng");

        buttonGroup1.add(rdoNgungSD);
        rdoNgungSD.setText("Hết hàng");

        jLabel7.setText("Mã");

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(cboTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnTimKiem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdoConSD, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNgungSD))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(73, 73, 73)
                                .addComponent(btnSua)
                                .addGap(71, 71, 71)
                                .addComponent(btnXoa))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdoConSD)
                            .addComponent(rdoNgungSD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSua)
                                .addComponent(btnThem))
                            .addComponent(btnXoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadTableDG(List<DeGiay> list) {
        dtm = (DefaultTableModel) tblInfo.getModel();
        dtm.setColumnCount(0);
        String[] colums = {"Mã", "Loại", "Trạng thái"};
        for (String c : colums) {
            dtm.addColumn(c);
        }
        dtm.setRowCount(0);
        for (DeGiay dg : list) {
            dtm.addRow(new Object[]{dg.getMaDeGiay(), dg.getTenDeGiay(), dg.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
        }
    }

    private void loadTableTH(List<ThuongHieu> list) {
        dtm = (DefaultTableModel) tblInfo.getModel();
        dtm.setColumnCount(0);
        String[] colums = {"Mã", "Loại", "Trạng thái"};
        for (String c : colums) {
            dtm.addColumn(c);
        }
        dtm.setRowCount(0);
        for (ThuongHieu th : list) {
            dtm.addRow(new Object[]{th.getMaThuongHieu(), th.getTenThuongHieu(), th.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
        }
    }

    private void loadTableCL(List<ChatLieu> list) {
        dtm = (DefaultTableModel) tblInfo.getModel();
        dtm.setColumnCount(0);
        String[] colums = {"Mã", "Loại", "Trạng thái"};
        for (String c : colums) {
            dtm.addColumn(c);
        }
        dtm.setRowCount(0);
        for (ChatLieu cl : list) {
            dtm.addRow(new Object[]{cl.getMaChatLieu(), cl.getTenChatLieu(), cl.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
        }
    }

    private void loadTableMau(List<Mau> list) {
        dtm = (DefaultTableModel) tblInfo.getModel();
        dtm.setColumnCount(0);
        String[] colums = {"Mã", "Loại", "Trạng thái"};
        for (String c : colums) {
            dtm.addColumn(c);
        }
        dtm.setRowCount(0);
        for (Mau m : list) {
            dtm.addRow(new Object[]{m.getMaMau(), m.getTenMau(), m.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
        }
    }

    private void loadTableSize(List<Size> list) {
        dtm = (DefaultTableModel) tblInfo.getModel();
        dtm.setColumnCount(0);
        String[] colums = {"Mã", "Loại", "Trạng thái"};
        for (String c : colums) {
            dtm.addColumn(c);
        }
        dtm.setRowCount(0);
        for (Size s : list) {
            dtm.addRow(new Object[]{s.getMaSize(), s.getTenSize(), s.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
        }
    }

    private void loadTableNCC(List<NhaCungCap> list) {
        dtm = (DefaultTableModel) tblInfo.getModel();
        dtm.setColumnCount(0);
        String[] colums = {"Mã", "Loại", "Trạng thái"};
        for (String c : colums) {
            dtm.addColumn(c);
        }
        dtm.setRowCount(0);
        for (NhaCungCap s : list) {
            dtm.addRow(new Object[]{s.getMaNcc(), s.getTenNCC(), s.getTrangThai() == 0 ? "Còn hàng" : "Hết hàng"});
        }
    }

    private void loadFormDG(DeGiay d) {
        txtID.setText(d.getMaDeGiay());
        txtLoai.setText("Đế Giày");
        if (d.getTrangThai() == 0) {
            rdoConSD.setSelected(true);
        } else {
            rdoNgungSD.setSelected(true);
        }
    }

    private void loadFormTH(ThuongHieu th) {
        txtID.setText(th.getMaThuongHieu());
        txtLoai.setText("Thương hiệu");
        if (th.getTrangThai() == 0) {
            rdoConSD.setSelected(true);
        } else {
            rdoNgungSD.setSelected(true);
        }
    }

    private void loadFormCL(ChatLieu c) {
        txtID.setText(c.getMaChatLieu());
        txtLoai.setText("Chất liệu");
        if (c.getTrangThai() == 0) {
            rdoConSD.setSelected(true);
        } else {
            rdoNgungSD.setSelected(true);
        }
    }

    private void loadFormMau(Mau m) {
        txtID.setText(m.getMaMau());
        txtLoai.setText("Màu");
        if (m.getTrangThai() == 0) {
            rdoConSD.setSelected(true);
        } else {
            rdoNgungSD.setSelected(true);
        }
    }

    private void loadFormSize(Size s) {
        txtID.setText(s.getMaSize());
        txtLoai.setText("Size");
        if (s.getTrangThai() == 0) {
            rdoConSD.setSelected(true);
        } else {
            rdoNgungSD.setSelected(true);
        }
    }

    private void loadFormNcc(NhaCungCap n) {
        txtID.setText(n.getMaNcc());
        txtLoai.setText("Nhà cung cấp");
        if (n.getTrangThai() == 0) {
            rdoConSD.setSelected(true);
        } else {
            rdoNgungSD.setSelected(true);
        }
    }

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed

    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInfoMouseClicked
        if (cboTimKiem.getSelectedItem().equals("Đế giày") || txtTimKiem.getText().equals("Đế giày")) {
            loadFormDG(listDG.get(tblInfo.getSelectedRow()));
        } else if (cboTimKiem.getSelectedItem().equals("Size") || txtTimKiem.getText().equals("Size")) {
            loadFormSize(listSize.get(tblInfo.getSelectedRow()));
        } else if (cboTimKiem.getSelectedItem().equals("Màu") || cboTimKiem.getSelectedItem().equals("Màu")) {
            loadFormMau(listMau.get(tblInfo.getSelectedRow()));
        } else if (cboTimKiem.getSelectedItem().equals("Chất liệu") || cboTimKiem.getSelectedItem().equals("Chất liệu")) {
            loadFormCL(listCL.get(tblInfo.getSelectedRow()));
        } else if (cboTimKiem.getSelectedItem().equals("Thương hiệu") || cboTimKiem.getSelectedItem().equals("Thương hiệu")) {
            loadFormTH(listTH.get(tblInfo.getSelectedRow()));
        } else if (cboTimKiem.getSelectedItem().equals("Nhà cung cấp") || cboTimKiem.getSelectedItem().equals("Nhà cung cấp")) {
            loadFormNcc(listNCC.get(tblInfo.getSelectedRow()));
        }
    }//GEN-LAST:event_tblInfoMouseClicked

    private void cboTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTimKiemActionPerformed
//        dtm = (DefaultTableModel) tblInfo.getModel();
//        if (cboTimKiem.getSelectedItem().equals("Tất cả")) {
//            dtm.setColumnCount(0);
//            String[] columns = {"MaDeGiay", "TenDeGiay", "TrangThai", "MaThuongHieu", "TenThuongHieu", "TrangThai", "MaChatLieu",
//                "TenChatLieu", "TrangThai", "MaMau", "TenMau", "TrangThai", "MaSize", "TenSize", "TrangThai", "Mã ncc", " Tên NCC", " Trạng thái"};
//            for (String c : columns) {
//                dtm.addColumn(c);
//            }
//            dtm.setRowCount(0);
//            for (SanPham sp : listSp) {
//                dtm.addRow(new Object[]{
//                    sp.getMaDG(), sp.getTenDG(), sp.getTrangThaiDG() == 0 ? "Còn hàng" : "Hết hàng",
//                    sp.getMaTH(), sp.getTenTH(), sp.getTrangThaiTH() == 0 ? "Còn hàng" : "Hết hàng",
//                    sp.getMaCL(), sp.getTenCL(), sp.getTrangThaiCL() == 0 ? "Còn hàng" : "Hết hàng",
//                    sp.getMaMau(), sp.getTenMau(), sp.getTrangThaiMau() == 0 ? "Còn hàng" : "Hết hàng",
//                    sp.getMaSize(), sp.getTenSize(), sp.getTrangThaiSize() == 0 ? "Còn hàng" : "Hết hàng",
//                    sp.getMaNCC(), sp.getTenNCC(), sp.getTrangThaiNCCs() == 0 ? "Còn hợp tác" : "Hết hợp tác"
//                });
//            }
//        } else
        if (cboTimKiem.getSelectedItem().equals("Đế giày")) {
            loadTableDG(listDG);
        } else if (cboTimKiem.getSelectedItem().equals("Size")) {
            loadTableSize(listSize);
        } else if (cboTimKiem.getSelectedItem().equals("Màu")) {
            loadTableMau(listMau);
        } else if (cboTimKiem.getSelectedItem().equals("Chất liệu")) {
            loadTableCL(listCL);
        } else if (cboTimKiem.getSelectedItem().equals("Thương hiệu")) {
            loadTableTH(listTH);
        } else if (cboTimKiem.getSelectedItem().equals("Nhà cung cấp")) {
            loadTableNCC(listNCC);
        }
    }//GEN-LAST:event_cboTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (txtTimKiem.getText().equals("Đế giày")) {
            cboTimKiem.setSelectedItem("Đế giày");
            loadTableDG(listDG);
        } else if (txtTimKiem.getText().equals("Size")) {
            cboTimKiem.setSelectedItem("Size");
            loadTableSize(listSize);
        } else if (txtTimKiem.getText().equals("Màu")) {
            cboTimKiem.setSelectedItem("Màu");
            loadTableMau(listMau);
        } else if (txtTimKiem.getText().equals("Chất liệu")) {
            cboTimKiem.setSelectedItem("Chất liệu");
            loadTableCL(listCL);
        } else if (txtTimKiem.getText().equals("Thương hiệu")) {
            cboTimKiem.setSelectedItem("Thương hiệu");
            loadTableTH(listTH);
        } else if (txtTimKiem.getText().equals("Nhà cung cấp")) {
            cboTimKiem.setSelectedItem("Nhà cung cấp");
            loadTableNCC(listNCC);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(ThuocTinhSanPham_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuocTinhSanPham_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuocTinhSanPham_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuocTinhSanPham_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuocTinhSanPham_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnVoucher;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTimKiem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdoConSD;
    private javax.swing.JRadioButton rdoNgungSD;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
