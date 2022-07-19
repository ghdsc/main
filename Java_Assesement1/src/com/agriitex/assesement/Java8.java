package com.agriitex.assesement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Java8 {

	public static void main(String[] args) {

		ArrayList<String> l1=new ArrayList<>();
		l1.add("simth");
		l1.add("joshnon");
		l1.add("williams");
		l1.add("Brown");
		l1.add("jones");
		l1.add("Wiiiams");
		l1.add("Brown");
		for(String fruit:l1) {
			System.out.println(l1.size());
       Set<String> ss=new HashSet<>(l1);
    		  
    
     for(String fruit1:ss) {
     System.out.println(ss);
     System.out.println(ss.size());
     ss.remove(0);
     System.out.println(ss);
			
		}

	}

}
}