package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicMenu {
	
	// �ش� �� Ŭ���� �������� sc �ٷ� �� �� �ְԲ�
	private Scanner sc = new Scanner(System.in);
	// �ٷ� Controller ��û �� �� �ְԲ�
	private MusicController mc = new MusicController();
	
	
	/**
	 * * ���α׷� ���� �� ����ڰ� ���Ե� ù ȭ��
	 * 
	 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n== Welcome ���� ==");
			System.out.println("1. �ű� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine(); 
			
			switch(menu) {
			case 1: insertMusic(); break;
			case 2: selectList(); break;
			case 3:  break;
			case 4:  break;
			case 5:  break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("��ȣ�� �߸� �����߽��ϴ�. �ٽ��Է����ּ���");
			}
			
		}
		
		
	}
	
	
	/**
	 * 1. �ű� �� �߰��ϴ� ȭ��
	 */
	public void insertMusic() {
		
		System.out.println("\n=== �ű� �� �߰� ===");
		System.out.print("���� �Է� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String artist = sc.nextLine();
		
		// �� �߰� ��û!! (Controller �޼ҵ� ȣ��!!)
		//mc.insertMusic(title, artist);
		mc.insertMusic(new Music(title, artist));
		
		System.out.println("���������� ���� �߰��Ǿ����ϴ�.");
		
	}
	
	/**
	 * 2. �� ��ü ��ȸ �ϴ� ȭ��
	 */
	public void selectList() {
		
		System.out.println("\n=== �� ��ü ��ȸ ===");
		
		// �� ��ü ��ȸ��û!! (Controller �޼ҵ� ȣ��!!)
		ArrayList<Music> list = mc.selectList();
		
		if(list.isEmpty()) { // ����Ʈ�� ������� ��� --> �����ϴ� ���� ���ٶ� �Ҹ�
			
			System.out.println("�����ϴ� ���� �����ϴ�.");
			
		}else { // ����Ʈ�� ������� ���� ��� --> �� ���̶� ����ִٶ� �Ҹ�
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));	// list[i]
			}
			
		}
		
		
	}
	
	
	
	
	

}
