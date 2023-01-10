/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author vpont
 */
public class Lesson {
    private String lesson_Code; // Subject Code
	private String lesson_Desc; // Subject Description
	private String classroom; 
	
	public String getLessonCode() {	
		return lesson_Code;
	}
	
	public String getLessonDesc() {	
		return lesson_Desc;
	}
	
	public String getClassroom() {	
		return classroom;
	}
	
	public void setLessonCode(String number) {		
		lesson_Code = number;
	}
	
	public void setLessonDesc(String description) {		
		lesson_Desc = description;
	}
	
	public void setClassroom(String y) {		
		classroom = y;
	}
	
	public void printAll() {
		System.out.println("Lesson is: "+this.getLessonDesc());
		System.out.println("Code of lesson is: "+this.getLessonCode());
		System.out.println("for the class: "+this.getClassroom());
	}
    
}
