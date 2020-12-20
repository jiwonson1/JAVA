package com.kh.chap06_method.run;

import java.util.Arrays;

import com.kh.chap05_constructor.model.vo.User;
import com.kh.chap06_method.controller.MethodTest2;

public class Run {

	public static void main(String[] args) {
		
		// ------- 1. MethodTest1 -------
		/*
		MethodTest1 m1 = new MethodTest1();
		
		m1.method1();
		
		
		double random = m1.method2();
		System.out.println(random);
		
		System.out.println(m1.method2());
		
		m1.method3(10, 5);
		
		int minus = m1.method4(6, 3);
		System.out.println("»¬¼À°á°ú : " + minus);
		*/
		
		
		MethodTest2.method1();
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("È«±æµ¿");
		
		String str = MethodTest2.method4("°­º¸¶÷");
		System.out.println(str);
		
		int[] a = MethodTest2.test1();
		System.out.println(Arrays.toString(a));
		
		User b = MethodTest2.test2("aaa111", "pass11", "È«±æ³à");
		System.out.println(b.information());
		
		MethodTest2.test3(a);
		
		
		System.out.println(true);
		
	
	}

}






