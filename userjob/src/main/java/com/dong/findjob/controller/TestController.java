package com.dong.findjob.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dong.findjob.entity.User;
import com.dong.findjob.servive.EmailService;
import com.dong.findjob.servive.UserService;

@Controller
public class TestController {

	@Resource
	private UserService userService;

	 @Resource private EmailService emailService;
	 

	@Value("${filepath}")
	private String filepath;

	@ResponseBody
	@RequestMapping("testSpringBoot")
	public String testSpringBoot() {
		return "Success";
	}

	@ResponseBody
	@RequestMapping("login")
	public String login(@RequestBody @Validated({ Insert.class }) User user, BindingResult result) throws Exception {
		if (result.hasErrors()) {
			return result.getFieldError().getDefaultMessage();
		}
		String message = userService.login(user.getUsername(), user.getPassword());
		return message;
	}

	@RequestMapping(value = "regester", method = RequestMethod.POST)
	@ResponseBody
	public int addUser(@RequestBody User user) throws Exception {
		return userService.regester(user);
	}

	@RequestMapping("upload")
	@ResponseBody
	public String upload(@RequestParam("filename") MultipartFile file) {
		if (file.isEmpty())
			return "file cannot null";
		String filename = file.getOriginalFilename();
		int size = (int) file.getSize();
		System.out.println("大小" + size + "文件名称" + filename);
		File test = new File(filepath + filename);
		if (!test.getParentFile().exists()) {
			test.getParentFile().mkdir();
		}
		try {
			file.transferTo(test);
			return "文件上传成功";
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "false";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "false";
		}
	}

	/**
	 * 发送邮件
	 */
	@RequestMapping("sendEmail")
	@ResponseBody
	public String sendEmail() throws Exception{
		emailService.sendSimpleMail("18115995496@163.com","主题：你好普通邮件","内容：第一封邮件");
		return "发送陈公公";
	}

}
