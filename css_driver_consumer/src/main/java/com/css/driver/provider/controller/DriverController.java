package com.css.driver.provider.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.css.driver.provider.entity.Address;
import com.css.driver.provider.entity.Driver;
import com.css.driver.provider.service.DriverService;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @ClassName: DriverController 
 * @Description: TODO
 * @author: 曹少帅·
 * @date: 2019年9月9日 上午11:35:15
 */
@Controller
public class DriverController {
	
	@Reference
	private DriverService driverService;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="3")Integer pageSize,
			@RequestParam(defaultValue="")String name,Model m) {
		PageInfo<Map> pageInfo = driverService.list(page, pageSize, name);
		m.addAttribute("pageInfo", pageInfo);
		m.addAttribute("page", page);
		m.addAttribute("name", name);
	   return "driverlist";	
	}
	
	@GetMapping("toadd")
	public String toadd(Model m) {
		
		
		return "addDriver";
	}
	
	@PostMapping("san")
	@ResponseBody
	public List<Address> san(Model m,Integer parentId) {
		List<Address> addressList = driverService.selectAddress(parentId);
		
		return addressList;
	}
	
	
	@PostMapping("add")
	@ResponseBody
	public boolean toadd(Driver driver) {
		int i = driverService.addDriver(driver);
		return i>0;
	}
	
	@GetMapping("/toupdate")
	public String toupdate(Model m,Integer id) {
		Driver driver = driverService.selectByid(id);
		
		m.addAttribute("driver", driver);
		
		return "update";
	}
	
	@PostMapping("update")
	@ResponseBody
	public boolean update(Driver driver) {
		int i = driverService.updateDriver(driver);
		return i>0;
	}
	
	

}
