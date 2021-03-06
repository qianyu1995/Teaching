package com.gs.dao;

import com.gs.bean.Product;
import com.gs.common.bean.Pager4EasyUI;

public interface ProductDAO {
	
	public Product add(Product product);
	public Pager4EasyUI<Product> queryAll(Pager4EasyUI<Product> pager);
	public Product queryById(String id);
	public void update(Product product);
	public void deleteByIds(String[] ids);
	
	public int count();

}
