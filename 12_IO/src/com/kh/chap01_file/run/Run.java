package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		
		// 파일만들어지는거에 대한 간단 테스트 
		// java.io 패키지에 잇는 File 클래스 가지고 파일만 생성
		
		
		try {
			// 1. 경로지정 딱히 안한 파일 생성		--> 해당 이 프로젝트에 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile();	// 메소드 실행해야만 실제 파일이 만들어짐!! 	--> IOException 발생할 수도 있음
			
			// 2. 존재하는 기존 드라이브나 폴더에 파일 생성
			File f2 = new File("C:\\java_workspace\\test.txt");
			f2.createNewFile();
			
			// 3. 폴더 만들고 파일 생성
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			
			// 먼저 폴더 만든 후
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir();
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(tempFolder.exists());
			
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			File folder = new File("parent");
			folder.mkdir();
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			System.out.println("절대경로 : " + file.getAbsolutePath()); // 물리적인 경로
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");

	}
	
	/*
	 * 프로그램 상의 데이터를 외부매체로 출력을 한다거나 / 또는 외부매체로부터 입력 받아올 때 
	 * 반드시 그 외부매체와의 직접적인 통로를 만들어야됨!! => 그게 바로 스트림
	 * 
	 * * 스트림의 특징
	 * - 단방향 : 입력이면 입력 / 출력이면 출력만 가능!! (즉, 입력과 출력을 동시다발적으로 하고싶으면 각각의 스트림을 따로 만들어야됨!)
	 * - 선입선출(FIFO) : 먼저 보낸값이 먼저 나감!! (시간 지연)
	 * 
	 * * 자바에서 제공하는 스트림 클래스 
	 * > 통로의 사이즈 (1byte / 2byte)
	 *   - 바이트(byte) 스트림 : 1byte짜리 왔다 갔다 할 수있을 정도의 사이즈 (좁은통로)
	 *   			                  입력(InputStream) / 출력(OutputStream)
	 *   
	 *   - 문자(char) 스트림    : 2byte짜리 왔다 갔다 할 수 잇을 정도의 사이즈 (넓은통로)
	 *   			                  입력(Reader) / 출력 (Writer) 
	 *   
	 * > 외부매체와 직접 연결하는 유무
	 *   - 기반(기본) 스트림 : 외부 매체와 직접적으로 연결하는 통로
	 *   
	 *   - 보조 스트림 : 말그대로 보조 역할만을 수행하는 통로
	 *   			   단독으로는 사용 불가!! (반드시 외부 매체와 연결되어있는 기반 스트림 필요!!)
	 * 
	 *
	 */
	
	
	
	

}




