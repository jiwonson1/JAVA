package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest;

public class Run {

	public static void main(String[] args) {
		
		// "����Ʈ ��� ��Ʈ��" ������ ������ ����� �� ��!!
		
		// "����Ʈ ��Ʈ��" : �����͸� 1����Ʈ ������ �ۿ� ������ �Ұ��� ��� (���� ���.. 1����Ʈ�� �ѱ� ����..) 
		// "��� ��Ʈ��" : �ܺθ�ü�� ���������� ����Ǵ� ��δ�!!
		
		// "����Ʈ ��� ��Ʈ��" --> �ܺθ�ü�� �����ϰ� �� �ܺθ�ü�� ���������� ����� ��ο� �����͸� 1����Ʈ ������ �����ϰڴ�.!
		
		// XXXInputStream	: XXX��ü�κ��� �����͸� �Է¹޴� ��� (�ܺθ�ü�� ���� ������ �о���ڴ�.)
		// XXXOutputStream  : XXX��ü�� �����͸� ����ϴ� ��� (�ܺθ�ü�� �����͸� �������ڴ�. ����ϰڴ�)
		
		// File InputStream/OutputStream 		--> �ܺθ�ü�� ����!!
		// Audio InputStream/OutputStream		--> �ܺθ�ü�� �������ġ!!
		// Piped InputStream/OutputStream		--> �ܺθ�ü�� �Ǵٸ� ���α׷�!!
		
		FileByteTest fb = new FileByteTest();
		//fb.fileSave();
		fb.fileRead();
		
		//System.out.println((int)'��');
	}

}
