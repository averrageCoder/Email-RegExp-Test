package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^abc[A-Z0-9._%+-]*@bridgelabz[A-Z0-9._%+-]*",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("abc.xyz@bridgelabzdsd");
		
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		} 
		else {
			System.out.println("Match not found");
		}
	}

}
