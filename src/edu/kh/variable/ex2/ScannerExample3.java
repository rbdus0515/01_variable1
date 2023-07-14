package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 문자열 (String) 입력
		// 문자열 3번 입력받아 한줄로 출력하기
		
		// EX)
		// 입력 1 : 안녕?
		// 입력 2 : 반가워!
		// 입력 3 : 점심 뭐 먹을래?
		// 안녕? 반가워! 점심 뭐 먹을래?
		
		// sc.next() = 다음 입력된 한 단어를 읽어옴.
		
		System.out.print("입력 1 : ");
		
		String st1 = sc.next();
		
		System.out.print("입력 2 : ");
		
		String st2 = sc.next();
		
		System.out.print("입력 3 : ");
		
		String st3 = sc.next();
		
		System.out.printf("%s %s %s\n" , st1 , st2 , st3);
		
		// 숫자써도 가능
		// 입력한 숫자는 문자열로 인식함.
		
	}

}
