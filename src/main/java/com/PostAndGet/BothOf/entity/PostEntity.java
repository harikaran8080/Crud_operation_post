package com.PostAndGet.BothOf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "crudOperation")
@Data
@Getter
@Setter
public class PostEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;

	@Column(name = "Name")
	private String name;
	@Column(name = "Age")
	private int age;
	@Column(name = "Roll")
	private String roll;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

}
