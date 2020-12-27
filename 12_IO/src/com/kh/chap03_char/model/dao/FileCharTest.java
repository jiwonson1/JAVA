package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	
	// 프로그램 --> 파일 (출력 : 프로그램상 데이터를 파일로 내보내겠다.)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력하기 
		
		/*
		// 1. FileWriter 객체 생성 
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.dat");
			
			// 2. 통로로 데이터 출력 : write() 메소드 이용
			fw.write('A');
			fw.write(' ');
			fw.write("와!IO 재밌다...");
			fw.write("\n");
			
			// char[] 배열 전송가능
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 다 쓴 자원 반납
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// 해당 스트림 다 쓴 후 자동으로 close() 까지 해주는 구문
		// try with resource 구문 
		/*
		 *  try(스트림 객체 생성하는 구문) {
		 *  	
		 *  } catch(예외클래스명 e){
		 *  
		 *  }
		 */
		try(FileWriter fw = new FileWriter("b_char.dat")) {
			
			// 2. 통로로 데이터 출력 : write() 메소드 이용
			fw.write('A');
			fw.write(' ');
			fw.write("와!IO 재밌다...");
			fw.write("\n");
			
			// char[] 배열 전송가능
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	// 프로그램 <-- 파일 (입력 : 파일로부터 프로그램으로 데이터 가져오기)
	public void fileRead() {
		
		// FileReader : 파일로 데이터를 2바이트 단위로 입력받기
		
		// 1. FileReader  객체 생성 
		try(FileReader fr = new FileReader("b_char.dat")) {
			
			// 2. 통로를 통해서 데이터 입력받아오기 : read() 메소드 
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			// 얘도 마찬가지로 파일의 끝을 만나면 -1을 반환
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} /*catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/ catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

}








