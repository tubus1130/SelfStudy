package chapter08;

import java.util.Objects;

public class Student {
	String name;
	String address;
	String phone;
	String email;
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	public String toString() {
		return name + " " + address + " " + phone + " " + email;
	}
}
