package net.office_planner.User;

import net.office_planner.Admin.Admin;
import net.office_planner.Employee.Employee;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "email", nullable = false, unique = true, length = 45)
	private String email;
	
	@Column(name = "password", nullable = false, length = 64)
	private String password;
	
	@Column(name = "firstName", nullable = false, length = 20)
	private String firstName;
	
	@Column(name = "lastName", nullable = false, length = 20)
	private String lastName;

	@OneToOne
	private Employee employee;

	public User() {
	}

	public User(String email, String password, String firstName,
				String lastName, Employee employee) {
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", employee=" + employee +
				'}';
	}
}
