/* 
 * File name: Student.java
 * Author: Cheng Qian, 041167176
 * Course: CST8284 - Object Oriented Programming (Java)
 * Assignment: Assignment 2
 * Date: November 15, 2024
 * Professor: Moshiur Rahman
 * Purpose: This file contains the StudentManager class that builds an ArrayList of students.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
	private List<Student> students;
	
	public StudentManager() {
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void sortStudents() {
		Collections.sort(students);
	}
	
	public void displayStudents() {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}
