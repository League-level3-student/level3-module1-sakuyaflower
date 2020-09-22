package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> numbers = new ArrayList<String>();
		//2. Add five Strings to your list
numbers.add("hi");
numbers.add("wat");
numbers.add("ok");
numbers.add("something");
numbers.add("potato");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < numbers.size(); i++) {
			String s = numbers.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		
		
		//4. Print all the Strings using a for-each loop
		for(String s : numbers){
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i > numbers.size(); i ++) {
			if(numbers.size() % 2 == 0) {
			System.out.println(i);	
			}
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for(int i = 5; i < numbers.size(); i--) {
			System.out.println(i);
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
