
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author unilap
 */
public class ComboBoxFrame extends javax.swing.JFrame implements ActionListener {

    private DefaultTableModel tableModel;
    private List<Student> students;
    private int index;
    private int removeIndex;
    private enum ActionState {
        ADD, EDIT
    }
    private ActionState actionState;
    private int editedIndex;

    public ComboBoxFrame() {
        initComponents();
        setLocationRelativeTo(null);
        students = new LinkedList<>();
        tableModel = (DefaultTableModel) tblStudent.getModel();
        index = 1;
        actionState = ActionState.ADD;
        editedIndex = -1;
        removeIndex = -1;
        txtInValidName.setText("");
        txtInValidstudentId.setText("");
        btnAdd.addActionListener(this);
        btnEdit.addActionListener(this);
        btnRemove.addActionListener(this);
        btnClear.addActionListener(this);
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
        btnClear = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtInValidstudentId = new javax.swing.JLabel();
        txtInValidName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        comboMajor = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HaiNguyen");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Các chức năng của ứng dụng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setText("Xóa Toàn Bộ");

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setText("Sửa");

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemove.setText("Xóa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnClear)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnRemove)
                    .addComponent(btnEdit))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sinh viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setOpaque(false);

        tblStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số TT", "Mã Sinh Viên", "Họ Và Tên", "Chuyên Ngành"
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
        jScrollPane2.setViewportView(tblStudent);
        if (tblStudent.getColumnModel().getColumnCount() > 0) {
            tblStudent.getColumnModel().getColumn(0).setResizable(false);
            tblStudent.getColumnModel().getColumn(1).setResizable(false);
            tblStudent.getColumnModel().getColumn(2).setResizable(false);
            tblStudent.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khu vực nhập liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel3.setOpaque(false);

        txtInValidstudentId.setForeground(new java.awt.Color(255, 0, 51));
        txtInValidstudentId.setText("Show In Valid Student Id");

        txtInValidName.setForeground(new java.awt.Color(255, 51, 51));
        txtInValidName.setText("Show InValid Name Student");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã Sinh Viên : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ Và Tên : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Chuyên Ngành : ");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        comboMajor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboMajor.setModel(new MyComboBox());

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInValidstudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtId)
                    .addComponent(txtName)
                    .addComponent(txtInValidName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboMajor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(btnAdd)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtInValidstudentId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(txtInValidName)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ComboBoxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBoxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBoxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBoxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JLabel txtInValidName;
    private javax.swing.JLabel txtInValidstudentId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnAdd)) {
            addStuent();
        } else if (e.getSource().equals(btnEdit)) {
            edited();
        } else if (e.getSource().equals(btnRemove)) {
            remove();
        } else if (e.getSource().equals(btnClear)) {
            clear();
        }
    }

    private void addStuent() {
        var id = txtId.getText();
        var name = txtName.getText();
        if (!id.isEmpty() && !name.isEmpty()
                && comboMajor.getSelectedItem() != null) {
            var major = comboMajor.getSelectedItem().toString();
            if (actionState == ActionState.ADD) {
                try {
                    txtInValidName.setText("");
                    txtInValidstudentId.setText("");
                    var student = new Student(name, id, major);
                    if (students.contains(student)) {
                        JOptionPane.showMessageDialog(rootPane, "Mã sinh viên " + id + " "
                                + "đã tồn tại ");
                    } else {
                        students.add(student);
                        showStudents(student);
                        JOptionPane.showMessageDialog(rootPane, "Thêm sinh viên "
                                + id + " " + "thành công ");
                        txtId.setText("");
                        txtName.setText("");
                    }
                } catch (InValidStudentIdException ex) {
                    txtInValidstudentId.setText("Mã sinh viên không hợp lệ");
                } catch (InValidNameException ex) {
                    txtInValidName.setText("Tên không hợp lệ ");
                }

            } else if (actionState == ActionState.EDIT) {
                try {
                    var studentsCopy = copyStudents(students, editedIndex);
                    txtInValidName.setText("");
                    txtInValidstudentId.setText("");
                    var student = new Student(name, id, major);
                    if (studentsCopy.contains(student)) {
                        txtInValidstudentId.setText("Mã sinh viên đã tồn tại");
                    } else {
                        txtInValidstudentId.setText("");
                        upDateTable(student);
                        actionState = ActionState.ADD;
                        btnAdd.setText("Thêm");
                        JOptionPane.showMessageDialog(rootPane,
                                "Sửa sinh viên thành công ");
                        txtId.setText("");
                        txtName.setText("");
                    }
                } catch (InValidStudentIdException ex) {
                    txtInValidstudentId.setText("Mã sinh viên không hợp lệ");
                } catch (InValidNameException ex) {
                    txtInValidName.setText("Tên không hợp lệ ");
                }
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Các trường dữ liệu "
                    + "không được rỗng ");
        }
    }

    private void showStudents(Student student) {
        var row = new Object[]{
            index++, student.getId(), student.getName(), student.getMajor()
        };
        tableModel.addRow(row);
        tableModel.fireTableDataChanged();

    }

    private void upDateTable(Student student) {
        students.set(editedIndex, student);
        tableModel.removeRow(editedIndex);
        var row = new Object[]{
            editedIndex + 1, student.getId(), student.getName(), student.getMajor()
        };
        tableModel.insertRow(editedIndex, row);
        tableModel.fireTableDataChanged();
    }

    private void edited() {
        if (students.size() > 0) {
            editedIndex = tblStudent.getSelectedRow();
            if (editedIndex != -1) {
                var student = students.get(editedIndex);
                txtId.setText(student.getId());
                txtName.setText(student.getName());
                var comboBoxSize = comboMajor.getItemCount();
                for (int i = 0; i < comboBoxSize; i++) {
                    if (student.getMajor().compareTo(comboMajor.getItemAt(i)) == 0) {
                        comboMajor.setSelectedIndex(i);
                        break;
                    }
                }
                btnAdd.setText("Cập nhật ");
                actionState = ActionState.EDIT;

            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Vui lòng chọn sinh viên để sửa");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Danh sách sinh viên rỗng ");
        }
    }

    private int browserElement(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (student.getId().compareTo(students.get(i).getId()) == 0) {
                return i;
            }
        }
        return -1;
    }

    private List<Student> copyStudents(List<Student> students, int editedIndex) {
        List<Student> students1 = new LinkedList<>();
        for (int i = 0; i < students.size(); i++) {
            if (i != editedIndex) {
                students1.add(students.get(i));
            }
        }

        return students1;
    }

    private void remove() {
        if (students.size() > 0) {
            removeIndex = tblStudent.getSelectedRow();
            if (removeIndex != -1) {
             var valid=JOptionPane.showConfirmDialog(rootPane, 
                     "Bạn có chắc muốn xóa ?");
             if(valid == 0) {
                 students.remove(removeIndex);
                tableModel.removeRow(removeIndex);
                tableModel.fireTableDataChanged();
                JOptionPane.showMessageDialog(rootPane,
                        "Xóa sinh viên thành công");
             }
            } else {
                JOptionPane.showMessageDialog(rootPane, ""
                        + "Vui lòng chọn sinh viên để xóa ");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Danh sách sinh viên rỗng ");
        }
    }
    
    private void clear() {
        if(students.size()>0) {
            var result=JOptionPane.showConfirmDialog(rootPane, 
                    "Bạn có chắc muốn xóa toàn bộ ?");
            if(result == 0) {
                for (int i = students.size()-1; i >=  0; i--) {
                    tableModel.removeRow(i);
                }
                students.clear();
                tableModel.fireTableDataChanged();
                JOptionPane.showMessageDialog(rootPane,
                        "Đã xóa toàn bộ sinh viên ");
                index=1;
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Danh sách sinh viên rỗng");
        }
    }

}