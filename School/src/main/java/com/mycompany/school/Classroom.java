/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author vpont
 */
public class Classroom {
        private String classCode; // classroom code
	private String classDesc; // classroom description
	
	public String getClassCode() {
		
		return classCode;
	}
	
	public String getClassDesc() {
		
		return classDesc;
	}
	
	public void setClassCode(String code) {
		
		classCode = code;
	}
	
	public void setClassDesc(String desc) {
		
		classDesc = desc;
	}
	
	public void printAll() {
		System.out.println("Class is: "+this.getClassDesc());
		System.out.println("Class code is: "+this.getClassCode());
	}
}
