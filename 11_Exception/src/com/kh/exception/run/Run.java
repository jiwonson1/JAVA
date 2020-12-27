package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.CheckedException;
import com.kh.exception.controller.UnCheckedException;

public class Run {

	public static void main(String[] args) throws IOException {
		
		// �������� ����
		// ���ܶ� ����
		// ����ó���� �� �ؾ߸� �ϴ���
		// ����ó���� �ϴ� ���
		
		/*
		 *  * ���� ����
		 *  - �ý��� ���� : ��ǻ���� ���۵����� �߻��ϴ� ���� --> �ҽ��ڵ�� �ذ�ȵ� --> �ɰ��� ����
		 *  - ������ ���� : �ҽ��ڵ� ������ ���� --> �����ٷ� ���ʿ� �˷��� 
		 *  - ��Ÿ�� ���� : �ڵ� �����δ� ������ ���µ� ���α׷� ������ �� �߻��ϴ� ���� (������� �Ǽ��� ���� �ְ� �����ڰ� ���������� ��츦 ����� ó������ )
		 *  
		 *  - �� ���� : ���������ε� �������� �������� ���� ���� �������� ������ ���α׷� �ǵ��� ���� �ʴ� ��
		 *  
		 *  * �츮�� �ý��� ������ ������ �����Ͽ���, ��Ÿ�ӿ���, �������� ���� ���� �� �ɰ��� �͵��� ������ �۾� 
		 *    => �̷��͵��� "����"��� �Ѵ�. --> Exception
		 *    
		 *  * �̷� ���ܵ��� "�߻�"���� ��쿡 ���ؼ� "ó��"�ϴ� ���	=> "����ó��"
		 *  
		 *  * "����ó��"�� ���س����� �ش� ���� �߻��� ���α׷��� �� ���������� ����ǹ���
		 *  
		 */
		
		
		UnCheckedException ex1 = new UnCheckedException();
		//ex1.method1();
		//ex1.method2();
		
		
		CheckedException ex2 = new CheckedException();
		/*
		try {
			ex2.method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		ex2.method1(); // ���⼭ ������ ���ѱ�� �Ǹ� �ᱹ�� JVM�� ó�����ֱ� ��..
		

	}

}





