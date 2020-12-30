package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicMenu {
	
	// 해당 이 클래스 전역에서 sc 바로 쓸 수 있게끔
	private Scanner sc = new Scanner(System.in);
	// 바로 Controller 요청 할 수 있게끔
	private MusicController mc = new MusicController();
	
	
	/**
	 * * 프로그램 실행 시 사용자가 보게될 첫 화면
	 * 
	 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n== Welcome 별밤 ==");
			System.out.println("1. 신규 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine(); 
			
			switch(menu) {
			case 1: insertMusic(); break;
			case 2: selectList(); break;
			case 3:  break;
			case 4:  break;
			case 5:  break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("번호를 잘못 선택했습니다. 다시입력해주세요");
			}
			
		}
		
		
	}
	
	
	/**
	 * 1. 신규 곡 추가하는 화면
	 */
	public void insertMusic() {
		
		System.out.println("\n=== 신규 곡 추가 ===");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		// 곡 추가 요청!! (Controller 메소드 호출!!)
		//mc.insertMusic(title, artist);
		mc.insertMusic(new Music(title, artist));
		
		System.out.println("성공적으로 곡이 추가되었습니다.");
		
	}
	
	/**
	 * 2. 곡 전체 조회 하는 화면
	 */
	public void selectList() {
		
		System.out.println("\n=== 곡 전체 조회 ===");
		
		// 곡 전체 조회요청!! (Controller 메소드 호출!!)
		ArrayList<Music> list = mc.selectList();
		
		if(list.isEmpty()) { // 리스트가 비어잇을 경우 --> 존재하는 곡이 없다란 소리
			
			System.out.println("존재하는 곡이 없습니다.");
			
		}else { // 리스트가 비어있지 않을 경우 --> 한 곡이라도 담겨있다란 소리
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));	// list[i]
			}
			
		}
		
		
	}
	
	
	
	
	

}
