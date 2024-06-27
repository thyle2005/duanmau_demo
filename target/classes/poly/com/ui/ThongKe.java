/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class ThongKe extends javax.swing.JDialog {

    /**
     * Creates new form ThongKeJDialog
     */
    public ThongKe() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        btnExcel = new javax.swing.JButton();
        tbnDiemMax = new javax.swing.JButton();
        tbnDiemMin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        btnExcel1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDiemChuyenDe = new javax.swing.JTable();
        btnExcel2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        btnExcel3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Tổng hợp và thống kê");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBangDiem.setRowHeight(25);
        jScrollPane1.setViewportView(tblBangDiem);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("KHÓA HỌC: ");
        jPanel6.add(jLabel2, java.awt.BorderLayout.LINE_START);

        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });
        jPanel6.add(cboKhoaHoc, java.awt.BorderLayout.CENTER);

        btnExcel.setText("Xuất Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        tbnDiemMax.setText("Diểm tăng dần");
        tbnDiemMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnDiemMaxActionPerformed(evt);
            }
        });

        tbnDiemMin.setText("Diểm giảm dần");
        tbnDiemMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnDiemMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tbnDiemMax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbnDiemMin)
                        .addGap(56, 56, 56)
                        .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcel)
                    .addComponent(tbnDiemMax)
                    .addComponent(tbnDiemMin)))
        );

        tabs.addTab("BẢNG ĐIỂM", jPanel1);

        jPanel3.setLayout(new java.awt.BorderLayout());

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NĂM", "SỐ NH", "ĐK SỚM NHẤT", "ĐK MUỘN NHẤT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNguoiHoc.setRowHeight(25);
        jScrollPane2.setViewportView(tblNguoiHoc);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        btnExcel1.setText("Xuất Excel");
        btnExcel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnExcel1, java.awt.BorderLayout.PAGE_END);

        tabs.addTab("NGƯỜI HỌC", jPanel3);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tblDiemChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHUYÊN ĐỀ", "SL HV", "ĐIỂM TN", "ĐIỂM CN", "ĐIỂM TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDiemChuyenDe.setRowHeight(25);
        jScrollPane3.setViewportView(tblDiemChuyenDe);

        jPanel2.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        btnExcel2.setText("Xuất Excel");
        btnExcel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcel2, java.awt.BorderLayout.PAGE_END);

        tabs.addTab("ĐIỂM CHUYÊN ĐỀ", jPanel2);

        jPanel4.setLayout(new java.awt.BorderLayout());

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHUYÊN ĐỀ", "SỐ KH", "SỐ HV", "D. THU", "HP. TN", "HP. CN", "HP. TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoanhThu.setGridColor(new java.awt.Color(0, 0, 204));
        tblDoanhThu.setRowHeight(25);
        jScrollPane4.setViewportView(tblDoanhThu);

        jPanel4.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("NĂM: ");
        jPanel5.add(jLabel3, java.awt.BorderLayout.LINE_START);

        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });
        jPanel5.add(cboNam, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        btnExcel3.setText("Xuất Excel");
        btnExcel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnExcel3, java.awt.BorderLayout.PAGE_END);

        tabs.addTab("DOANH THU", jPanel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed

    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed

    }//GEN-LAST:event_cboNamActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadDataToBangDiem();
        populateKhoaHocComboBox();
        loadDataToNguoiHoc();
        loadDataToDiemChuyenDe();
        loadDataToDoanhThu();
        loadDataToNamComboBox();
    }//GEN-LAST:event_formWindowOpened

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Thiết lập bộ lọc để chỉ hiển thị các file có định dạng Excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);

        // Hiển thị hộp thoại chọn file
        int result = fileChooser.showSaveDialog(this);

        // Xử lý kết quả
        if (result == JFileChooser.APPROVE_OPTION) {
            // Người dùng đã chọn một file
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Đảm bảo có đuôi .xlsx
            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }

            // Gọi phương thức xuất Excel và truyền đường dẫn đã chọn
            exportToExcel(tblBangDiem, filePath);
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnExcel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Thiết lập bộ lọc để chỉ hiển thị các file có định dạng Excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);

        // Hiển thị hộp thoại chọn file
        int result = fileChooser.showSaveDialog(this);

        // Xử lý kết quả
        if (result == JFileChooser.APPROVE_OPTION) {
            // Người dùng đã chọn một file
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Đảm bảo có đuôi .xlsx
            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }

            // Gọi phương thức xuất Excel và truyền đường dẫn đã chọn
            exportToExcel(tblNguoiHoc, filePath);
        }
    }//GEN-LAST:event_btnExcel1ActionPerformed

    private void btnExcel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Thiết lập bộ lọc để chỉ hiển thị các file có định dạng Excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);

        // Hiển thị hộp thoại chọn file
        int result = fileChooser.showSaveDialog(this);

        // Xử lý kết quả
        if (result == JFileChooser.APPROVE_OPTION) {
            // Người dùng đã chọn một file
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Đảm bảo có đuôi .xlsx
            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }

            // Gọi phương thức xuất Excel và truyền đường dẫn đã chọn
            exportToExcel(tblDiemChuyenDe, filePath);
        }
    }//GEN-LAST:event_btnExcel2ActionPerformed

    private void btnExcel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel3ActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Thiết lập bộ lọc để chỉ hiển thị các file có định dạng Excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);

        // Hiển thị hộp thoại chọn file
        int result = fileChooser.showSaveDialog(this);

        // Xử lý kết quả
        if (result == JFileChooser.APPROVE_OPTION) {
            // Người dùng đã chọn một file
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Đảm bảo có đuôi .xlsx
            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }

            // Gọi phương thức xuất Excel và truyền đường dẫn đã chọn
            exportToExcel(tblDoanhThu, filePath);
        }
    }//GEN-LAST:event_btnExcel3ActionPerformed

    private void tbnDiemMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnDiemMaxActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();

        // Get the row sorter
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblBangDiem.setRowSorter(sorter);

        // Define the sort key
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING)); // 2 is the index of the "ĐIỂM" column

        // Apply the sort keys
        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_tbnDiemMaxActionPerformed

    private void tbnDiemMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnDiemMinActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();

        // Get the row sorter
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblBangDiem.setRowSorter(sorter);

        // Define the sort key
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(2, SortOrder.DESCENDING)); // 2 is the index of the "ĐIỂM" column

        // Apply the sort keys
        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_tbnDiemMinActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnExcel1;
    private javax.swing.JButton btnExcel2;
    private javax.swing.JButton btnExcel3;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblDiemChuyenDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JButton tbnDiemMax;
    private javax.swing.JButton tbnDiemMin;
    // End of variables declaration//GEN-END:variables

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost;databaseName=EduSys;encrypt=true;trustServerCertificate=true";
    private static String user = "sa";
    private static String password = "tranduynin";
    private int selectedRow = -1;

    private void exportToExcel(JTable table, String fileName) {
        try {
            try (Workbook workbook = new XSSFWorkbook()) {
                Sheet sheet = workbook.createSheet("Sheet1");
                // Create header row
                Row headerRow;
                headerRow = sheet.createRow(0);
                for (int i = 0; i < table.getColumnCount(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(table.getColumnName(i));
                }
                // Create data rows
                for (int i = 0; i < table.getRowCount(); i++) {
                    Row row = sheet.createRow(i + 1);
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        Cell cell = row.createCell(j);
                        cell.setCellValue(String.valueOf(table.getValueAt(i, j)));
                    }
                }
                // Write the workbook to a file
                try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
                    workbook.write(fileOut);
                    JOptionPane.showMessageDialog(this, "Exported to Excel successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error exporting to Excel.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadDataToBangDiem() {
        // Xóa dữ liệu cũ trong tblBangDiem
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
        model.setRowCount(0);

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu
            conn = DriverManager.getConnection(url, user, password);

            // Chuẩn bị câu truy vấn SQL
            String sql = "SELECT NH.MaNH, NH.HoTen, HV.Diem, "
                    + "CASE "
                    + "    WHEN HV.Diem >= 9.5 THEN N'Xuất sắc' "
                    + "    WHEN HV.Diem >= 8 THEN N'Giỏi' "
                    + "    WHEN HV.Diem >= 7 THEN N'Khá' "
                    + "    WHEN HV.Diem >= 5 THEN N'Trung bình' "
                    + "    ELSE 'Yếu' "
                    + "END AS XepLoaiHocLuc "
                    + "FROM NGUOIHOC NH "
                    + "JOIN HOCVIEN HV ON NH.MaNH = HV.MaNH";

            // Thực thi câu truy vấn
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            // Đọc dữ liệu từ ResultSet và cập nhật vào tblBangDiem
            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("MaNH"),
                    rs.getString("HoTen"),
                    rs.getDouble("Diem"),
                    rs.getString("XepLoaiHocLuc")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Đóng tất cả các tài nguyên (ResultSet, PreparedStatement, Connection)
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadDataToDoanhThu() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Load the JDBC driver
            Class.forName(driver);

            // Establish the database connection
            conn = DriverManager.getConnection(url, user, password);

            // SQL query to retrieve doanh thu information
            String sql = "SELECT CD.TenCD AS ChuyenDe, "
                    + "COUNT(KH.MaKH) AS SoKhoaHoc, "
                    + "COUNT(HV.MaHV) AS SoHocVien, "
                    + "SUM(KH.HocPhi) AS DoanhThu, "
                    + "MIN(KH.HocPhi) AS HocPhiThapNhat, "
                    + "MAX(KH.HocPhi) AS HocPhiCaoNhat, "
                    + "AVG(KH.HocPhi) AS HocPhiTrungBinh "
                    + "FROM ChuyenDe CD "
                    + "JOIN KhoaHoc KH ON CD.MaCD = KH.MaCD "
                    + "LEFT JOIN HocVien HV ON KH.MaKH = HV.MaKH "
                    + "GROUP BY CD.TenCD";

            // Prepare the statement
            stmt = conn.prepareStatement(sql);

            // Execute the query
            rs = stmt.executeQuery();

            // Populate the data into tblDoanhThu
            DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
            model.setRowCount(0); // Clear existing data

            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("ChuyenDe"),
                    rs.getInt("SoKhoaHoc"),
                    rs.getInt("SoHocVien"),
                    rs.getDouble("DoanhThu"),
                    rs.getDouble("HocPhiThapNhat"),
                    rs.getDouble("HocPhiCaoNhat"),
                    rs.getDouble("HocPhiTrungBinh")
                };
                model.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle exceptions as needed
        } finally {
            // Close resources in the reverse order of their creation
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadDataToNamComboBox() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Load the JDBC driver
            Class.forName(driver);

            // Establish the database connection
            conn = DriverManager.getConnection(url, user, password);

            // SQL query to retrieve distinct years from your data
            String sql = "SELECT DISTINCT YEAR(NgayKG) AS Nam FROM KhoaHoc";

            // Prepare the statement
            stmt = conn.prepareStatement(sql);

            // Execute the query
            rs = stmt.executeQuery();

            // Populate the data into cboNam
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cboNam.getModel();
            model.removeAllElements(); // Clear existing data

            // Add a default option for "Tất cả"
            model.addElement("Tất cả");

            while (rs.next()) {
                int nam = rs.getInt("Nam");
                String namString = "Năm " + nam; // Modify this format as needed
                model.addElement(namString);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle exceptions as needed
        } finally {
            // Close resources in the reverse order of their creation
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void populateKhoaHocComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        // Add "Tất cả" as the first item
        model.addElement("Tất cả");

        // Retrieve MaKH values from the database
        List<String> maKHList = getMaKHListFromDatabase();

        // Add MaKH values to the combo box model
        for (String maKH : maKHList) {
            model.addElement(maKH);
        }

        // Set the model to cboKhoaHoc
        cboKhoaHoc.setModel(model);
    }

    private List<String> getMaKHListFromDatabase() {
        List<String> maKHList = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT DISTINCT MaKH FROM KHOAHOC";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            // Retrieve MaKH values and add them to the list
            while (rs.next()) {
                maKHList.add(rs.getString("MaKH"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception (show a message or log it)
        } finally {
            // Close resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return maKHList;
    }

    private void loadDataByMaKH(String maKH) {
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
        model.setRowCount(0);

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

            // Modify the SQL query to filter data by MaKH
            String sql = "SELECT NH.MaNH, NH.HoTen, HV.Diem, "
                    + "CASE "
                    + "    WHEN HV.Diem >= 9.5 THEN N'Xuất sắc' "
                    + "    WHEN HV.Diem >= 8 THEN N'Giỏi' "
                    + "    WHEN HV.Diem >= 7 THEN N'Khá' "
                    + "    WHEN HV.Diem >= 5 THEN N'Trung bình' "
                    + "    ELSE 'Yếu' "
                    + "END AS XepLoaiHocLuc "
                    + "FROM NGUOIHOC NH "
                    + "JOIN HOCVIEN HV ON NH.MaNH = HV.MaNH "
                    + "JOIN KHOAHOC KH ON HV.MaKH = KH.MaKH "
                    + "WHERE KH.MaKH = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, maKH);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("MaNH"),
                    rs.getString("HoTen"),
                    rs.getDouble("Diem"),
                    rs.getString("XepLoaiHocLuc")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadDataToNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

            // Modify the SQL query to get data from NgayDK and extract year
            String sql = "SELECT YEAR(NgayDK) AS Nam, COUNT(MaNH) AS SoNguoiHoc, "
                    + "MIN(NgayDK) AS DangKySomNhat, MAX(NgayDK) AS DangKyMuonNhat "
                    + "FROM NGUOIHOC "
                    + "GROUP BY YEAR(NgayDK)";

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("Nam"),
                    rs.getInt("SoNguoiHoc"),
                    rs.getString("DangKySomNhat"),
                    rs.getString("DangKyMuonNhat")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadDataToDiemChuyenDe() {
        DefaultTableModel model = (DefaultTableModel) tblDiemChuyenDe.getModel();
        model.setRowCount(0);

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

            // Modify the SQL query to get data from NguoiHoc and Diem tables
            String sql = "SELECT CD.TenCD, COUNT(HV.MaHV) AS SoLuongHocVien, "
                    + "MAX(HV.Diem) AS DiemCaoNhat, MIN(HV.Diem) AS DiemThapNhat, AVG(HV.Diem) AS DiemTrungBinh "
                    + "FROM CHUYENDE CD "
                    + "LEFT JOIN KHOAHOC KH ON CD.MaCD = KH.MaCD "
                    + "LEFT JOIN HOCVIEN HV ON KH.MaKH = HV.MaKH "
                    + "GROUP BY CD.TenCD";

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("TenCD"),
                    rs.getInt("SoLuongHocVien"),
                    rs.getDouble("DiemThapNhat"),
                    rs.getDouble("DiemCaoNhat"),
                    rs.getDouble("DiemTrungBinh")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
