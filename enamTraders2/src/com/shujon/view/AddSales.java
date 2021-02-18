
package com.shujon.view;

import com.shujon.pojo.Category;
import com.shujon.pojo.Product;
import com.shujon.pojo.Purchase;
import com.shujon.pojo.Sales;
import com.shujon.pojo.Summary;
import com.shujon.service.CommonServiceAdapter;
import com.shujon.serviceImpl.CategoryServiceImpl;
import com.shujon.serviceImpl.ProductServiceImpl;
import com.shujon.serviceImpl.PurchaseServiceImpl;
import com.shujon.serviceImpl.SalesServiceImpl;
import com.shujon.serviceImpl.SummaryServiceImpl;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JOptionPane;

public class AddSales extends javax.swing.JFrame {
    CommonServiceAdapter commonService = new SalesServiceImpl();
    CommonServiceAdapter productService = new ProductServiceImpl();
    CommonServiceAdapter catService = new CategoryServiceImpl();
    CommonServiceAdapter summaryService = new SummaryServiceImpl();
    CommonServiceAdapter purchaseService = new PurchaseServiceImpl();
  
    public AddSales() {
        initComponents();
        displayCategoryToComboBox();
    }
      public void displayCategoryToComboBox() {
        List<Category> list = catService.getList();
        for (Category c : list) {
            cmbCategory.addItem(c.getName());
        }
    }
      public void reset(){
        cmbCategory.setSelectedIndex(0);
        cmbProductName.setSelectedIndex(0);
        txtQty.setText(null);
        txtTotalPrice.setText(null);
        txtUnitPrice.setText(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbProductName = new javax.swing.JComboBox();
        cmbCategory = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAvailable = new javax.swing.JTextField();
        txtBying = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(180, 180));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Add Sales");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Category");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        txtQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        txtUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        txtUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnitPriceKeyReleased(evt);
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
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Unit Price");

        cmbProductName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbProductName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProductNameItemStateChanged(evt);
            }
        });

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoryItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Total Price");

        txtTotalPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Availbel QTY");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Buying Price");

        txtAvailable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailableActionPerformed(evt);
            }
        });
        txtAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAvailableKeyReleased(evt);
            }
        });

        txtBying.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtByingActionPerformed(evt);
            }
        });
        txtBying.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtByingKeyReleased(evt);
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
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUnitPrice)
                                .addComponent(cmbProductName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotalPrice)))))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(41, 41, 41)
                        .addComponent(txtBying, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtBying, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int available= Integer.parseInt(txtAvailable.getText());
        int qty= Integer.parseInt(txtQty.getText());
        if(available<qty){
           JOptionPane.showMessageDialog(null, "You have cross your limit. Available qty is "+ available);
        } else {
             String cat = cmbCategory.getSelectedItem().toString();
        Category category = (Category) catService.getByName(cat);

        Product p = (Product) productService.getProductByIdAndCategory(String.valueOf(cmbProductName.getSelectedItem().toString().trim()), category.getId());
        Sales sales = new Sales(p, Integer.parseInt(txtQty.getText().trim()), Double.parseDouble(txtUnitPrice.getText().trim()), Double.parseDouble(txtTotalPrice.getText().trim()), LocalDateTime.now());
        commonService.save(sales);
        // summary save and update
        Summary summari = (Summary) summaryService.getByProductId(p.getId());
        Summary summary = new Summary(summari.getId(), p, summari.getTotalPurchaseQty(), summari.getTotalSalesQty() + Integer.parseInt(txtQty.getText().trim()), summari.getAvailableQty() - Integer.parseInt(txtQty.getText().trim()), LocalDateTime.now());
        summaryService.update(summary);

        JOptionPane.showMessageDialog(rootPane, "Succeessfully Sold");
        reset();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoryItemStateChanged
        // TODO add your handling code here:
        String cat = cmbCategory.getSelectedItem().toString();
        Category category = (Category) catService.getByName(cat);
        List<Product> products = productService.getListBycategory(category.getId());
        cmbProductName.removeAllItems();
        for (Product p : products) {
            cmbProductName.addItem(p.getName());
        }

    }//GEN-LAST:event_cmbCategoryItemStateChanged

    private void txtUnitPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitPriceKeyReleased
        // TODO add your handling code here:
         int qty = 0;
        double unitPrice = 0.0;
        try {
            qty = Integer.parseInt(txtQty.getText().trim());
        } catch (NumberFormatException ne) {
            qty = 1;
        }
        try {
            unitPrice = Double.parseDouble(txtUnitPrice.getText().trim());
        } catch (NumberFormatException e) {
            unitPrice = 0.0;
        }

        txtTotalPrice.setText(String.valueOf(qty * unitPrice));        // TODO add your handling code here:
   
    }//GEN-LAST:event_txtUnitPriceKeyReleased

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        // TODO add your handling code here:
         int qty = 0;
        double unitPrice = 0.0;
        try {
            qty = Integer.parseInt(txtQty.getText().trim());
        } catch (NumberFormatException ne) {
            qty = 1;
        }
        try {
            unitPrice = Double.parseDouble(txtUnitPrice.getText().trim());
        } catch (NumberFormatException e) {
            unitPrice = 0.0;
        }

        txtTotalPrice.setText(String.valueOf(qty * unitPrice));        // TODO add your handling code here:
   
        
    }//GEN-LAST:event_txtQtyKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableActionPerformed

    private void txtAvailableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableKeyReleased

    private void txtByingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtByingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtByingActionPerformed

    private void txtByingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtByingKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtByingKeyReleased

    private void cmbProductNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProductNameItemStateChanged
        // TODO add your handling code here:
        try {
              Product product= (Product) productService.getByName(cmbProductName.getSelectedItem().toString());
       int id= product.getId();
       Summary summary= (Summary) summaryService.getByProductId(id);
       txtAvailable.setText(String.valueOf(summary.getAvailableQty()));
       Purchase purchase = (Purchase) purchaseService.getByProductId(id);
       txtBying.setText(String.valueOf(purchase.getUnitPrice()));
        } catch (Exception e) {
           txtAvailable.setText("0");
           txtBying.setText("0");
        }
     
       
    }//GEN-LAST:event_cmbProductNameItemStateChanged

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
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbCategory;
    private javax.swing.JComboBox cmbProductName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtBying;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
