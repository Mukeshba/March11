package com.problemsolving;
import java.util.LinkedHashMap;
import java.util.Map;
public class occuranceword {

	public static void main(String[] args) {
		
		String str = "an the an from from from dhoni kholi a kaththi thuppaki";
	     
	    String[] split =     str.split(" ");
	    
	    Map<String, Integer> mp = new LinkedHashMap<>();
	    
	    for(String s : split){
	        
	        if(mp.containsKey(s)){
	            
	            int i = mp.get(s);
	            
	            mp.put(s,i+1);
	            
	            
	            
	        }
	        
	        else{
	            
	            mp.put(s,1);
	            
	        }
	        
	    }
	System.out.println(mp);
		
	}
	 
	
}


