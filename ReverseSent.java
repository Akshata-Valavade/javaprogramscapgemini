package com.edu;

public class ReverseSent {

	public static void main(String[] args) {
	String s = "Hello World";//World Hello
		String word[] = s.split(" ");
		
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+" ");
		}

	}

}
