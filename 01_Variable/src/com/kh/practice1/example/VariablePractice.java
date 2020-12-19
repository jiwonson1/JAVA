package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	/**
	 * 실습문제1.
	 * 이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력받아 
	 * 각각의 값을 변수에 담고 출력하세요.
	 */
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자에게 값 입력받기
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // 버퍼 비워줘야됨!!
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0); //  "".charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		
		// 2. 결과 출력하기
		// "키 xxx인 xx살 x자 xxx님 반갑습니다^^"
		System.out.println("키 " + height + "인 " + age + "살 " 
						   + gender + "자 " + name + "님 반갑습니다^^");
		
	}
	
	/**
	 * 실습문제2.
	 * 키보드로 정수 두 개를 입력받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	 */
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자에게 값 입력받기
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// 2. 결과 출력하기
		// 산술 연산 순서 ( * /   >  + -  )
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + num1 * num2);
		System.out.println("나누기 몫 결과 : " + num1 / num2);
	}
	
	/**
	 * 실습문제3.
	 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	 */
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자에게 값 입력받기
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		// 2. 결과 출력하기
		/* 방법1
		double area = width * height; // 면적 결과값 보관
		double perimeter = (width + height) * 2; // 둘레 결과값 보관
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + perimeter);
		*/
		
		// 방법2
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width + height) * 2);
		
		
	}
	
	/**
	 * 실습문제4.
	 * 영어 문자열 값을 키보드로 입력 받아 앞의 문자 세 개를 출력하세요.
	 */
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자에게 값 입력받기
		System.out.print("적어도 3글자 이상의 문자열을 입력하세요 : ");
		String str = sc.nextLine(); // str = "apple";
		
		// 문자열.charAt(인덱스);
		
		// 2. 결과 출력하기
		/* 방법1
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);
		*/
		
		// 방법2.
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
	}

}



