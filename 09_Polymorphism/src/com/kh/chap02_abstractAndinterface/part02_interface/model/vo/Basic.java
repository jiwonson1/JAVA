package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public interface Basic {
	
	// �߻�Ŭ���� --> �Ϲ��ʵ� + �Ϲݸ޼ҵ�  + [�߻�޼ҵ�]
	// �������̽� --> only ���(public static final)�ʵ� + �߻�޼ҵ�
	
	// �������̽������� �ʵ�� ������ ����ʵ��̱� ������ ��������
	/*public static final*/ int NUM = 10;
	
	// �������̽������� �޼ҵ�� ������ �߻�޼ҵ��̱� ������ ��������
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();

}
