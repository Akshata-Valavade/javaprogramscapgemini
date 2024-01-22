package com.edu;

public class SplitDemo {

	public static void main(String[] args) {
		int count=0;
		String s = "I Am in Amsterdam am I?";
		String str[] = s.split(" ");
		System.out.println(str);
		
//		for(int i=0;i<str.length;i++) {
//			System.out.println(str[i]);
//		}
		
		for(String i:str) {
			if(i.equalsIgnoreCase("Am")) {
				count++;
			}
		}
		System.out.println(count);

	}

}
