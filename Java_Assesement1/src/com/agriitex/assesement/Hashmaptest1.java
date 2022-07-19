package com.agriitex.assesement;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmaptest1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String, Student> studentMap = new HashMap<>();
	
	Student s1=new Student(10, "Aryan", 15, 60, 'M');
	studentMap.put("Rama", s1);
	Student s2=new Student(11, "John",16, 30, 'M');
	studentMap.put("john", s2);
	Student s3=new Student(12, "Marry",14 ,100 ,'F');
	studentMap.put("Marry", s3);
	Student s4=new Student(13,"David",17,355,'M');
	studentMap.put("David",s4);
	Student s5=new Student(14, "Devika", 18, 40 ,'F');
	studentMap.put("Devika", s5);
	Set<Entry<String, Student>> entry=studentMap.entrySet();
	
	for(Entry<String, Student> name :entry ) 
	
	{	
		System.out.println("Student details : " + name);
		
		
		
		
	
	}

	Passmarks pm = new Passmarks();
	pm.studentpass(studentMap);
		
    
            
           

	}
}

