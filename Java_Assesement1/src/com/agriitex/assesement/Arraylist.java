


package com.agriitex.assesement;

import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {

	private static Student details;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> studentList = new ArrayList<>();
		Student s1 = new Student(10, "Aryan", 15, 60, 'M');
		studentList.add(s1);

		Student s2 = new Student(11, "john", 16, 13, 'M');
		studentList.add(s2);

		Student s3 = new Student(12, "marry", 14, 100, 'F');
		studentList.add(s3);

		Student s4 = new Student(12, "marry", 14, 100, 'F');
		studentList.add(s4);

		int maleStudentsCount = 0;
		int femaleStudentsCount = 0;

		for (Student details : studentList) {
			char gender = details.getSgender();
			if (gender == 'M') {
				maleStudentsCount++;
			}
			if (gender == 'F') {
				femaleStudentsCount++;
				
				
				
			}
		}

		System.out.println("Male students count : " + maleStudentsCount);
		System.out.println("Female students count : " + femaleStudentsCount);

		int sum = 0;
		for (Student details : studentList) {
			sum += details.getSmarks();
		}

		System.out.println("Sum  : " + sum);
		System.out.println("Avg  : " + sum / studentList.size());

		int marks = 0;

		for (Student details : studentList) {
			marks = details.getSmarks();
		}
	}
}
