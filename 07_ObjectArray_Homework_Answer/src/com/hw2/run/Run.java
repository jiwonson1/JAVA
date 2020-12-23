package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student stu[] = new Student[10];
		
		int count = 0; // ���� �л� �� --> �л���ü ���� �ɶ����� 1�� ���� �����ٲ���
		
		while(true) {
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			// ����ڰ� �Է��� ������ ������ �л���ü ���� �� ��ü�迭�� ���
			stu[count++] = new Student(grade, classroom, name, kor, eng, math);
			// ����� count 1 ����
			
			System.out.print("��� �߰��� �̴ϱ� ? (y/n) : ");
			String str = sc.nextLine().toUpperCase();
			
			if(str.equals("N")) {
				break;
			}
		}
		
		
//		for(int i=0; i<stu.length; i++) { // �̷��� �Ǹ� ������ 10�� �ݺ� --> NullPointerException �߻� ������ ����
		for(int i=0; i<count; i++) { // ���� �л� �� ��ŭ�� �ݺ��ϵ���
			
			// �ش��ε��� �л��� ����,����,���� ���� �հ�
			int sum = stu[i].getKor() + stu[i].getMath() + stu[i].getEng();
			
			System.out.println(stu[i].information() + ", ��� = " + sum / 3);
			
		}
		
	}

}
