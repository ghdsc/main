package com.agriitex.assesement;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Passmarks {

	// TODO Auto-generated method stub
	public void studentpass(HashMap<String,Student>studentMap)
		
		
		{
			
		int count =0;
		
		
		
		
	Set<Entry<String, Student>>	s1=studentMap.entrySet();
		for(Entry<String,Student>entry:s1) {
			System.out.println("value is:"+entry.getValue());
		
			if(entry.getValue().getSmarks()>35)
			{
				System.out.println("pass");}
			else
			{System.out.println("fail");
		}

	}
		}

}
