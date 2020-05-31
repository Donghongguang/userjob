package com.dong.findjob.mapper;

import java.util.List;

import com.dong.findjob.entity.Person;

public interface PersonMapper {
	
	public void addPerson(Person person);
	
	public void addPersonList(List<Person> person);
	
	public List<Person> selectAll();
}
