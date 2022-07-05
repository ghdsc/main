package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> ss = new ArrayList<String>();
		 ss.add("ramu");
		 ss.add("vikram");
		 System.out.println(ss);
		 Iterator<String> iterator = ss.iterator();  
		  while(iterator.hasNext());
		  {
			  System.out.println(iterator.next()+"");
		  }
		    
		 

	}

}
