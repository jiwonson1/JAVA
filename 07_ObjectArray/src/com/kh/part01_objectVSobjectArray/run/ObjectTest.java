package com.kh.part01_objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.part01_objectVSobjectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {
		
		Book bk1 = new Book();
		Book bk2 = new Book("자바의 정석", "강보람", 10000, "KH");
		Book bk3 = new Book();
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// 사용자에게 값 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 1. 전체 도서 정보 입력받기
		for(int i=0; i<3; i++) { // 총3번
			
			System.out.println(i + 1 + "번째 도서 정보 입력");
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			// 조건처리 일일히 해줘야됨..
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		
		
		// 2. 전체 도서 정보 출력하기
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		// 반복문으로도 실행못함...
		
		
		// 3. 도서 제목 검색하기
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		// 문자열.equals(문자열)
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}


