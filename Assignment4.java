package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Assignment4 {
	
	public static void main(String[] args) {
		int[] a = {1,2,71, 23, 6, 7, 7, 8, 9, 9, 9, 10, 10, 10, 10,12};
		removeDuplicates(a);
		System.out.println(Arrays.toString(removeDuplicates(a)));
		
		System.out.println(removeDuplicateChars("gjtxdsabccddd"));
	}
	
	
	
	//Write a method that will remove all duplicates from string 
    //removeDuplicateChars("abcc"); -> "abc". Use Set Interface.
//	public static String removeDuplicateChars(String str) {

	public static String removeDuplicateChars(String str) {
		Set<String> j = new TreeSet<>();
		for(int i=0; i<str.length(); i++) {
			j.add(""+str.charAt(i));
		}
					
			return j.toString();
		    
		  }
	
		  /*
		   * Write a method to remove duplicates from array in Java, without using
		   * Collection classes e.g. Set or ArrayList. Algorithm for this
		   * method is simple, it first sorts the array and then compares adjacent
		   * objects, leaving out duplicates, which is already in the result.
		   */
		  public static int[] removeDuplicates(int[] numbersWithDuplicates) {
			  Arrays.sort(numbersWithDuplicates);
	int [] a = new int[numbersWithDuplicates.length];
	a[0] = numbersWithDuplicates[0];
		for(int i=0; i< numbersWithDuplicates.length-1; i++) {
			if(numbersWithDuplicates[i]!=numbersWithDuplicates[i+1]) {
				a[i+1]=numbersWithDuplicates[i+1];
			}else {
				continue;
			}
			
			
		}
		return a;
		}
	

}
