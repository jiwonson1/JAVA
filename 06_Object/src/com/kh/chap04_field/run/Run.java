package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		
		// -------------- 1. FieldTest1 ----------
		/*
		FieldTest1 f1 = new FieldTest1(); // ��ü����
		f1.test(5); // �޼ҵ����
		*/
		
		// -------------- 2. FieldTest2 -----------
		/*
		FieldTest2 f2 = new FieldTest2();
		
		// �� �ʵ忡 ���� ���� �غ�����
		
		// public --> ��𼭵� ���� ����
		System.out.println(f2.pub);
		
		// protected --> ���� ��Ű�� �� + �ٸ� ��Ű���� ��� ��ӱ��� 
		//System.out.println(f2.pro);
		
		// default --> ���� ��Ű�� ��
		//System.out.println(f2.def);
		
		// private --> only �� Ŭ����������
		//System.out.println(f2.pri);
		*/
		
		// ------------------- 3. FiledTest3-------------
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		
		FieldTest3.sta = "FieldTest3";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.NUM);
		//FieldTest3.NUM = 2; // ���� �Ұ�
		
		
		
		System.out.println(Math.PI);
		
		//System.out.println(Math.random());
		//Math.min(10, 5);
		
		
		

	}

}


/*
 *  public class Ŭ������ {
 * 		�ʵ��
 * 
 *  	�����ں�
 *  
 *  	�޼ҵ��
 *  }
 * 
 */








