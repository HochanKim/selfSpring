package com.example.hmw.admin.service;

import java.util.HashMap;
import java.util.Map;

public interface UserService {
	//아이디 중복체크
	HashMap<String, Object> testCheck(HashMap<String, Object> map);
}
