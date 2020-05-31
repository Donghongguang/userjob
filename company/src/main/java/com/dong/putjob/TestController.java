package com.dong.putjob;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	
	@ResponseBody
	@RequestMapping("testCompany")
	public String testCompany() {
		return "Success";
	}
}
