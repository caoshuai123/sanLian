package com.css.driver.provider.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.css.driver.provider.dao.DriverMapper;
import com.css.driver.provider.entity.Address;
import com.css.driver.provider.entity.Driver;
import com.css.driver.provider.service.DriverService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service(interfaceClass=DriverService.class)
public class DriverServiceImpl implements DriverService{
	
	@Resource
	private DriverMapper driverMapper;

	@Override
	public PageInfo<Map> list(Integer page,Integer pageSize,String name) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pageSize);
		
		List<Map> list = driverMapper.list(name);
		
		return new PageInfo<>(list);
	}

	@Override
	public int addDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverMapper.addDriver(driver);
	}

	@Override
	public int delDriver(Integer id) {
		// TODO Auto-generated method stub
		return driverMapper.delDriver(id);
	}

	@Override
	public Driver selectByid(Integer id) {
		// TODO Auto-generated method stub
		return driverMapper.selectByid(id);
	}

	

	@Override
	public int updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverMapper.updateDriver(driver);
	}

	@Override
	public List<Address> selectAddress(Integer parentId) {
		// TODO Auto-generated method stub
		return driverMapper.selectAddress(parentId);
	}

}
