/* 
 * File name: Student.java
 * Author: Cheng Qian, 041167176
 * Course: CST8284 - Object Oriented Programming (Java)
 * Assignment: Assignment 2
 * Date: November 15, 2024
 * Professor: Moshiur Rahman
 * Purpose: This file contains the Student class that implements Comparable<Student> as instructed.
 */

public class Student implements Comparable<Student> {
	private String name;
	private int id;
	private String email;
	private double grade;
	
	public Student(String name, int id, String email, double grade) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Student other) {
		return Double.compare(this.grade, other.grade);
	}
	
	@Override
	public String toString() {
		return String.format("Student{name='%s', id=%d, email='%s', grade=%.1f}", name, id, email, grade);
	}

}
