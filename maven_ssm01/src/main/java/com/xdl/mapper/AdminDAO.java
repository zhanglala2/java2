package com.xdl.mapper;

import org.apache.ibatis.annotations.Param;

import com.xdl.bean.Admin;

public interface AdminDAO {
	
	Admin findByNameAndPassword(@Param("name")String name,@Param("password")String password);

}
