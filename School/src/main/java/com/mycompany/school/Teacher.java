/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author vpont
 */
public class Teacher {
    private String firstName;
	private String lastName;
	private String AMKA;
	private String lesson;
	
	public String getFirstName() {	
			return firstName;
		}
	
	public String getLastName() {			
			return lastName;
		}
		
	public String getAMKA() {	
			return AMKA;
		}
	
	public String getLesson() {			
			return lesson;
		}
		
	public void setFirstName(String x) {		
			firstName = x;
		}
	
	public void setLaststName(String y) {			
			lastName = y;
		}
	
	public void setAMKA(String number) {			
			AMKA = number;
		}
	
	public void setLesson(String a) {		
			lesson = a;
		}

	public void printAll() {
		System.out.println("Name of teacher is: "+this.getFirstName());
		System.out.println("Last name of teacher is: "+this.getLastName());
		System.out.println("AMKA is: "+this.getAMKA());
		System.out.println("Teaches:  "+this.getLesson());
	}
}
