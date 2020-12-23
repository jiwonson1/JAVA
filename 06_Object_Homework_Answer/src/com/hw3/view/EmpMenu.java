package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {
		
	}
	
	public void mainMenu() {
		
		Employee emp = null;
		
		while(true) {
			System.out.println("===== ��� ���� ���� ���α׷� =====");
			System.out.println("1. �� ��� ���� �Է�");
			System.out.println("2. ��� ���� ����");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ������� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: emp = inputEmployee(); break;
			case 2: modifyEmployee(emp); break;
			case 3: emp = null; break;
			case 4: System.out.println(emp.information()); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���"); break;
			}
		}
	}
	
	public Employee inputEmployee() {
	
		System.out.print("�̸� : ");
		String empName = sc.nextLine();
		System.out.print("�μ� : ");
		String dept = sc.nextLine();
		System.out.print("���� : ");
		String job = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();		
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);		
		System.out.print("�޿� : ");
		int salary = sc.nextInt();		
		System.out.print("���ʽ�����Ʈ : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();		
		System.out.print("��ȭ��ȣ : ");
		String phone = sc.nextLine();		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		Employee newEmp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		return newEmp;
	}
	
	public void modifyEmployee(Employee emp) {
		
		while(true) {
			System.out.println("==== ��� ���� ���� �޴� ====");
			System.out.println("1. �̸� ����");
			System.out.println("2. �޿� ����");
			System.out.println("3. �μ� ����");
			System.out.println("4. ���� ����");
			System.out.println("9. ���� �޴���");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			
			switch(menu) {
			case 1: System.out.print("������ �̸� : ");
					String newName = sc.nextLine();
					emp.setEmpName(newName);
					break;
			case 2: System.out.print("������ �޿� : ");
					int newSalary = sc.nextInt();
					emp.setSalary(newSalary);
					break;
			case 3: System.out.print("������ �μ� : ");
					String newDept = sc.nextLine();
					emp.setDept(newDept);
					break;
			case 4: System.out.print("������ ���� : ");
					String newJob = sc.nextLine();
					emp.setJob(newJob);
					break;
			case 9: return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}
	}

}
