package com.problemsolving;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class occurancefromlist {
	
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(10,20,30,40,10,20,30,90,90);
		
		Map<Integer, Integer> mp = new LinkedHashMap<>();
		
		for (Integer in : li) {
			
			if (mp.containsKey(in)) {
				
				Integer inte = mp.get(in);
				
				mp.put(in, inte+1);
				
			} else {
				
				mp.put(in, 1);

			}
			
		}
		System.out.println(mp);
	}

}
