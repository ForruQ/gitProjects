
package com.shujon.test;

import com.shujon.connection.DbConnection;
import com.shujon.service.CommonServiceAdapter;
import com.shujon.serviceImpl.BuyerServiceImpl;
import com.shujon.serviceImpl.CategoryServiceImpl;
import com.shujon.serviceImpl.DailySalesServiceImpl;
import com.shujon.serviceImpl.ProductServiceImpl;
import com.shujon.serviceImpl.PurchaseServiceImpl;
import com.shujon.serviceImpl.SalesServiceImpl;
import com.shujon.serviceImpl.SummaryServiceImpl;
import com.shujon.serviceImpl.UserServiceImpl;
import java.sql.Connection;

public class Test {
     public static void main(String[] args) {
       Connection con=DbConnection.getInstance();
        CommonServiceAdapter cat = new CategoryServiceImpl();
        CommonServiceAdapter product = new ProductServiceImpl();
        CommonServiceAdapter purcahase = new PurchaseServiceImpl();
        CommonServiceAdapter sales = new SalesServiceImpl();
        CommonServiceAdapter summery = new SummaryServiceImpl();
        CommonServiceAdapter dailysales = new DailySalesServiceImpl();
        CommonServiceAdapter user = new UserServiceImpl();
        CommonServiceAdapter buyer = new BuyerServiceImpl();
        
        
        cat.createTable();
        product.createTable();
        purcahase.createTable();
        sales.createTable();
        summery.createTable();
        dailysales.createTable();
        user.createTable();
        buyer.createTable();
    }
}
