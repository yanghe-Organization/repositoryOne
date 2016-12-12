package app.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app.entity.Employee;
/**
 * 
 * spring-data-jpa语法规范
 * @author Administrator
 *
 */
@Repository
@Transactional
public interface EmpRepository extends JpaRepository<Employee, Long>{
	
	/**
	 * select * from Employee where id=?
	 * @param id
	 * @return
	 */
	Employee findById(long id);
	/**
	 * select * from employee where id <>?
	 * @param Gender
	 * @return
	 */
	List<Employee> findByIdNot(long id);
	
	List<Employee> findByNameLike(String name);
	
	List<Employee> findByNameNotLike(String name);
	
	Employee findByIdAndPassWord(long id,String passWord);
	
	List<Employee> findByAgeBetween(int min,int max);
	
	List<Employee> findByAgeLessThan(int age);
	
	List<Employee> findByAgeGreaterThan(int age);
	
	List<Employee> findByAddressIsNull();
	
	List<Employee> findByAddressIsNotNull();
	/**
	 * select * from employee where age=? order by desc
	 * @return
	 */
	List<Employee> findByAgeOrderByIdDesc(int age);
	
	List<Employee> findByAgeIn(int[] age);
	
	List<Employee> findByAgeNotIn(int[] age);
	
}
