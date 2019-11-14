package com.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.bean.Admin;
import com.xdl.mapper.AdminDAO;

@Service("adminService")
public class AdminService {
	@Autowired
	private AdminDAO admindao;
	
	public Admin login(String name,String password) {
		return admindao.findByNameAndPassword(name, password);
	}
	
}
