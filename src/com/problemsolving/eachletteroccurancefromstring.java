package com.problemsolving;

import java.util.LinkedHashMap;
import java.util.Map;

public class eachletteroccurancefromstring {

	public static void main(String[] args) {

		String s = "World's best is MS Dhoni";

		String str = s.replace(" ", "");

		System.out.println("After String replaced is " + str);

		Map<Character, Integer> m = new LinkedHashMap();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (m.containsKey(ch)) {

				int inte = m.get(ch);

				m.put(ch, inte+1);

			} else {
				
				m.put(ch, 1);

			}

		}
		
		System.out.println(m);

	}

}
