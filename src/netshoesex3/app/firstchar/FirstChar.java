package netshoesex3.app.firstchar;

import java.util.LinkedHashSet;

import netshoesex3.app.stream.Stream;



public class FirstChar {
	
	
	public static char firstChar(Stream input){
		
		//using linked hash set to preserve insertion order and achieve good performance
		LinkedHashSet<Character> nonRepeatedChars = new LinkedHashSet<Character>();
		LinkedHashSet<Character> repeatedChars = new LinkedHashSet<Character>();
		
		while(input.hasNext()){
			char c = input.getNext();
			
			//char is already repeated
			if(repeatedChars.contains(c)) continue;
			
			//char is repeating for first time
			else if(nonRepeatedChars.contains(c)){
				nonRepeatedChars.remove(c);
				repeatedChars.add(c);
			}
			
			//char is new
			else{
				nonRepeatedChars.add(c);
			}
		}
		
		if(!nonRepeatedChars.isEmpty()){
			return nonRepeatedChars.iterator().next();
		}
		else{
			return '\0';
		}
	}
	
	
}
