package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		// 객체생성을 통해 Heap 영역에 공간을 먼저 확보해둬야됨(할당)
		Person p = new Person();
		
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("홍길동");
		p.setAge(20);
		p.setGender('M');
		p.setPhone("010-1111-2222");
		p.setEmail("hong@naver.com");
		
		//String id = p.getId();  
		//System.out.println(id);
		
		/*
		System.out.println("id : " + p.getId() + ", pwd : " + p.getPwd() 
						 + ", name : " + p.getName() + ", age : " + p.getAge() 
						 + ", gender : " + p.getGender() + ", phone : " + p.getPhone()
						 + ", email : " + p.getEmail());
		*/
		
		System.out.println(p.information());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 이름 : ");
		String name = sc.nextLine();
		
		p.setName(name); // 변경 요청
		
		System.out.println(p.information());
		
		
	}

}







