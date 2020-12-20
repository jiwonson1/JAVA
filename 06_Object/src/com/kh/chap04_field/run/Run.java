package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		
		// -------------- 1. FieldTest1 ----------
		/*
		FieldTest1 f1 = new FieldTest1(); // 객체생성
		f1.test(5); // 메소드실행
		*/
		
		// -------------- 2. FieldTest2 -----------
		/*
		FieldTest2 f2 = new FieldTest2();
		
		// 각 필드에 직접 접근 해볼꺼임
		
		// public --> 어디서든 접근 가능
		System.out.println(f2.pub);
		
		// protected --> 같은 패키지 내 + 다른 패키지일 경우 상속구조 
		//System.out.println(f2.pro);
		
		// default --> 같은 패키지 내
		//System.out.println(f2.def);
		
		// private --> only 그 클래스에서만
		//System.out.println(f2.pri);
		*/
		
		// ------------------- 3. FiledTest3-------------
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		
		FieldTest3.sta = "FieldTest3";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.NUM);
		//FieldTest3.NUM = 2; // 변경 불가
		
		
		
		System.out.println(Math.PI);
		
		//System.out.println(Math.random());
		//Math.min(10, 5);
		
		
		

	}

}


/*
 *  public class 클래스명 {
 * 		필드부
 * 
 *  	생성자부
 *  
 *  	메소드부
 *  }
 * 
 */








