package com.kh.part01_objectVSobjectArray.run;

import com.kh.part01_objectVSobjectArray.model.vo.Product;

public class Run {
	
	public static void main(String[] args) {
		
		Product[] arr = new Product[3];
		
		// 각 인덱스에 객체 생성하기도 전에 getter/setter 수행불가
		//System.out.println(arr[0].getName());
		
		// 각 인덱스별로 객체 생성하기
		arr[0] = new Product("은하수", "샘송", 1300000);
		arr[1] = new Product("아이뽄", "사과", 1500000);
		arr[2] = new Product();
		
		
		// for loop 문 (일반 for문)
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		arr[2].setName("벨벳");
		arr[2].setBrand("헬지");
		arr[2].setPrice(800000);
		
		System.out.println("===== 변경후 ======");
		
		// for each문 (향상된 for문)
		
		int[] num = new int[3];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		/*
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		*/
		
		// for(접근했을 때의 값을 보관할 변수 : 순차적으로접근하고자하는배열명)
		/*
		for(int n : num) { // int n = num[0]; 
						   // int n = num[1];
						   // int n = num[2];
			System.out.println(n);
		}
		*/
		
		
		for(Product p : arr) {
			// Product p = arr[0];
			// Product p = arr[1];
			// Product p = arr[2];
			System.out.println(p.information());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}






