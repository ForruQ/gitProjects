
package com.shujon.util;

import com.shujon.view.AddCategory;
import com.shujon.view.AddProduct;
import com.shujon.view.AddPurchase;
import com.shujon.view.AddSales;
import com.shujon.view.AddUser;
import com.shujon.view.CategoryDetails;
import com.shujon.view.DailySalesDetails;
import com.shujon.view.DailySalesView;
import com.shujon.view.DeleteUser;
import com.shujon.view.LoginView;
import com.shujon.view.ProductDetails;
import com.shujon.view.PurchaseDetails;
import com.shujon.view.SalesDetails;
import com.shujon.view.SummaryDetails;
import com.shujon.view.UpdateCategory;
import com.shujon.view.UpdateProduct;
import com.shujon.view.UpdateUser;
import com.shujon.view.UserDetails;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class CommonMenu {
    public void getCommonMenu(JFrame f){
        JMenuBar menuBar= new JMenuBar();
        JMenu category = new JMenu("Category");
         JMenuItem addCategory = new JMenuItem("Add Category");
         addCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new AddCategory().setVisible(true);
            }
        });
         
          JMenuItem updateCategory = new JMenuItem("Update Category");
        updateCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new UpdateCategory().setVisible(true);
            }
        });
        
         JMenuItem categoryDetails = new JMenuItem("Category Details");
         categoryDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new CategoryDetails().setVisible(true);
            }
        });
         category.add(addCategory);
         category.add(updateCategory);
         category.add(categoryDetails);
         
          JMenu product = new JMenu("Product");
         JMenuItem addProduct = new JMenuItem("Add Product");
         addProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new AddProduct().setVisible(true);
            }
        });
     
         JMenuItem updateProduct = new JMenuItem("Update Product");
         updateProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new UpdateProduct().setVisible(true);
            }
        });
         
          JMenuItem productDetails = new JMenuItem("Product Details");
        productDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProductDetails().setVisible(true);
            }
        });
        product.add(addProduct);
        product.add(updateProduct);
        product.add(productDetails);
        
        JMenu purchase = new JMenu("Purchase");
         JMenuItem addPurchase = new JMenuItem("Add Purchase");
         addPurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new AddPurchase().setVisible(true);
            }
        });
         
          JMenuItem purchaseDetails = new JMenuItem("Purchase Details");
        purchaseDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new PurchaseDetails().setVisible(true);
            }
        });
        purchase.add(addPurchase);
        purchase.add(purchaseDetails);
        
         JMenu sales = new JMenu("Sales");
         JMenuItem addSales = new JMenuItem("Add Sales");
         addSales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new AddSales().setVisible(true);
            }
        });
         
          JMenuItem salesDetails = new JMenuItem("Sales Details");
        salesDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new SalesDetails().setVisible(true);
            }
        });
        sales.add(addSales);
        sales.add(salesDetails);
        
         JMenu dailySales = new JMenu("Daily Sales");
         JMenuItem addDailySales = new JMenuItem("Calculate Daily Sales");
         addDailySales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new DailySalesView().setVisible(true);
            }
        });
         
          JMenuItem dailySalesDetails = new JMenuItem("Daily Sales Details");
        dailySalesDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new DailySalesDetails().setVisible(true);
            }
        });
        dailySales.add(addDailySales);
        dailySales.add(dailySalesDetails);
        
       
        
         JMenu summary = new JMenu("Summary");
         JMenuItem summaryDetils = new JMenuItem("Summary Details");
         summaryDetils.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new SummaryDetails().setVisible(true);
            }
        });
         
     
        summary.add(summaryDetils);
        
         JMenu setting = new JMenu("Setting");
         JMenuItem createUser = new JMenuItem("Create User");
         createUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new AddUser().setVisible(true);
            }
        });
          JMenuItem updateUser = new JMenuItem("Update User");
         updateUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new UpdateUser().setVisible(true);
            }
        });
         
          JMenuItem deleteUser = new JMenuItem("Delete User");
         deleteUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new DeleteUser().setVisible(true);
            }
        });
         
          JMenuItem userDetails = new JMenuItem("User Details");
        userDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new UserDetails().setVisible(true);
            }
        });
        
         JMenuItem logout = new JMenuItem("Log Out");
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
                LoginView log= new LoginView();
                log.setVisible(true);
            }
        });
        setting.add(createUser);
        setting.add(updateUser);
        setting.add(deleteUser);
        setting.add(userDetails);
        setting.add(logout);
        
       menuBar.add(category);
       menuBar.add(product);
       menuBar.add(purchase);
       menuBar.add(sales);
       menuBar.add(dailySales);
       menuBar.add(summary);
       menuBar.add(setting);
       f.setJMenuBar(menuBar);
       
    }
}
