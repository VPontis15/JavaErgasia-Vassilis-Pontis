/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

import java.util.ArrayList;

/**
 *
 * @author vpont
 */
public class Student {
    private String firstName;
    private String lastName;
    private String  AM;
    ArrayList<String> lesson = new ArrayList<String>();
    
    public String getFirstName(){
        return firstName;
    }  
    
    public String getLastName(){
        return lastName;
    }
    
    public String getAM(){
        return AM;
    }
    
    public String getLesson(){
        return lesson.toString();
    }
    
    public void  setFirstName(String name){
        firstName = name;
    }
    
    public void setLastName(String last_name){
        lastName = last_name;
    }
    
    public void setAM(String number){
        AM = number;
    }
    
    public void setLesson(String x) {
		
		lesson.add(x);
	}
    
    public void printAll(){
        System.out.println("First name is: "+ this.getFirstName() );
        System.out.println("Last name is: "+ this.getLastName());
        System.out.println("AM is: " + this.getAM());
        System.out.println("Lessons are: "+this.getLesson());
    }
}
