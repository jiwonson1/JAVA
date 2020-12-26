package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// �����ڸ� �̿��Ͽ� �ش� ���ڿ� �и� ��Ű�� ���
		
		// ���1. �и��� ���ڿ����� �迭�� ���������Ƽ� ó���ϰ� ���� �� 
		//		 String Ŭ������ �����ϴ� split �޼ҵ� �̿�
		//		  ���ڿ�.split(String ������) : String[]
		
		String[] arr = str.split(",");
		
		System.out.println("�и� �� ���ڿ��� ���� : " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "��° �ε��� : " + arr[i]);
		}
		*/
		for(String s : arr) { // s = arr[0]; -> s= arr[1]; 
			System.out.println(s);
		}
		
		
		// ���2. �и��� ������ ���ڿ����� ��ü�� ����ϰ� ���� �� 
		//       java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		//       StringTokenizer stn = new StringTokenizer(�и���Ű�����ϴ¹��ڿ�, ������);
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("�и� �� ���ڿ��� ���� : " + stn.countTokens());
		
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
		// i=3  i<3   false --> �ݺ��� ��������
		
		/*
		�ذ���1.
		int count = stn.countTokens(); // 6
		
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// �ذ���2
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
	
	}
	
	
	public void method2() {
		
		String colors = "red/yellow#green blue,orange";
		
		// split���
		String[] arr = colors.split("[/# ,]");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// StringTokenizer ���
		StringTokenizer stn = new StringTokenizer(colors, "/# ,");
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
	
}







