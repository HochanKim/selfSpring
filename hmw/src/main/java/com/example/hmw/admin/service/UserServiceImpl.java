package com.example.hmw.admin.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hmw.admin.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;

	@Override
	public HashMap<String, Object> testCheck(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	


	
	


}
