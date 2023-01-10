/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.school;

/**
 *
 * @author vpont
 */
public class School {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.setFirstName("Vassilis");
		t1.setLaststName("Pontis");
		t1.setAMKA("546576333");
		t1.setLesson("C");
		t1.printAll();
		
		Teacher t2 = new Teacher();
		t2.setFirstName("a");
		t2.setLaststName("b");
		t2.setAMKA("05656767");
		t2.setLesson("Python");
		t2.printAll();
		
		Teacher t3 = new Teacher();
		t3.setFirstName("Jim");
		t3.setLaststName("Bam");
		t3.setAMKA("04080343129");
		t3.setLesson("Html");
		t3.printAll();
		
		Teacher t4 = new Teacher();
		t4.setFirstName("Manos");
		t4.setLaststName("Pap");
		t4.setAMKA("065982356");
		t4.setLesson("Javascript");
		t4.printAll();
		
		Teacher t5 = new Teacher();
		t5.setFirstName("Marios");
		t5.setLaststName("Spanos");
		t5.setAMKA("186567822");
		t5.setLesson("Ruby");
		t5.printAll();
		
		Classroom c1 = new Classroom();
		c1.setClassCode("E1");
		c1.setClassDesc("Ergastirio I");
		c1.printAll();
		
		Classroom c2 = new Classroom();
		c2.setClassCode("E2");
		c2.setClassDesc("Ergastirio II");
		c2.printAll();

		Classroom c3 = new Classroom();
		c3.setClassCode("E3");
		c3.setClassDesc("Ergastirio III");
		c3.printAll();
		
		Classroom c4 = new Classroom();
		c4.setClassCode("E4");
		c4.setClassDesc("Ergastirio 4");
		c4.printAll();
		
		Classroom c5 = new Classroom();
		c5.setClassCode("E5");
		c5.setClassDesc("Ergastirio 5");
		c5.printAll();
		
		Lesson l1 = new Lesson();
		l1.setLessonDesc("Algorithms and data structures in C");
		l1.setLessonCode("BB");
		l1.setClassroom("E4");
		l1.printAll();
		
		Lesson l2 = new Lesson();
		l2.setLessonDesc("Programming in C");
		l2.setLessonCode("C2");
		l2.setClassroom("E2");
		l2.printAll();
		
		Lesson l3 = new Lesson();
		l3.setLessonDesc("Starting with Javascript");
		l3.setLessonCode("S3");
		l3.setClassroom("E3");
		l3.printAll();
		
		Lesson l4 = new Lesson();
		l4.setLessonDesc("Data structures with Python");
		l4.setLessonCode("D4");
		l4.setClassroom("E1");
		l4.printAll();
		
		Lesson l5 = new Lesson();
		l5.setLessonDesc("Machine Learning");
		l5.setLessonCode("M5");
		l5.setClassroom("E5");
		l5.printAll();
		
	
		Student m1 = new Student();
		m1.setFirstName("a");
		m1.setLastName("b");
		m1.setAM("14235678");
		m1.setLesson("Algorithms and data structures in C");
		m1.setLesson("Data structures with Python");
		m1.setLesson("Starting with Javascript");
		m1.setLesson("Data structures with Python");
		m1.setLesson("Machine Learning");
		m1.printAll();
		
		Student m2 = new Student();
		m2.setFirstName("c");
		m2.setLastName("d");
		m2.setAM("14235678");
		m2.setLesson("Algorithms and data structures in C");
		m2.setLesson("Data structures with Python");
		m2.setLesson("Starting with Javascript");
		m2.setLesson("Data structures with Python");
		m2.setLesson("Machine Learning");
		m2.printAll();
		
		Student m3 = new Student();
		m3.setFirstName("e");
		m3.setLastName("f");
		m3.setAM("14235678");
		m3.setLesson("Algorithms and data structures in C");
		m3.setLesson("Data structures with Python");
		m3.setLesson("Starting with Javascript");
		m3.setLesson("Data structures with Python");
		m3.setLesson("Machine Learning");
		m3.printAll();
                
                Student m4 = new Student();
		m4.setFirstName("e");
		m4.setLastName("f");
		m4.setAM("14235678");
		m4.setLesson("Algorithms and data structures in C");
		m4.setLesson("Data structures with Python");
		m4.setLesson("Starting with Javascript");
		m4.setLesson("Data structures with Python");
		m4.setLesson("Machine Learning");
		m4.printAll();
            
		
		Student m5 = new Student();
		m5.setFirstName("e");
		m5.setLastName("f");
		m5.setAM("14235678");
		m5.setLesson("Algorithms and data structures in C");
		m5.setLesson("Data structures with Python");
		m5.setLesson("Starting with Javascript");
		m5.setLesson("Data structures with Python");
		m5.setLesson("Machine Learning");
		m5.printAll();
		
		Student m6 = new Student();
		m6.setFirstName("e");
		m6.setLastName("f");
		m6.setAM("14235678");
		m6.setLesson("Algorithms and data structures in C");
		m6.setLesson("Data structures with Python");
		m6.setLesson("Starting with Javascript");
		m6.setLesson("Data structures with Python");
		m6.setLesson("Machine Learning");
		m6.printAll();
		
		Student m7 = new Student();
		m7.setFirstName("e");
		m7.setLastName("f");
		m7.setAM("14235678");
		m7.setLesson("Algorithms and data structures in C");
		m7.setLesson("Data structures with Python");
		m7.setLesson("Starting with Javascript");
		m7.setLesson("Data structures with Python");
		m7.setLesson("Machine Learning");
		m7.printAll();
		
		Student m8 = new Student();
		m8.setFirstName("e");
		m8.setLastName("f");
		m8.setAM("14235678");
		m8.setLesson("Algorithms and data structures in C");
		m8.setLesson("Data structures with Python");
		m8.setLesson("Starting with Javascript");
		m8.setLesson("Data structures with Python");
		m8.setLesson("Machine Learning");
		m8.printAll();
		
		Student m9 = new Student();
		m9.setFirstName("e");
		m9.setLastName("f");
		m9.setAM("14235678");
		m9.setLesson("Algorithms and data structures in C");
		m9.setLesson("Data structures with Python");
		m9.setLesson("Starting with Javascript");
		m9.setLesson("Data structures with Python");
		m9.setLesson("Machine Learning");
		m9.printAll();
		
		Student m10 = new Student();
		m10.setFirstName("e");
		m10.setLastName("f");
		m10.setAM("14235678");
		m10.setLesson("Algorithms and data structures in C");
		m10.setLesson("Data structures with Python");
		m10.setLesson("Starting with Javascript");
		m10.setLesson("Data structures with Python");
		m10.setLesson("Machine Learning");
		m10.printAll();
		
		Student m11 = new Student();
		m11.setFirstName("a");
		m11.setLastName("b");
		m11.setAM("14235678");
		m11.setLesson("Algorithms and data structures in C");
		m11.setLesson("Data structures with Python");
		m11.setLesson("Starting with Javascript");
		m11.setLesson("Data structures with Python");
		m11.setLesson("Machine Learning");
		m11.printAll();
		
		Student m12 = new Student();
		m12.setFirstName("a");
		m12.setLastName("b");
		m12.setAM("14235678");
		m12.setLesson("Algorithms and data structures in C");
		m12.setLesson("Data structures with Python");
		m12.setLesson("Starting with Javascript");
		m12.setLesson("Data structures with Python");
		m12.setLesson("Machine Learning");
		m12.printAll();
		
		Student m13 = new Student();
		m13.setFirstName("a");
		m13.setLastName("b");
		m13.setAM("14235678");
		m13.setLesson("Algorithms and data structures in C");
		m13.setLesson("Data structures with Python");
		m13.setLesson("Starting with Javascript");
		m3.setLesson("Data structures with Python");
		m13.setLesson("Machine Learning");
		m13.printAll();
		
		Student m14 = new Student();
		m14.setFirstName("a");
		m14.setLastName("b");
		m14.setAM("14235678");
		m14.setLesson("Algorithms and data structures in C");
		m14.setLesson("Data structures with Python");
		m14.setLesson("Starting with Javascript");
		m14.setLesson("Data structures with Python");
		m14.setLesson("Machine Learning");
		m14.printAll();	
                
		Student m15 = new Student();
		m15.setFirstName("a");
		m15.setLastName("b");
		m15.setAM("14235678");
		m15.setLesson("Algorithms and data structures in C");
		m15.setLesson("Data structures with Python");
		m15.setLesson("Starting with Javascript");
		m15.setLesson("Data structures with Python");
		m15.setLesson("Machine Learning");
		m15.printAll();
		
		Student m16 = new Student();
		m16.setFirstName("a");
		m16.setLastName("b");
		m16.setAM("14235678");
		m16.setLesson("Algorithms and data structures in C");
		m16.setLesson("Data structures with Python");
		m16.setLesson("Starting with Javascript");
		m16.setLesson("Data structures with Python");
		m16.setLesson("Machine Learning");
		m16.printAll();
		
		Student m17 = new Student();
		m17.setFirstName("a");
		m17.setLastName("b");
		m17.setAM("14235678");
		m17.setLesson("Algorithms and data structures in C");
		m17.setLesson("Data structures with Python");
		m17.setLesson("Starting with Javascript");
		m7.setLesson("Data structures with Python");
		m17.setLesson("Machine Learning");
		m17.printAll();
		
		Student m18 = new Student();
		m18.setFirstName("a");
		m18.setLastName("b");
		m18.setAM("14235678");
		m18.setLesson("Algorithms and data structures in C");
		m18.setLesson("Data structures with Python");
		m18.setLesson("Starting with Javascript");
		m18.setLesson("Data structures with Python");
		m18.setLesson("Machine Learning");
		m18.printAll();
		
		Student m19 = new Student();
		m19.setFirstName("a");
		m19.setLastName("b");
		m19.setAM("14235678");
		m19.setLesson("Algorithms and data structures in C");
		m19.setLesson("Data structures with Python");
		m19.setLesson("Starting with Javascript");
		m19.setLesson("Data structures with Python");
		m19.setLesson("Machine Learning");
		m19.printAll();
		
		Student m20 = new Student();
		m20.setFirstName("a");
		m20.setLastName("b");
		m20.setAM("14235678");
		m20.setLesson("Algorithms and data structures in C");
		m20.setLesson("Data structures with Python");
		m20.setLesson("Starting with Javascript");
		m20.setLesson("Data structures with Python");
		m20.setLesson("Machine Learning");
		m20.printAll();
		

	}

}