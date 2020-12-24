package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {
	
	
	public static void main(String[] args) {
		
		
		// ��ǰ��ü
		
		// 1. ������ ��������� ��  (ElectronicController1)
		/*
		ElectronicController1 ec1 = new ElectronicController1();
		
		// ���ο� Desktop��ü, NoteBook��ü, Tablet��ü��
		// �����Ҳ���
		ec1.insert(new Desktop("�Ｚ", "��ž", 1200000, "Geforce1070"));
		ec1.insert(new NoteBook("����", "�׷�", 1800000, 3));
		ec1.insert(new Tablet("����", "�����е�pro", 2000000, true));
		
		// ���Կ� �ִ� ���ǵ��� ������ ��ȸ
		Desktop d = ec1.selectDesktop();
		NoteBook n = ec1.selectNoteBook();
		Tablet t = ec1.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 2. ������ �������� �� (ElectronicController2)
		ElectronicController2 ec2 = new ElectronicController2();
		
		// Desktop,NoteBook,Tablet ��ü ����
		ec2.insert(new Desktop("�Ｚ", "��ž", 1200000, "Geforce1070"));
		ec2.insert(new NoteBook("����", "�׷�", 1800000, 3));
		ec2.insert(new Tablet("����", "�����е�pro", 2000000, true));
		
		/*
		Electronic d = ec2.select(0); // Desktop ��ü �˾Ƴ���
		Electronic n = ec2.select(1); // NoteBook ��ü �˾Ƴ���
		Electronic t = ec2.select(2); // Tablet��ü �˾Ƴ���
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		Electronic[] elec = ec2.select();
		
		/*
		for(int i=0; i<elec.length; i++) {
			System.out.println(elec[i]);
		}
		*/
		for(Electronic e : elec) {
			// e = elec[0]; --> e = elec[1]; --> e = elec[2];
			System.out.println(e);
		}
		
		/*
		 * * ������ ���� ����
		 * 1. �θ�Ÿ�Ը����� �پ��� �ڽİ�ü�� ���� ���� (��ü�迭)
		 * 2. �Ű����� �������� �����ϴ� ��� �޼ҵ� ���� Ȯ �پ�� 
		 */
		
		
		
	}

}




