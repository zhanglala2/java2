package com.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xdl.bean.Admin;
import com.xdl.service.AdminService;

@Controller
public class adminController {
	@Autowired
	private AdminService adminService;

	@RequestMapping("/tologin.do")
	public String tologin() {
		return "login";
	}
	
	@RequestMapping("/login.do")
	public String login(String name, String password, HttpServletRequest request) {
		System.out.println(name);
		Admin admin = adminService.login(name, password);
		if (admin !=null) {
			return "main";
		}
		request.setAttribute("msg", "登录失败");
		return "login";
	}

}
