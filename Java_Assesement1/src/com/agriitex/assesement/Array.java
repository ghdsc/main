package com.agriitex.assesement;

class Array {
	public static void main(String[]args) {
		
	 double[] values = { 40, 55, 63, 17, 22, 68, 89, 97, 89 };

	        double sum=0;
	        for(double element:values)
	        {
	        	sum += element;
	        }
     System.out.println(sum);
		double average = 0;
		if(values.length>0) {
			average = sum/values.length;
		}
		System.out.println(average);
		    for(int i = 0;i<values.length;i++) {
		       
		    if(values[i]%2!=0) {
		    	System.out.println( "even numer:" +values[i] +" ");
		    }
	}

	}
}
	            	  
	              
		
		
		
		
	
