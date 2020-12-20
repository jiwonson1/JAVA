package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	 *  �迭 : �������� ���� ������ �� �ִ� ���� (��, ���� �ڷ����� �ش��ϴ� ���鸸 ����)
	 *        ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	 *        �� �ε����� �ڸ��� ���� ���! (�ε����� �׻� 0���� ����)
	 */
	
	public void method1() {
		// * �迭�� �־����� (�迭 �Ⱦ��°�� � ���ŷο��� �ִ���..)
		
		// - �ٷ��� �����͸� ����صΰ��� �� �� ������ ��������� ��Ƽ� �����ϸ�Ǳ���.. 
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// - �ݺ��� ��� �Ұ�
		/*
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		*/
		
		
		/*
		for(int i=1; i<=5; i++) {
			System.out.println(num + i); 
		}
		*/
		
		// - �ݺ��� ���Ұ�
		int sum = num1 + num2 + num3 + num4 + num5;
		
		
		// * �迭����
		/*
		 * 1. �迭 ���� 
		 *    �ڷ��� �迭��[];
		 *    �ڷ���[] �迭��;
		 */
		//int arr[];
		//int[] arr;
		
		/*
		 * 2. �迭 �Ҵ� (�迭�� ũ�⸦ ����!!)
		 *    �迭�� = new int[�迭ũ��];
		 */
		//arr = new int[5];
		
		// => ���� ������ ��ǻ� ���ÿ� ���� (����� ���ÿ� �Ҵ�)
		int[] arr = new int[5];	 // �迭�� ũ�� 5�� �����Ǵ� ���� (5���� ���� ����.. 0���� ~ 4����)
		
		/*
		 * 3. �� ����(�ʱ�ȭ)
		 *    �迭��[�ε���] = ��;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		//arr[5] = 5;
		
		// �������ε��� == �迭�� ũ��-1
		//for(int i=0; i<=arr.length-1; i++) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		// �迭�� ���� = �迭 ���� ������ ��Ģ�� ���� ��� "�ݺ���" ���� ���ϰ� ��� ����
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int sum2 = 0;
		
		// sum2 += arr[0];
		// sum2 += arr[1];
		// ...
		// sum2 += arr[4];
		for(int i=0; i<arr.length; i++) {
			sum2 += arr[i];
		}
		
		System.out.println("���հ� : " + sum2);
		
		System.out.println(arr);
		
	}
	
	
	public void method2() {
		
		int a = 10;
		double d = 2.3;
		
		int[] iArr = new int[5];
		double[] dArr = new double[7];
		
		
		System.out.println(a);
		System.out.println(d);
		
		/*
		 * �⺻�ڷ���(8��)���� ������ ����
		 * => ��¥ ��(���ͷ�)�� ��� ���� => �Ϲݺ���
		 * 
		 * �� �� �ڷ���(String, int[], char[], ....)
		 * => �ּҰ��� ��� ���� => ���۷���(����)����
		 */
		
		System.out.println(iArr);
		System.out.println(dArr);
		
	}
	
	public void method3() {
		
		double[] dArr = new double[3];
		
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}	
		
		// ���� ���� �ȴ����ߴµ� �������� �� ����� �� �� �־��� ������
		// �迭�� �� �ε����� ������ �������� ������ JVM�� ������ �⺻���� ���� ��!
		// ��? Heap�������� ���� �� ������ �־�� �ȵ�!! => JVM�� �ڵ����� �ʱⰪ �ο�
		
		int[] iArr = new int[5];
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		
	}
	
	public void method4() {
		
		int[] arr = new int[5];
		
		/* �迭�� �ʱ�ȭ
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 4;
		 * arr[4] = 5;
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}

		// arr[0] : 1
		// arr[1] : 2
		// ...
		// arr[4] : 5
		
		for(int i=0; i<arr.length; i++) {	
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("arr : " + arr);
		System.out.println("arr�� �ؽ��ڵ尪 : " + arr.hashCode()); // �ּҰ��� 10���� ����
		System.out.println("�迭�� ���� : " + arr.length);
		
	}
	
	public void method5() {
		
		// ����ڰ� �Է��� ��������ŭ�� �迭 ũ�� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Ҵ��� �迭�� ���� : ");
		int size = sc.nextInt();
		
		char[] arr = new char[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// int => �⺻�� 0
		// double => �⺻�� 0.0
		// char => ' '
		
	}
	
	public void method6() {
		
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value += 2;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr�� ���� : " + arr.length);
		System.out.println("arr�� �ּҰ� : " + arr.hashCode());
		
		
		// �߰��� ���� �� �־��ְ� �Ǹ� ���� �߻�
		//arr[5] = 12;
		
		
		
		// * �迭�� ���� ū ����!!
		// - �ѹ� ������ ũ��� ���̻� ������ �Ұ�!!
		
		
		// ���� ũ�⸦ �����ؾ߸� �Ѵٸ� �ٽ� �迭�� �Ҵ�
		// (�迭�� ũ�⸦ �ٽ������� ���ο� �迭�����ߵ�)
		arr = new int[10];
		
		System.out.println("======= ������ arr =======");
		System.out.println("arr�� ���� : " + arr.length);
		System.out.println("arr�� �ּҰ� : " + arr.hashCode());		
		
		// �ּҰ� �����!! (������ �����ϰ� �ִ� ���� ������� �� ���ο� ���� �����ϰ� ����)
		
		// ������ ������ heap������ �յ� ���ٴϴ� ���� (��������� �������� �ʰ�)
		// => ���� �ð��� ������ ������ �÷���(GC)�� ������ (�ڹ��� Ư¡ �� �ϳ� : �ڵ��޸� ����)
		
		// ���� �Ҵ�� �迭�� ������� �� �� ��� �ؾߵǳ���?
		arr = null; // �ּҰ��� ���� ��°� �ǹ�
		
		System.out.println("====== ������ arr ======");
		System.out.println(arr);
		//System.out.println("���� : " + arr.length);
		System.out.println("�ּҰ� : " + arr.hashCode());
		
		// NullPointerException : �ƹ��͵� �������� �ʴ� null �̶�� Ư���� ���� �����ϰ� ���� �� �߻�
		//  null.XXX
		
		
	}
	
	public void method7() {
		// �迭 ���� �� ũ�� ���� => �� �ʱ�ȭ
		
		// �迭 ���� �� ũ�� ���� �� �� �ʱ�ȭ
		// �ڷ���[] �迭�� = {��, ��, ��};
		// �ڷ���[] �迭�� = new �ڷ���[]{��, ��, ��};
		
		int[] arr = {1, 2, 3, 4};
		
		int[] arr2 = new int[] {1, 2, 3, 4};
		
		System.out.println(arr == arr2); // false (�ּҰ���)	
		
	}
	
	//-----------------------------------------------
	
	public void method8() {
		
		// ���ڿ� ������ �� �մ� String[] ũ�� 5�� ������ ��
		// �ݺ������� ����ڿ��� �����ϴ� ���ϸ� �Է¹��� �� �ش� �迭�� �������� ���
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("�����ϴ� ���ϸ� : ");
			arr[i] = sc.nextLine();
		}
		
		// �� ������ �ش� �ε����� ��� �� ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method9() {
		
		// ũ�� 10¥�� ������ �迭 �����
		int[] arr = new int[10];
		
		// 0���ε���~�������ε�������
		// �Ź� ������ ��������� ������(1~100)�� ��������
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method10() {
		
		// ����ڿ��� 3���� Ű ������ �Է¹޾Ƽ� �������� ���
		// �ݺ����� �̿��ؼ� 3���� Ű�� ����, ��հ� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[3];
		
		for(int i=0; i<height.length; i++) {
			System.out.print("Ű �Է� : ");
			height[i] = sc.nextDouble();
		}
		
		/*
		sum += height[0];
		sum += height[1];
		sum += height[2];
		*/
		
		double sum = 0;
		for(int i=0; i<height.length; i++) {
			sum += height[i];
		}
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum / height.length);
		
	}

	public void method11() {
		
		// ����ڰ� �Է��� ����ŭ�� ũ���� int�迭 �����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ũ�� : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 0���ε���~�������ε������� �� ��� (������(1~100))
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// ����ִ� ���� ���, ¦������ ���� ���
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("\n¦���� ���� : " + sum);
		
	}
	
	public void method12() {
		
		// ����ڿ��� ���ڿ� �Է¹��� �� 
		// �� �ε����� ���ڸ� char[] �迭�� �Űܴ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine(); // apple
									// ['a', 'p', 'p', 'l', 'e']
		
		char[] arr = new char[str.length()];
		
		// arr[0] = str.charAt(0);
		// arr[1] = str.charAt(1);
		// ....
		// arr[����-1] = str.charAt(����-1);
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}







