package entity;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Department implements Serializable {
private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id; 
	private String name;
	
	@OneToMany(targetEntity=Employee.class)
	private List<Employee> employeeList;

	public Department(int id, String name, List<Employee> employeeList) {
		super();
		this.id = id;
		this.name = name;
		this.employeeList = employeeList;
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department() {
		super();
	}   
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employeeList="
				+ employeeList + "]";
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
}