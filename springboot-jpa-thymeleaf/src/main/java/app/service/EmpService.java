package app.service;

import app.entity.Employee;

public interface EmpService {
	Employee queryUserById(long id);
	
	void addEmployee(Employee emp);
}
