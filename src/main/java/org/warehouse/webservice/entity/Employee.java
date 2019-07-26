package org.warehouse.webservice.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "EmployeeID")
	private Integer id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Address")
	private String Address;

	@Column(name = "Phone")
	private String Phone;
	
	@Column(name = "Email")
	private String Email;

	@Column(name = "Username")
	private String Username;

	@Column(name = "Password")
	private String Password;
	
	@Column(name = "Admin")
	private Integer Admin;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String Address) {
		this.Address = Address;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String Phone) {
		this.Phone = Phone;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String Email) {
		this.Email = Email;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String Username) {
		this.Username = Username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String Password) {
		this.Password = Password;
	}


	public Integer getAdmin() {
		return Admin;
	}


	public void setAdmin(Integer Admin) {
		this.Admin = Admin;
	}
}