
package com.fatur.pbo2201082005.p280524;

public class FormStudentRecord extends javax.swing.JFrame {

    public FormStudentRecord() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMathGrade = new javax.swing.JTextField();
        txtEnglishGrade = new javax.swing.JTextField();
        txtScienceGrade = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAverage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 16);

        jLabel2.setText("Address");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 70, 16);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(120, 20, 250, 22);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(120, 50, 250, 22);

        jLabel3.setText("Age");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 21, 16);
        getContentPane().add(txtAge);
        txtAge.setBounds(120, 80, 250, 22);

        jLabel4.setText("Math Grade");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 70, 16);

        jLabel5.setText("English Grade");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 80, 16);

        jLabel6.setText("Science Grade");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 80, 16);
        getContentPane().add(txtMathGrade);
        txtMathGrade.setBounds(120, 110, 250, 22);
        getContentPane().add(txtEnglishGrade);
        txtEnglishGrade.setBounds(120, 140, 250, 22);
        getContentPane().add(txtScienceGrade);
        txtScienceGrade.setBounds(120, 170, 250, 22);

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });
        getContentPane().add(btnProses);
        btnProses.setBounds(20, 200, 350, 23);

        jLabel8.setText("Average");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 240, 70, 16);
        getContentPane().add(txtAverage);
        txtAverage.setBounds(120, 240, 250, 22);

        setSize(new java.awt.Dimension(404, 296));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        com.fatur.pbo2201082005.p260324.StudentRecord student = new com.fatur.pbo2201082005.p260324.StudentRecord();
        student.setName(txtName.getText());
        student.setAddres(txtAddress.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));
        student.setMathGrade(Double.parseDouble(txtMathGrade.getText()));
        student.setEnglishGrade(Double.parseDouble(txtEnglishGrade.getText()));
        student.setScienceGrade(Double.parseDouble(txtScienceGrade.getText()));
        ///
        txtAverage.setText(student.getAverage()+"");
    }//GEN-LAST:event_btnProsesActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(FormStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormStudentRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtEnglishGrade;
    private javax.swing.JTextField txtMathGrade;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScienceGrade;
    // End of variables declaration//GEN-END:variables
}
