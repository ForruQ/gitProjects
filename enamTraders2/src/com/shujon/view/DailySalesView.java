package com.shujon.view;

import com.shujon.pojo.DailySales;
import com.shujon.pojo.Sales;
import com.shujon.service.CommonServiceAdapter;
import com.shujon.serviceImpl.DailySalesServiceImpl;
import com.shujon.serviceImpl.SalesServiceImpl;
import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

public class DailySalesView extends javax.swing.JFrame {

    CommonServiceAdapter commonService = new SalesServiceImpl();
    CommonServiceAdapter dailySales = new DailySalesServiceImpl();
    DailySalesServiceImpl dd = new DailySalesServiceImpl();

    public DailySalesView() {
        initComponents();
        setlastDate();
        txtLastSales.setText(String.valueOf(lastSales()));
    }

    public double lastSales() {
        double lastSales;
        try {
            List<DailySales> list = dailySales.getList();
            int i;
            for (i = 0; i < list.size() - 1; i++) {
            }
            lastSales = list.get(i).getTotalSales();
        } catch (Exception e) {
            lastSales = 0;
        }
        return lastSales;
    }

    public void setlastDate() {
        try {
            List<DailySales> list = dailySales.getList();
            int i;
            for (i = 0; i < list.size() - 1; i++) {
            }
            String lastDate = list.get(i).getShowDate().toLocalDate().toString();
            txtShowDate.setText(lastDate);
        } catch (Exception e) {

        }
    }

    public void setTodaysSales() {
        double total = total();
        double lastSales = lastSales();
        double todaysSales = total - lastSales;
    }

    public double total() {
        List<Sales> list = commonService.getList();
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            double totalPrice = list.get(i).getTotalPrice();
            sum += totalPrice;
        }
        return sum;
    }

    public void todaysSales() {
        double totalSales = total();
        double lastSales = lastSales();
        double todaysSales = totalSales - lastSales;
        try {
            txtTodaysSales.setText(String.valueOf(todaysSales));

        } catch (NullPointerException e) {
            txtTodaysSales.setText(String.valueOf(totalSales));
        }

    }
    
    public void reset(){
        txtShowDate.setText(null);
        txtTodaysSales.setText(null);
        txtTotalSales.setText(null);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtLastSales = new javax.swing.JTextField();
        txtTodaysSales = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalSales = new javax.swing.JTextField();
        txtShowDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 180));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Daily Sales");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Last Update");

        txtLastSales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLastSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastSalesActionPerformed(evt);
            }
        });
        txtLastSales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastSalesKeyReleased(evt);
            }
        });

        txtTodaysSales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTodaysSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTodaysSalesActionPerformed(evt);
            }
        });
        txtTodaysSales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTodaysSalesKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Last Sales");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Todays Sales");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Total Sales");

        txtTotalSales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalSalesActionPerformed(evt);
            }
        });

        txtShowDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtShowDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShowDateActionPerformed(evt);
            }
        });
        txtShowDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtShowDateKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(216, 216, 216)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTodaysSales)
                                .addComponent(txtLastSales, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotalSales)
                                .addComponent(txtShowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(165, 165, 165)
                .addComponent(jButton3)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtShowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLastSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTodaysSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastSalesActionPerformed

    private void txtTotalSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalSalesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        todaysSales();
        txtTotalSales.setText(String.valueOf(total()));
       
        double tot = lastSales();
        if(txtTotalSales.getText().equalsIgnoreCase(String.valueOf(tot))) {
            JOptionPane.showMessageDialog(null, "Already Updated");
        } else{
//            String todays = LocalDate.now().toString();
//            String showD= txtShowDate.getText();
//            if(showD.equals(todays)) {
//                  DailySales sales = new DailySales(LocalDateTime.now(), Double.parseDouble(txtLastSales.getText()),
//                Double.parseDouble(txtTodaysSales.getText()), Double.parseDouble(txtTotalSales.getText()));
//        dailySales.update(sales);
//            } else{
        DailySales sales = new DailySales(LocalDateTime.now(), Double.parseDouble(txtLastSales.getText()),
                Double.parseDouble(txtTodaysSales.getText()), Double.parseDouble(txtTotalSales.getText()));
        dailySales.save(sales);
//            }
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLastSalesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastSalesKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtLastSalesKeyReleased

    private void txtTodaysSalesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTodaysSalesKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTodaysSalesKeyReleased

    private void txtTodaysSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTodaysSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTodaysSalesActionPerformed

    private void txtShowDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShowDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShowDateActionPerformed

    private void txtShowDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtShowDateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShowDateKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DailySalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailySalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailySalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailySalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailySalesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtLastSales;
    private javax.swing.JTextField txtShowDate;
    private javax.swing.JTextField txtTodaysSales;
    private javax.swing.JTextField txtTotalSales;
    // End of variables declaration//GEN-END:variables
}
