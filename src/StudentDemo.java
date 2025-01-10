/* 
 * File name: Student.java
 * Author: Cheng Qian, 041167176
 * Course: CST8284 - Object Oriented Programming (Java)
 * Assignment: Assignment 2
 * Date: November 15, 2024
 * Professor: Moshiur Rahman
 * Purpose: This file contains the main class used for demo.
 */

import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
		// Instantiate four Student objects with different values
		Student s1 = new Student("Alice", 1, "alice@example.com", 3.6);
		Student s2 = new Student("Bob", 3, "bob@example.com", 3.8);
        Student s3 = new Student("Charlie", 2, "charlie@example.com", 3.2);
        Student s4 = new Student("Diana", 4, "diana@example.com", 3.9);
		
		// Store student objects in an array
		Student[] studentArray = {s1, s2, s3, s4};
		
		// Store student objects in the ArrayList
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(s1);
		studentManager.addStudent(s2);
		studentManager.addStudent(s3);
		studentManager.addStudent(s4);
		
		// Print the contents of the array before sorting
		System.out.println("Array before sorting:");
		for (Student s : studentArray) {
			System.out.println(s.toString());
		}
		System.out.println();
		
		// Sort the array using the Arrays.sort() method
		Arrays.sort(studentArray);

		// Print the contents of the array after sorting
		System.out.println("Array after sorting:");
		for (Student s : studentArray) {
			System.out.println(s.toString());
		}
		System.out.println();
		
		// Print the contents of the ArrayList before sorting
		System.out.println("ArrayList before sorting:");
		studentManager.displayStudents();
		System.out.println();
		
		// Sort the ArrayList using the StudentManager class
		studentManager.sortStudents();

		// Print the contents of the ArrayList after sorting
		System.out.println("ArrayList after sorting:");
		studentManager.displayStudents();
		System.out.println();
	}

}
