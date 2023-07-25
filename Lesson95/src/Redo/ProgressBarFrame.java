
package Redo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author unilap
 */
public class ProgressBarFrame extends javax.swing.JFrame implements ActionListener 
        ,PropertyChangeListener{

    private String selectionFilePath;

    public ProgressBarFrame() {
        initComponents();
        setLocationRelativeTo(null);
        btnChooserFile.addActionListener(this);
        btnCopy.addActionListener(this);
        selectionFilePath = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFileInfor = new javax.swing.JTextArea();
        btnChooserFile = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        progressCopy = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HaiNguyen");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sử Dụng Progress Bar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin File", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        txtFileInfor.setEditable(false);
        txtFileInfor.setColumns(20);
        txtFileInfor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFileInfor.setRows(5);
        jScrollPane1.setViewportView(txtFileInfor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnChooserFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChooserFile.setText("Chọn File");

        btnCopy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCopy.setText("Nhân Bản");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tiến Độ :");

        progressCopy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        progressCopy.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnChooserFile)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(progressCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopy)
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChooserFile)
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopy)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(ProgressBarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgressBarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgressBarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgressBarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressBarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooserFile;
    private javax.swing.JButton btnCopy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar progressCopy;
    private javax.swing.JTextArea txtFileInfor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnChooserFile)) {
            createFileProgress();
        } else if (e.getSource().equals(btnCopy)) {
            proceedToCopy();
        }
    }

    private void createFileProgress() {
        String path = "C:\\Users\\unilap\\Downloads";
        File file = new File(path);
        JFileChooser fileChooser = new JFileChooser(file);
        fileChooser.setFileFilter(new MediaFilter());
        if (fileChooser.showOpenDialog(this) == fileChooser.APPROVE_OPTION) {
            selectionFilePath = fileChooser.getSelectedFile().getAbsolutePath();
            File newFile = new File(selectionFilePath);
            var txt = "";
            txt += "Đường dẫn : " + selectionFilePath + "\n";
            txt += "Tên file : " + selectionFilePath.
                    substring(selectionFilePath.lastIndexOf("\\") + 1) + "\n";
            NumberFormat numberFormat = new DecimalFormat("##.##");
            txt += "Kích thước : " + numberFormat.
                    format(selectionFilePath.length() * 1.0 / 1024 * 1024) + "MB\n";
            txt += "Loại file : " + selectionFilePath.
                    substring(selectionFilePath.lastIndexOf(".") + 1);
            txtFileInfor.setText(txt);
        }
    }

    private void proceedToCopy() {
        if (selectionFilePath != null) {
            btnCopy.setEnabled(false);
           progressCopy.setValue(0);
           Task task = new Task();
           task.execute();
           task.addPropertyChangeListener(this);
           
        } else {
            JOptionPane.showMessageDialog(rootPane, 
                    "Vui lòng chọn file để nhân bản");
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress".equals(evt.getPropertyName())) {
            int progress = (int) evt.getNewValue();
            progressCopy.setValue(progress);
        }
    }

   

    class Task extends SwingWorker<Void, Void> {

        @Override
        protected Void doInBackground() throws Exception {
            var progress = 0;
            var currentSize = 0;
            File file = new File(selectionFilePath);
            var fileCopy = selectionFilePath.substring(0,
                    selectionFilePath.lastIndexOf("."));
            fileCopy += "_new " + FileFilterInValid.getExtension(file);
            try ( FileInputStream fis = new FileInputStream(file); 
                    FileOutputStream fos = new FileOutputStream(fileCopy)) {
                byte[] butter = new byte[8];
                int data = -1;
                while ((data = fis.read(butter)) > -1) {
                    fos.write(butter);
                    currentSize += data;
                    progress = (int) currentSize * 100 / fileCopy.length();
                    setProgress(Math.min(100, progress));
                }
            }
            return null;
        }

        @Override
        protected void done() {
            JOptionPane.showMessageDialog(rootPane, "Nhân bản thành công");
            btnCopy.setEnabled(true);
            progressCopy.setValue(0);
        }

    }

}