package info5100.assignment3.MengzheZhang;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
	public static void main(String[] args) {
		String s = "  the   sky is blue  ";
		  s=reverseString(s);
		  System.out.print(s);
	}
	
public static String reverseString(String s) {
	s = s.trim();
	List<String>words = Arrays.asList(s.split("\\s+"));
	Collections.reverse(words);
	return String.join(" ", words);
}

}
