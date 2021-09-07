package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("abc[.]*");
		Matcher matcher = pattern.matcher("abc@ d");
		
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		} 
		else {
			System.out.println("Match not found");
		}
	}

}
