import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import app.Application;
import app.entity.Employee;
import app.repository.EmpRepository;
import app.service.EmpService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class EmpTest {
	@Autowired
	private EmpService service;
	
	
	
	
	@Test
	public void register(){
		Employee emp=new Employee( "zhangsan", "man", "beijing", "1325555", 1, 25);
		service.addEmployee(emp);
	}
	
	@Test
	public void testCaseOne(){
		long id=1;
		Employee empo=service.queryUserById(id);
		System.out.println(empo);
	}
}
