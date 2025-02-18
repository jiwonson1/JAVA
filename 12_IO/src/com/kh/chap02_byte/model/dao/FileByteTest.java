package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	
	// 프로그램 (자바 코드) --> 외부매체(파일) (출력: 프로그램 내의 데이터를 파일로 내보내기 즉, 파일에 저장하겟다.)
	public void fileSave() {
		
		// FileOutputStream  : "파일"로 데이터를 1바이트 단위로 출력하는 스트림
		
		FileOutputStream fos = null;
		try {
			// 1. FileOutputStream 객체 생성 : 해당 파일과의 연결통로가 만들어짐
			fos = new FileOutputStream("a_byte.txt"); // 해당 파일이 없으면 자동으로 만들어진 후 연결, 만일 파일이 있었다면 그냥 바로 연결
			// fos가 바로 연결 통로
			// true 미작성시 --> 기존에 해당 파일 있을경우 덮어씌워짐 (기본값 false)
			// true 작성시    --> 기존에 해당 파일 있을경우 연이어서 작성됨
			
			
			// 2. 통로로 데이터 출력 : write() 메소드 사용
			//    단, 1바이트 단위(-128~127)로 밖에 데이터 출력 불가
			
			fos.write(97);// a // 숫자값 그대로 저장되는거 아님 해당 숫자의 아스키코드(0~127)값의 문자가 저장됨
			fos.write('b');
			//fos.write('강'); // 한글은 2byte짜리이기 때문에 1byte통로로 전달시 깨져서 기록됨!! 
			
			//    바이트 배열도 출력 가능
			byte[] bArr = {99, 100, 101}; // cde
			fos.write(bArr);
			
			//	fos.write(배열, 시작인덱스, 갯수) => 배열의 시작인덱스부터 해당 갯수만큼 출력
			fos.write(bArr, 1, 2); // de
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 어떤 예외가 발생 하든 간에 반드시 실행할 구문을 기술해둠
			
			try {
				// 3. 스트림 다 이용했으면 반납하기 (close메소드)
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	// 프로그램 (자바 코드) <-- 파일    (입력 : 파일에 기록된 데이터 가져오기 )
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		// 1. FileInputStream 객체 생성 : 해당 파일과의 연결통로가 만들어짐
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.txt");
			
			// 2. 파일로부터 데이터를 입력받고자 할 때 read() 메소드 사용
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			*/
			// 계속 읽어와보면 파일의 끝을 만나는 순간 -1을 반환하는걸 파악!!
			
			/*  조건검사시 읽어온 값을 출력을 해야만 하는데 실질적으로 출력하고 있는 내용은 다시 읽어온값을 출력
			while(fis.read() != -1) { // 읽어온 값이 -1이 아닐 경우 출력이 되게끔
				System.out.println(fis.read());
			}
			*/
			
			// fis.read()는 반복문이 수행될때마다 딱 한번만 실행되야함!!
			
			// 해결방법1. 무한반복으로 돌리면서 조건검사
			/*
			while(true) {
				int value = fis.read();
				
				if(value != -1) {
					System.out.print(value + " ");
				}else {
					break;
				}
			}
			*/
			
			// 해결방법2. 권장방법
			int value = 0; // 매번 입력받아온 데이터를 기록할 변수 만들어두기
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. 다 쓴 자원 반납하기
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
	
	
	

}
