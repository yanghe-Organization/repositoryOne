package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false)
	private String passWord="123456";
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String gender;
	@Column(nullable=false)
	private String address;
	@Column(length=13,nullable=false)
	private String phoNum;
	@Column
	private int department;
	@Column
	private int age;
	
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoNum() {
		return phoNum;
	}
	public void setPhoNum(String phoNum) {
		this.phoNum = phoNum;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id="+id+",name="+name+",gender="+gender+",department="+department+",address="+address+",phoNum="+phoNum;
	}
	public Employee( String name, String gender,
			String address, String phoNum, int department, int age) {
		
		
		
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoNum = phoNum;
		this.department = department;
		this.age = age;
	}
	public Employee(){}
}
