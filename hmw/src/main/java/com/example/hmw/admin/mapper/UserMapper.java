package com.example.hmw.admin.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.hmw.admin.model.UserModel;


@Mapper
public interface UserMapper {
	//회원가입
	List<UserModel> testCheck(HashMap<String, Object> map);
	
	
}
