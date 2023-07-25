package Panel.ComboBox_Table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author unilap
 */
public class ComboBoxFrame extends javax.swing.JFrame {

    private final DefaultTableModel tableModel;
    private final List<Student> students;
    private int index;
    private int editedIndex;

    private enum ActionState {
        ADD, EDIT;
    }
    private ActionState actionState;

    public ComboBoxFrame() {
        initComponents();
        setLocationRelativeTo(null);
        students = new ArrayList<>();
        tableModel = (DefaultTableModel) tblStudent.getModel();
        index = 1;
        editedIndex = -1;
        actionState = ActionState.ADD;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        comboMajor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ComboBox");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Các Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemove.setText("Xóa");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setText("Xóa toàn bộ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnRemove)
                    .addComponent(btnClear))
                .addGap(16, 16, 16))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUẢN LÍ SINH VIÊN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập Dữ Liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        comboMajor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboMajor.setModel( new MyComboBoxModel() );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Họ và tên : ");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setOpaque(true);

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã sinh viên :");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Chuyên ngành : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(comboMajor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAdd)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)
                            .addComponent(jLabel3))))
                .addGap(38, 38, 38))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Sinh Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel3.setToolTipText("");

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số TT", "Mã SV", "Họ Tên", "Chuyên Ngành"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblStudent.setOpaque(false);
        tblStudent.setShowVerticalLines(true);
        tblStudent.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(tblStudent);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        var id = txtId.getText();
        var name = txtName.getText();
        var major = "";
        if (!id.isEmpty() && !name.isEmpty()) {
            if (comboMajor.getSelectedItem() != null) {
                major = comboMajor.getSelectedItem().toString();
                var student = new Student(id, name, major);
                if (actionState == actionState.ADD) {
                    if (students.contains(student)) {
                        JOptionPane.showMessageDialog(rootPane,
                                "Mã sinh viên " + id + " đã tồn tại !");
                    } else {
                        students.add(student);
                        showStudents(student);
                        JOptionPane.showMessageDialog(rootPane,
                                "Thêm sinh viên thành công !");
                    }
                } else if (actionState == ActionState.EDIT) {
                    updateTable(student);
                    JOptionPane.showMessageDialog(rootPane,
                            "Cập nhật thông tin sinh viên thành công !");
                    actionState = ActionState.ADD;
                    btnAdd.setText("Thêm");
                }
                txtId.setText("");
                txtName.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Trường dữ liệu chuyên ngành không được rỗng  !");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Các trường dữ liệu không được rỗng  !");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        if (students.size() > 0) {
            int selectedIndex = tblStudent.getSelectedRow();
            if (selectedIndex != -1) {
                int choice = JOptionPane.showConfirmDialog(rootPane,
                    "Bạn có chắc muốn xóa toàn bộ không ?");
                if (choice == 0) {
                    for (int i = students.size() - 1; i >= 0; i--) {
                        tableModel.removeRow(i);
                    }
                    students.clear();
                    JOptionPane.showMessageDialog(rootPane,
                        "Xóa dữ liệu thành công ! ");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane,
                    "Vui lòng chọn sinh viên để xóa  !");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Chức năng hiện không khả dụng !");
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (students.size() > 0) {
            int selectedIndex = tblStudent.getSelectedRow();
            if (selectedIndex != -1) {
                int choice = JOptionPane.showConfirmDialog(rootPane,
                    "Bạn có chắc muốn xóa không ?");
                if (choice == 0) {
                    students.remove(selectedIndex);
                    tableModel.removeRow(selectedIndex);
                    tableModel.fireTableDataChanged();
                    JOptionPane.showMessageDialog(rootPane,
                        "Xóa sinh viên thành công ! ");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane,
                    "Vui lòng chọn sinh viên để xóa  !");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Chức năng hiện không khả dụng !");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (students.size() > 0) {
            editedIndex = tblStudent.getSelectedRow();
            if (editedIndex != -1) {
                var student = students.get(editedIndex);
                txtId.setText(student.getId());
                txtName.setText(student.getName());
                //thiết lập lựa chọn trong comboBox
                int comboBoxSize = comboMajor.getItemCount();
                for (int i = 0; i < comboBoxSize; i++) {
                    if (student.getMajor().compareTo(comboMajor.getItemAt(i)) == 0) {
                        comboMajor.setSelectedIndex(i);
                        break;
                    }
                }
                btnAdd.setText("Cập Nhật ");
                actionState = ActionState.EDIT;
            } else {
                JOptionPane.showMessageDialog(rootPane,
                    "Vui lòng chọn 1 sinh viên để sửa !");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Chức năng này hiện chưa khả dụng !");
        }
    }//GEN-LAST:event_btnEditActionPerformed
    private void updateTable(Student student) {
        students.set(editedIndex, student);
        tableModel.removeRow(editedIndex);
        var row = new Object[]{
            editedIndex + 1, student.getId(), student.getName(), student.getMajor()
        };
        tableModel.insertRow(editedIndex, row);
        tableModel.fireTableDataChanged();
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
            java.util.logging.Logger.getLogger(ComboBoxFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBoxFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBoxFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBoxFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBoxFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> comboMajor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void showStudents(Student student) {
        var row = new Object[]{
            index++, student.getId(), student.getName(), student.getMajor()
        };
        tableModel.addRow(row);
        tableModel.fireTableDataChanged();
    }
}
