package com.shujon.service;

import java.util.List;

public interface CommonService<T> {

    void createTable();

    void save(T t);

    void update(T t);

    void delete(int id);

    T get(int id);

    T getByName(String name);

    List<T> getList();

    List<T> getListBycategory(int id);

    T getProductByIdAndCategory(String product_name, int cat_id);

    T getByProductId(int id);

    T getCategoryByCatId(int id);

    T getUserByUsernameAndPassword(String username, String password);

}
