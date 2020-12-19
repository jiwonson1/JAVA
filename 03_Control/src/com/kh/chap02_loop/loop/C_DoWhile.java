package com.kh.chap02_loop.loop;

public class C_DoWhile {
	
	/*
	 *  * do-while��
	 *  
	 *  �ʱ��;
	 *  
	 *  do {
	 *  	�ݺ������� ������ �ڵ�;	
	 *  	������;
	 *  
	 *  }while(���ǽ�);
	 *  
	 *  �ʱ�� --> "������ �ѹ��� ����" --> ������
	 *  ���ǽ� --> true�� ���� 	   --> ������
	 *  ���ǽ� --> false-------------------> ��������
	 *  
	 */
	
	public void method1() {
		int num = 1;
		
		/*
		while(num == 0) {
			System.out.println(num);
		}*/
		
		
		do {
			System.out.println(num);
			
		}while(num == 0);
		
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			
			//System.out.print(i + " ");
			//i++;
			System.out.print(i++ + " ");
			
		}while(i <= 5);
		
	}
	
	public void method3() {
		// 1���� ������(11 ~ 20) �����հ�
		
		int random = (int)(Math.random() * 10 + 11);
		
		// sum += 1
		// sum += 2
		// ..
		// sum += random
		
		int sum = 0;
		
		int i = 1;
		do {
			sum += i++;
		}while(i <= random);
		
		System.out.println("1���� " + random + "������ �հ� : " + sum);
		
	}
	
	

}




