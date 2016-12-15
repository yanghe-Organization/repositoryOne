package app.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import app.entity.Employee;
import app.entity.ErrorInfo;
import app.repository.EmpRepository;
import app.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpRepository repository;
	static Logger logger=LoggerFactory.getLogger(EmpServiceImpl.class);
	@Override
	public Employee queryUserById(long id) {
		// TODO Auto-generated method stub
		Employee emp=repository.findById(id);
		return emp;
	}
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		repository.save(emp);
		
	}
	@Override
	public Employee loginCheck(ErrorInfo error,long id, String pwd) {
		// TODO Auto-generated method stub
		logger.info("id:"+id+"pwd:"+pwd);
		Employee emp=repository.findByIdAndPassWord(id, pwd);
		return emp;
	}
	@Override
	public List<Employee> empManage() {
		// TODO Auto-generated method stub
		List<Employee> list=repository.findAll();
		
		return list;
	}
	
	

}
