package com.kh.first;		// ��Ű�� ����� : �ش� Ŭ������ ���Ű���� �����ִ���

public class A_MethodPrinter { // Ŭ�������� �빮�ڷ� ����!
	
	// ��� ���� == �޼ҵ�
	// Ŭ�������� ������ ���� �޼ҵ带 ������ �ʿ����!
	
	// �Ϲݸ޼ҵ� : public void �޼ҵ��() { }
	public void methodA() { // �޼ҵ���� �ҹ��ڷ� ����!
		System.out.println("methodA ȣ��Ǿ����!!");
		methodB(); // ���� Ŭ���� �� �޼ҵ� ȣ��� �ٷ� �׳� �޼ҵ��();
	}
	
	public void methodB() {
		System.out.println("methodB ȣ��Ǿ����!!");
		methodC();
	}
	
	public void methodC() {
		System.out.println("methodC ȣ��Ǿ����!!");
		//methodA();
	}

}




