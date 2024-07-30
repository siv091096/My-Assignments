package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesOfArrayUsingSet {

	public static void main(String[] args) {
		
		
		//Declaring an Array		
		String companyName = "google";
		
		//Converting String to Array
		companyName.toCharArray();
		
		//Storing the length of the Array
		int length = companyName.length();
		
		//Creating a LinkedHashSet to store Array
		Set<Character> uniqueCharacter = new LinkedHashSet<Character>();
		
		//Iterating the each character of the companyName in for loop	
		for (int i = 0; i < length; i++) {		
			uniqueCharacter.add(companyName.charAt(i));
			
		}
		
		//Printing the Unique Characters		
		System.out.println("The unique characters are: "+uniqueCharacter);

	}

}
