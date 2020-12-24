package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.Product;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {
	
	public static void main(String[] args) {
		
		// Desktop��ü ����
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 1500000, true); 
		
		// Tv��ü ����
		Tv t = new Tv("LG", "t-01", "�̳�����Ƽ��", 3500000, 60);
		
		// SmartPhone ��ü ����
		SmartPhone s = new SmartPhone("����", "s-01", "������11pro", 1500000, "KT");
		
		
		Product p1 = new Desktop();
		Product p2 = new Tv();
		Product p3 = new SmartPhone();
		
		Product[] arr = new Product[3];
		arr[0] = new Desktop();
		arr[1] = new Tv();
		arr[2] = new SmartPhone();
		
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		
		/*
		 * * ����� ����
		 * - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
		 * - �ڵ带 ���������� �����ϱ� ������ �ڵ��� �߰��� ���濡 ����
		 * --> �ڵ��� �ߺ��� �����Ͽ� ���α׷��� ���꼺�̳� ���������� ũ�� �⿩
		 * 
		 * * ����� Ư¡
		 * - Ŭ�������� ����� ���߻���� �Ұ���! (���� ��Ӹ� ����)
		 * - �θ��� private ���������ڷ� ����Ǿ��մ� ��� �ƹ��� ��ӱ������ �ؼ� ���� ���� �Ұ�
		 *   (��, protected�� �ϰ� �Ǹ� �ڽĿ��� ���� ���ٰ���!)
		 * - ��õǾ����� ������ ��� Ŭ������ Object Ŭ������ �ļ��̴�!! 
		 *   --> ObjectŬ�������� �����ϴ� �޼ҵ�� �󸶵��� ���� ���� �ִ�. 
		 *   --> ���� �ȵ�� �� �Ը���� ������(�������̵�) �����ϴ�
		 * 
		 */
		
		
		
	}

}
