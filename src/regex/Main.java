package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String text = "Hello World";
		String regex = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
		if(text.matches(regex)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
