package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		// 1. 길이가 10인 배열을 만들자
		int[] arr = new int[10];
		
		// 2. 1부터 10까지의 값을 반복문을 통해 순서대로 넣자
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		*/
		// i번째 인덱스 값에 i+1 값을 넣어주면 되겠구나!
		
		// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
		for(int i=0; i<arr.length; i++) { 
			arr[i] = i+1; 
		}
		
		// 3. 잘 들어갔는지 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		// 1. 길이가 10인 배열을 만들자
		int[] arr = new int[10];
		
		// 2. 10부터 1까지의 값을 반복문을 통해 순서대로 넣자
		/*
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		arr[3] = 7;
		arr[4] = 6;
		arr[5] = 5;
		arr[6] = 4;
		arr[7] = 3;
		arr[8] = 2;
		arr[9] = 1;
		*/
		// i번째 인덱스 값에 arr.length-i 값을 넣어주면 되겠구나!
		
		// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		// 3. 잘 들어갔는지 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		// 1. 사용자에게 정수 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		// 2. 배열을 할당할 껀데 사용자가 입력한 정수(size)만큼의 크기로 할당
		int[] arr = new int[size];
		
		// 3. 1부터 입력받은 값까지 배열에 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		// 4. 잘 들어갔는지 출력을 통해 확인
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		// 1. 길이가 5인 String 배열 선언
		String[] arr = new String[5];
		
		// 2. 각 인덱스별 값 초기화
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		// 위의 1번 2번 과정을 동시에 진행 할 수도 있다. 아래와 같이
		//String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		// 3. 배열 인덱스를 활용해서 귤 출력
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		
		// 1. 사용자에게 문자열과 문자 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();  // "apple"
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. 사용자가 입력한 문자열 중에 각각의 문자들을 char 배열에 담기
		
		// 2_1. char[] 생성 (크기는 문자열의 길이와 동일하게)
		char[] arr = new char[str.length()];
		
		// 2_2. 반복문을 이용해서 옮겨담기		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// ['a', 'p', 'p', 'l', 'e']
		//           동등비교
		//  ch   ch    ch   ch   ch
		
		// 3. 검색할 문자가 몇개 들어있는지, 몇번째 인덱스에 있는지 파악하기
		
		int count = 0; // 일치하는 문자를 찾을 때마다 카운팅할 변수 (갯수를 세어줄 변수 == 1씩 증가시킬 변수)
		
		// "xxxxxxx에 x가 존재하는 위치(인덱스) : "
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == ch) { // 사용자가 입력한 검색할 문자와 해당 배열의 인덱스값이 일치할 경우
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// x 개수 : x
		System.out.println(ch + " 개수 : " + count);
		
		
	}
	
	public void practice6() {
		
		// 1. "월" ~ "일"까지 초기화된 문자열 배열 만들기
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 2. 사용자에게 0부터 6까지의 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		// 3. num값이 0 ~ 6 사이의 숫자인지 확인 --> 아닐 경우 "잘못 입력하셨습니다." 출력
		if(num >= 0 && num <= 6) {
			
			// 해당 요일 출력
			System.out.println(arr[num] + "요일");
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	public void practice7() {
		// 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		
		// 3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			// 1. 사용자에게 3이상의 홀수에 해당하는 정수값을 입력받자 (반복)
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			// 2. 제대로 입력했는지 안했는지 판별
			if(num >= 3 && num % 2 == 1) { // 제대로 입력했을 경우 (배열에 값 담은 후 출력 하고 빠져나가기)
				
				// 3   5   7   9 
				
				// 사용자가 입력한 정수 크기만큼의 int배열 만들기
				int[] arr = new int[num];
				
				// 배열의 중간까지는 1씩 증가하는값, 그 이후부터는 1씩 감소하는 값 담기
				// 3	=>  [1 "2" 1]				=> 가운데 인덱스 1  => 3 / 2	 => 1
				// 5	=>  [1 2 "3" 2 1]			=> 가운데 인덱스 2  => 5 / 2  => 2
				// 7	=>  [1 2 3 "4" 3 2 1]		=> 가운데 인덱스 3  => 7 / 2  => 3
				//										가운데 인덱스 : 배열의 크기 / 2
				
				int value = 1;
				for(int i=0; i<arr.length; i++) {
					arr[i] = value;
					
					if(i < arr.length / 2) {
						value++;
					}else {
						value--;
					}
				}
				
				// 잘 담겼는지 출력하기
				for(int i=0; i<arr.length; i++) {
					
					if(i == arr.length-1) {
						System.out.print(arr[i]);
					}else {
						System.out.print(arr[i] + ", ");
					}
				}
				
				// 반복문 빠져나가기
				break;
				
			}else { // 제대로 입력하지 않았을 경우  ("다시입력하세요." 출력 후 반복이 수행)
				System.out.println("다시 입력하세요.");
				//continue;
			}
			
		}
		
		
		
		
	}
	
	public void practice9() {
		// 1. 치킨 메뉴들이 들어있는 String 배열 선언, 할당 동시에 초기화
		String[] chickens = {"후라이드", "양념", "파닭", "치즈"};
		
		// 2. 사용자에게 치킨 메뉴 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		// 3. 반복문을 통해 배열의 0번 인덱스부터 마지막 인덱스까지 접근하여
		//    사용자가 입력한 메뉴와 동일한 메뉴가 있는지
		boolean flag = false; // 동일한 메뉴가 있는지 없는지 논리값을 받아주기 위한 변수 사용
		
		for(int i=0; i<chickens.length; i++) {
			
			if(chickens[i].equals(menu)) { // 사용자가 입력한 메뉴와 동일한 메뉴일 경우
				flag = true; // flag 값을 true로 바꿔주고
				break;       // 반복문을 빠져나간다. (생략가능하지만 true로 바뀐 후 더이상 반복문을 돌 필요가 없기때문에 효율적으로 사용한거임)
			}
		}
		
		if(flag) { // flag가 true일 경우 즉, 사용자가 입력한 메뉴가 존재할 경우
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화한 후 출력
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		
		// 1. 크기 10짜리 int[] 배열 생성하기
		int[] arr = new int[10];
		
		// 2. 해당 배열의 각 인덱스에 1~10사이의 랜덤값 담기
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		// 3. 배열 전체 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 4. 최대값, 최소값 판별후 출력
		// 오름차순 정렬 후 
		Arrays.sort(arr);
		
		// 0번인덱스값 : 최소값
		// 9번인덱스값 : 최대값
		System.out.println("\n최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
		
		
				
	}
	
	public void practice12() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		// 사용자에게 주민등록번호 문자열 입력받기 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			
			if(i <= 7) { // 7번 인덱스 이하까지는
				arr[i] = str.charAt(i); // 기존의 주민번호들 복사
			}else { // 그 이후부터는 *값 들어가도록
				arr[i] = '*';
			}
			
			// 바로 출력
			System.out.print(arr[i]);
		}
		
		
	}
	
	
	public void practice14() {
		// 1. 크기가 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 오름차순 정렬
		for(int i=0; i<lotto.length; i++) { // 비교 주체
			for(int j=i+1; j<lotto.length; j++) { // 비교 대상
				if(lotto[i] > lotto[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨
					
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		// 4. 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	
}
