package com.java;

//Write a Java program to find sequences of lowercase letters joined with a underscore.
public class Sequence_Lower { // calss
	public static void main(String[] args) { // main method
		String str = "hello_world";
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '_') { // searching for '_'
				System.out.println("Found");
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("Not found");
	}
}
