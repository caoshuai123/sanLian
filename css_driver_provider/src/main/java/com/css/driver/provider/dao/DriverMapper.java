package com.css.driver.provider.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.css.driver.provider.entity.Address;
import com.css.driver.provider.entity.Driver;

@Mapper
public interface DriverMapper {
	
	/** 
	 * @Title: list 
	 * @Description: 列表
	 * @param name
	 * @return
	 * @return: List<Driver>
	 */
	List<Map> list(String name); 
	
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
	@Select("SELECT d.* ,sheng.`name` as shengName,shi.`name` as shiName, qu.`name` as quName from driver as d \r\n" + 
			"       LEFT join address  sheng on sheng.id=d.shengid \r\n" + 
			"       LEFT join address  shi on shi.id=d.shiid \r\n" + 
			"       LEFT join address  qu on qu.id=d.quid "
			+ " where d.id = #{value} ")
	@ResultType(Driver.class)
	Driver selectByid(Integer id);
	
	

	/**
	 * 
	 * @Title: selectAddress 
	 * @Description: 三级联动
	 * @param parentId
	 * @return
	 * @return: List<Address>
	 */
	@Select("select * from address where parentid=#{value}")
	@ResultType(Address.class)
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
