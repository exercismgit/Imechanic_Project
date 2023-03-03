package com.project.Imechanic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
private String fullname;
private String email;
private String password;
private long phone;
private String vehiclemodel;
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
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
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getVehiclemodel() {
	return vehiclemodel;
}
public void setVehiclemodel(String vehiclemodel) {
	this.vehiclemodel = vehiclemodel;
}
@Override
public String toString() {
	return "User [fullname=" + fullname + ", email=" + email + ", password=" + password + ", phone=" + phone
			+ ", vehiclemodel=" + vehiclemodel + "]";
}

}
