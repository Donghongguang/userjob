package com.dong.findjob.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dong.findjob.entity.Person;
import com.dong.findjob.mapper.PersonMapper;
import com.dong.findjob.utils.FileUtil;

/**
 * 测试excel的导入导出功能
 * @author jzy
 *
 */
@RestController

public class ExcelController {
	
	
	@Value("${file}")
	private String file;
	@Resource
	private PersonMapper personMapper;

	@RequestMapping("export")
	@ResponseBody
	public void export(HttpServletResponse response) throws UnsupportedEncodingException {
		List<Person> personList=personMapper.selectAll();

//		Person person1=new Person(1,"张三","男",new Date());
//		Person person2=new Person(2,"张三","男",DateUtils.addDays(new Date(),1));
//		Person person3=new Person(3,"张三","男",DateUtils.addDays(new Date(),2));
//		Person person4=new Person(4,"张三","男",DateUtils.addDays(new Date(),3));
//		Person person5=new Person(5,"张三","男",DateUtils.addDays(new Date(),4));
//		personList.add(person1);
//		personList.add(person2);
//		personList.add(person3);
//		personList.add(person4);
//		personList.add(person5);
		FileUtil.exportExcel(personList,"花名册","草帽一伙",Person.class,"海贼王.xls",response);

	}
	@RequestMapping("import")
	@ResponseBody
	public String  importExcel() {
		
		List<Person> list=FileUtil.importExcel(file, 0, 1, Person.class);
		/*
		 * for(Person person:list) { System.out.println(person.getUsername());
		 * personMapper.addPerson(person); }
		 */
		personMapper.addPersonList(list);
		System.out.println("总共多少个数据"+list.size());
		
		return "success";
	}
	
	

}
