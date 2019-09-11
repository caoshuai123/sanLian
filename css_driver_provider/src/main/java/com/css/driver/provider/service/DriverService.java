package com.css.driver.provider.service;


import java.util.List;
import java.util.Map;

import com.css.driver.provider.entity.Address;
import com.css.driver.provider.entity.Driver;
import com.github.pagehelper.PageInfo;


public interface DriverService {
	
	/** 
	 * @Title: list 
	 * @Description: 列表
	 * @param name
	 * @return
	 * @return: List<Driver>
	 */
	PageInfo<Map> list(Integer page,Integer pageSize,String name); 
	
	/** 
	 * @Title: addDriver 
	 * @Description: 添加
	 * @param driver
	 * @return
	 * @return: int
	 */
	int addDriver(Driver driver);
	
	
	
	/** 
	 * @Title: delDriver 
	 * @Description: 删
	 * @param id
	 * @return
	 * @return: int
	 */
	int delDriver(Integer id);
	
	/** 
	 * @Title: selectByid 
	 * @Description: 回显
	 * @param id
	 * @return
	 * @return: Driver
	 */
	Driver selectByid(Integer id);
	
	/**
	 * 
	 * @Title: selectAddress 
	 * @Description: 三级联动
	 * @param parentId
	 * @return
	 * @return: List<Address>
	 */
	List<Address> selectAddress(Integer parentId);
	
	/** 
	 * @Title: updateDriver 
	 * @Description: 修改
	 * @param driver
	 * @return
	 * @return: int
	 */
	int updateDriver(Driver driver);
	

}
