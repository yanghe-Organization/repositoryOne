package app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Employee;
import app.repository.EmpRepository;
import app.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpRepository repository;
	@Override
	public Employee queryUserById(long id) {
		// TODO Auto-generated method stub
		Employee emp=repository.findById(id);
		return emp;
	}

}
