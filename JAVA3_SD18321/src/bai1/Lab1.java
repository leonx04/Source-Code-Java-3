/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class Lab1 extends javax.swing.JFrame {

    double a;
    double b;

    /**
     * Creates new form Lab1
     */
    public Lab1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public boolean checkForm() {
        if (txt_stNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "First Number khong duoc bo trong");
            txt_stNumber.requestFocus();
            return false;
        } else {
            try {
                double a = Double.parseDouble(txt_stNumber.getText());

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "First Number phai la so");
                return false;
            }
        }
        if (txt_ndNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Second Number khong duoc bo trong");
            txt_ndNumber.requestFocus();
            return false;
        } else {
            try {
                double b = Double.parseDouble(txt_ndNumber.getText());

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Second Number phai la so");
                return false;
            }
        }

        return true;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_stNumber = new javax.swing.JTextField();
        txt_ndNumber = new javax.swing.JTextField();
        txt_Result = new javax.swing.JTextField();
        btn_Cong = new javax.swing.JButton();
        btn_Tru = new javax.swing.JButton();
        btn_Nhan = new javax.swing.JButton();
        btn_Chia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First number");

        jLabel2.setText("Second number");

        jLabel3.setText("Result");

        txt_stNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stNumberActionPerformed(evt);
            }
        });

        txt_Result.setEditable(false);
        txt_Result.setEnabled(false);

        btn_Cong.setText("+");
        btn_Cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CongActionPerformed(evt);
            }
        });

        btn_Tru.setText("-");
        btn_Tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TruActionPerformed(evt);
            }
        });

        btn_Nhan.setText("*");
        btn_Nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanActionPerformed(evt);
            }
        });

        btn_Chia.setText("/");
        btn_Chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Cong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_stNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ndNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Tru, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btn_Nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(btn_Chia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_stNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ndNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Chia)
                    .addComponent(btn_Nhan)
                    .addComponent(btn_Tru)
                    .addComponent(btn_Cong))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_stNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stNumberActionPerformed

    private void btn_NhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanActionPerformed
        // TODO add your handling code here:
        if (checkForm()) {
            double a = Double.parseDouble(txt_stNumber.getText());
            double b = Double.parseDouble(txt_ndNumber.getText());
            String Result = String.valueOf(a * b);
            txt_Result.setText(Result);
        }

    }//GEN-LAST:event_btn_NhanActionPerformed

    private void btn_ChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiaActionPerformed
        // TODO add your handling code here:
        if (checkForm()) {
            double a = Double.parseDouble(txt_stNumber.getText());
            double b = Double.parseDouble(txt_ndNumber.getText());
            if (b == 0) {
                JOptionPane.showMessageDialog(this, "Error");
            } else {

                String Result = String.valueOf(a / b);
                DecimalFormat fm = new DecimalFormat("#.####");
                txt_Result.setText(fm.format(Result));
            }

        }

    }//GEN-LAST:event_btn_ChiaActionPerformed

    private void btn_CongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CongActionPerformed
        // TODO add your handling code here:
        if (checkForm()) {
            double a = Double.parseDouble(txt_stNumber.getText());
            double b = Double.parseDouble(txt_ndNumber.getText());
            String Result = String.valueOf(a + b);
            txt_Result.setText(Result);
        }
    }//GEN-LAST:event_btn_CongActionPerformed

    private void btn_TruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TruActionPerformed
        // TODO add your handling code here:
        if (checkForm()) {
            double a = Double.parseDouble(txt_stNumber.getText());
            double b = Double.parseDouble(txt_ndNumber.getText());
            String Result = String.valueOf(a - b);
            txt_Result.setText(Result);
        }
    }//GEN-LAST:event_btn_TruActionPerformed

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
            java.util.logging.Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Chia;
    private javax.swing.JButton btn_Cong;
    private javax.swing.JButton btn_Nhan;
    private javax.swing.JButton btn_Tru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_Result;
    private javax.swing.JTextField txt_ndNumber;
    private javax.swing.JTextField txt_stNumber;
    // End of variables declaration//GEN-END:variables
}
