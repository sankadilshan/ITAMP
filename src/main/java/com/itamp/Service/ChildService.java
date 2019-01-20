package com.itamp.Service;

import java.util.List;

import com.itamp.Model.Child;

public interface ChildService {

	String add(Child child);

	Child get(String id);

	List<Child> all();

	void update(Child ch);

	String delete(String id);
	
	

}
