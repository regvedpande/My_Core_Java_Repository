// Package declaration: Organizes code for better maintainability
package com.mkpits.datatype;

// Class declaration: Defines a blueprint for creating objects
// This class represents a student
public class JavaObjectExamples {

	// Object attributes (also called fields or variables):
	// Store the student's data
	public String name; // Student's name
	public int id; // Student's identification number
	public double grade; // Student's grade point average

	// Object methods: Define actions the student can perform

	// Introduces the student with their information
	public void introduce() {
		System.out.println("My name is " + name + ", my ID is " + id + ", and my grade is " + grade);
	}

	// Simulates the student studying a specific subject
	public void study(String subject) {
		System.out.println("I am studying " + subject);
	}

	// Simulates the student taking an exam in a specific subject
	public void takeExam(String subject) {
		System.out.println("I am taking an exam in " + subject);
	}
}
