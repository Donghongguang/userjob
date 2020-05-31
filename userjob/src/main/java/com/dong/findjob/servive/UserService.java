package com.dong.findjob.servive;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dong.findjob.entity.User;
@Component
@Service
public interface UserService {

	public String login(String username,String password)throws Exception; 
	
	public int regester(User user) throws Exception;
	
}
