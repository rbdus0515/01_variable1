package edu.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		System.out.printf("%s unicode : %d" , ch , (int)ch);
		
	}
	
}
