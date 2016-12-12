package app.service;

import org.springframework.stereotype.Service;

import app.entity.Employee;

public interface EmpService {
	Employee queryUserById(long id);
}
