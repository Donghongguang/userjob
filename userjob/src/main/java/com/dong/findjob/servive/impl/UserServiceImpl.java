package com.dong.findjob.servive.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dong.findjob.entity.User;
import com.dong.findjob.mapper.UserMapper;
import com.dong.findjob.servive.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;

	@Override
	public String login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		
		String message=userMapper.selectByUsername(username);
		if(message==null||message=="") {
			message="不存在该用户";
		}
		if(message.equals(password)) {
			message="登陆成功";
		}
		return message;
	}

	@Override
	public int regester(User user) throws Exception {
		
		return userMapper.insert(user);
	}
	

	
}
