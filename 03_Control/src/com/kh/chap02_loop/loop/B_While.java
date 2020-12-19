package com.kh.chap02_loop.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * * while��
	 * 
	 * �ʱ��;
	 * 
	 * while(���ǽ�) {
	 * 		�ݺ������� �����Ű�����ϴ� ����
	 * 		������;
	 * }
	 * 
	 */
	
	public void method1() {
		
		// �ȳ��ϼ��� 5�� ���
		
		int i = 1;
		
		while(i <= 5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		
		System.out.println(i);
		
		
		// 1 2 3 4 5
		
		i = 1;
		while(i < 6) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		// 5 4 3 2 1
		i = 5;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
	}
	
	public void method2() {
		// 1�������� 10������ Ȧ������ ���
		// 1 3 5 7 9
		
		int i = 1;
		
		while(i <= 10) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		
		i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i+=2;
		}
	}
	
	public void method3() {
		
		// 1�������� ������ ��(1~50)������ �հ�
		int random = (int)(Math.random() * 50 + 1);
		
		System.out.println("������ : " + random);
		
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			System.out.print(i + " ");
			sum += i;
			i++;
		}
		
		System.out.println("\n1���� " + random + "������ �հ� : " + sum);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		// ����ڿ��� ���ڿ� �Է¹��� �� 
		// 0�� ~ �������ε���(���ڿ��� ����-1)������ ���� ���� �� ���
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		/*
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		System.out.println(str.charAt(str.length()-1));
		*/
		
		int i = 0;
		
		while(i < str.length()) {
			
			System.out.println(str.charAt(i));
			
			i++;
		}
	}
	
	public void method5() {
		// ����ڰ� �Է��� �� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��(2 ~ 9) �Է� : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // �� �Է����� ���
			
			int i = 1;
			while(i <= 9) {
				
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				
				i++;
			}
			
		}else { // �߸��Է����� ���
			System.out.println("2~9������ ���ڸ� �Է��ؾߵ˴ϴ�.");
			
		}
		
	}
	
	
}







