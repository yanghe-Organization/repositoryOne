package app.service;

import java.util.List;

import app.entity.Employee;
import app.entity.ErrorInfo;

public interface EmpService {
	Employee queryUserById(long id);
	
	void addEmployee(Employee emp);
	
	Employee loginCheck(ErrorInfo error,long id,String pwd);
	
	List<Employee> empManage();
	
	
}
