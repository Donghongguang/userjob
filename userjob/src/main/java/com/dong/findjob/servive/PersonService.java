package com.dong.findjob.servive;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dong.findjob.entity.Person;

@Component
@Service	
public interface PersonService {

	public void addPerson(Person person);
}
