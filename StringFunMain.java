package com.edu;

public class StringFunMain {

	public static void main(String[] args) {
		//isBlank, isEmpty, isNull
		
		String s1 = "";
		String s2 = " ";
		String s3 = null;
		
		if(s1.length()==0) {
			System.out.println("String is empty");
		}
		else {
			System.out.println("Not empty");
		}
		
		if(s2.isBlank()) {
			System.out.println("String is blank");
		}
		else {
			System.out.println("Not blank");
		}

	}

}
