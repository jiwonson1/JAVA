package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 이용하여 해당 문자열 분리 시키는 방법
		
		// 방법1. 분리된 문자열들을 배열로 차곡차곡담아서 처리하고 싶을 때 
		//		 String 클래스에 제공하는 split 메소드 이용
		//		  문자열.split(String 구분자) : String[]
		
		String[] arr = str.split(",");
		
		System.out.println("분리 후 문자열의 갯수 : " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		*/
		for(String s : arr) { // s = arr[0]; -> s= arr[1]; 
			System.out.println(s);
		}
		
		
		// 방법2. 분리된 각각의 문자열들을 객체로 취급하고 싶을 때 
		//       java.util.StringTokenizer 클래스를 이용하는 방법
		//       StringTokenizer stn = new StringTokenizer(분리시키고자하는문자열, 구분자);
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리 후 문자열의 갯수 : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println(stn.countTokens());
		*/
		
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// i=0  i<6   true  syso("JAVA");   i++
		// i=1  i<5   true  syso("Oracle"); i++
		// i=2  i<4   true  syso("JDBC");   i++
		// i=3  i<3   false --> 반복문 빠져나옴
		
		/*
		해결방법1.
		int count = stn.countTokens(); // 6
		
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법2
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
	
	}
	
	
	public void method2() {
		
		String colors = "red/yellow#green blue,orange";
		
		// split방법
		String[] arr = colors.split("[/# ,]");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// StringTokenizer 방법
		StringTokenizer stn = new StringTokenizer(colors, "/# ,");
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
	
}







