/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai2;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Demo_Layout extends javax.swing.JFrame {

    //1.khai báo biến
    //2.biến lưu sô thứ nhất
    long a = 0;
    long b = 0;
    //3.biến phép toán
    String pheptoan = "";

    public Demo_Layout() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        tbnchia = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        txtTru = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang ham");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CASIO");

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtname.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtname.setEnabled(false);

        jPanel1.setLayout(new java.awt.GridLayout(4, 5, 10, 10));

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);

        tbnchia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbnchia.setText("/");
        tbnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnchiaActionPerformed(evt);
            }
        });
        jPanel1.add(tbnchia);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("sqtr");
        jPanel1.add(jButton5);

        btn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);

        btn5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);

        btnNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });
        jPanel1.add(btnNhan);

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setText("%");
        jPanel1.add(jButton10);

        btn7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);

        btn8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);

        btn9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);

        txtTru.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTru.setText("-");
        txtTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTruActionPerformed(evt);
            }
        });
        jPanel1.add(txtTru);

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton15.setText("1/x");
        jPanel1.add(jButton15);

        btn0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton17.setText("+/-");
        jPanel1.add(jButton17);

        delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delete.setText("C");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);

        btnCong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        jPanel1.add(btnCong);

        btnBang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        jPanel1.add(btnBang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn1.getText());

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        //lấy giá trị lên text box
        String gt = txtname.getText();
        //nếu lúc đầu là 0 thì gán gt về rỗng
        if (gt.equals("0")) {
            gt = "";
        }
        //cộng dồn thành chuỗi
        txtname.setText(gt + btn0.getText());
    }//GEN-LAST:event_btn0ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        txtname.setText(null);
    }//GEN-LAST:event_deleteActionPerformed

    private void tbnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnchiaActionPerformed
        //dùng 1 biến a dữ số thứ nhất
        a = Long.parseLong(txtname.getText());
        //biến phép toán lưu phép toán
        pheptoan = "/";
        //gán txtname về 0 
        txtname.setText("");
    }//GEN-LAST:event_tbnchiaActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        //dùng 1 biến a dữ số thứ nhất
        a = Long.parseLong(txtname.getText());
        //biến phép toán lưu phép toán
        pheptoan = "*";
        //gán txtname về 0 
        txtname.setText("");
    }//GEN-LAST:event_btnNhanActionPerformed

    private void txtTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTruActionPerformed
        //dùng 1 biến a dữ số thứ nhất
        a = Long.parseLong(txtname.getText());
        //biến phép toán lưu phép toán
        pheptoan = "-";
        //gán txtname về 0 
        txtname.setText("");
    }//GEN-LAST:event_txtTruActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        //dùng 1 biến a dữ số thứ nhất
        a = Long.parseLong(txtname.getText());
        //biến phép toán lưu phép toán
        pheptoan = "+";
        //gán txtname về 0 
        txtname.setText("");
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        //lưu lại số thứ 2 bằng biến b
        b = Long.parseLong(txtname.getText());
        //khai báo biến kết quả
        double kq = 0;
        //có 4 trường hợp
        if (pheptoan.equals("+")) {
            kq = a + b;
            txtname.setText(String.valueOf(kq));
        }
        if (pheptoan.equals("-")) {
            kq = a - b;
            txtname.setText(String.valueOf(kq));
        }
        if (pheptoan.equals("*")) {
            kq = a * b;
            txtname.setText(String.valueOf(kq));
        }
        if (pheptoan.equals("/")) {
            if (b == 0) {
                txtname.setText("Error");
                return;
            } 
                kq = a / b;
                txtname.setText(String.valueOf(kq));
            

        }
        //hiển thị kết quả
        
        //quay về ban đầu 
        a = 0;
        b = 0;
        pheptoan = "";
    }//GEN-LAST:event_btnBangActionPerformed

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
            java.util.logging.Logger.getLogger(Demo_Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo_Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo_Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo_Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo_Layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tbnchia;
    private javax.swing.JButton txtTru;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
