package com.kh.chap02_abstractAndinterface.part01_abstract.run;

import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.BasketBall;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.FootBall;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * * �߻�Ŭ���� 
		 * - �̿ϼ�Ŭ����
		 * - ��ü ���� �Ұ�!! (��, ���۷��� Ÿ�����δ� ��� ����)
		 * - �Ϲ��ʵ� + �Ϲݸ޼ҵ� + [�߻�޼ҵ�]
		 *   --> �߻�޼ҵ带 ���� Ŭ������ �ݵ�� �߻�Ŭ������ ����ؾߵ�
		 *   --> �߻�޼ҵ尡 ���� ��� �߻�Ŭ������ ����°� ����!!
		 *       ����? --> Ŭ������ �����ϱ� ������ �� Ŭ������ ��ü���� �Ұ��ϰԲ� �س����� �Ѵٸ�
		 *       
		 * * �߻�޼ҵ�
		 * - �̿ϼ��� �޼ҵ�� ����� ({})�� �����Ǿ����� �ʴ� �޼ҵ�
		 * - �߻�޼ҵ尡 ����� �߻�Ŭ������ ��ӹ޴� �ڽ�Ŭ�������� �ݵ�� �������̵� �ؾߵ�
		 *   --> �������̵� ���� ������ ���� �߻�
		 *   --> �޼ҵ� ����� ���ϼ� Ȯ�� ����
		 * 
		 */
		
		// �߻�Ŭ����(�̿ϼ��� Ŭ����)�� ��ü ���� �Ұ�
		//Sports s = new Sports();
		
		// ��, ���۷���Ÿ�����δ� �������
		// ���������δ� ���밡�� 
		//Sports s = new BasketBall();
		Sports[] arr = new Sports[2];
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		

	}

}




