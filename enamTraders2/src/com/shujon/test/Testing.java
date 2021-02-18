
package com.shujon.test;


import com.shujon.pojo.DailySales;
import com.shujon.pojo.Purchase;
import com.shujon.service.CommonService;
import com.shujon.serviceImpl.DailySalesServiceImpl;
import com.shujon.serviceImpl.PurchaseServiceImpl;
import java.util.List;


public class Testing {
    
    public static void main(String[] args) {
     CommonService dailySales = new DailySalesServiceImpl();
       CommonService commonService = new PurchaseServiceImpl();
//          List<Purchase> list = commonService.getList();
//          double sum = 0;
//          for (int i = 0; i < list.size(); i++) {
//          double  totalPrice= list.get(i).getTotalPrice();
//          sum+= totalPrice;
//        }
//          System.out.println(sum);
//          getSales();
//         List<Purchase> list = commonService.getList();
//        int i;
//        for (i = 0; i < list.size()-1; i++) {
//            
//        }
//        System.out.println(list.get(i).getId());
        
        
        List<DailySales> list = dailySales.getList();
        int i;
        for (i = 0; i < list.size(); i++) {
           
        }
         System.out.println(i);
        
    }
//    public static void getSales() {
//        CommonService com= new DailySalesServiceImpl();
//        DailySales sales= (DailySales) com.get(1);
//        System.out.println("total sales" + sales);
//    }
    
}
