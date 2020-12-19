package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	// 실습문제 1
	// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : " );
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다." : "양수가 아니다";
		System.out.println(result);
		
	}
	
	// 실습문제 2
	// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
	// 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수  : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num < 0 ? "음수다" : "0이다");
		System.out.println(result);
	}
	
	
	// 실습문제 3
	// 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}
	
	
	// 실습문제 4
	// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
	// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + candy / people);
		System.out.println("남는 사탕 개수 : " + candy % people);
	}
	
	
	// 실습문제 5
	// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble(); // 97.6589 
		
		// x학년 x반 x번 xxx x학생의 성적은 xx.xx이다.
		//String result = (gender == 'M'? "남": "여");
		String result = (gender == 'F'? "여":"남");
		
		// 결과 출력
		/*
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " 
						 + name + " " + result + "학생의 성적은 " + score + "이다.");
		*/
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", grade, classNum, num, name, result, score);
	}
	
	
	// 실습문제 6
	// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
	// 성인(19세 초과)인지 출력하세요.
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age <= 19 ? "청소년" : "성인");
		System.out.println(result);
	}
	
	
	// 실습문제 7
	/*
	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
	세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요
	*/
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		// 총점, 평균 구해서 각 변수 기록 
		int sum = kor + eng + math;   // 총점
		double avg = sum / 3.0;    // (double)int / double  =>  300.0 / 3.0  =>  double
		// int / int => 결과값 int => 소수점 표현이 어렵기 때문에 데이터 손실 발생
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60?"합격":"불합격");
		System.out.println(result);
	}
	

	// 실습문제 8
	// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		// xxxxxx-1xxxxxx
		//        2
		System.out.print("주민번호를 입력하세요 (- 포함) :  ");
		String str = sc.nextLine();  // "xxxxxx-xxxxxxx";
									 //  012345678.....
		
		// 성별자리에 해당하는 문자만을 추출해서 변수 기록
		char ch = str.charAt(7);  // '1', '2', '3', '4',  잘못된 값이 담겨있을 수도..
		
		String result = (ch == '1' || ch == '3' ? "남자" : 
						(ch == '2' || ch == '4' ? "여자" : "잘못 입력하셨습니다."));
		
		
		System.out.println(result);
		
	}
	
	
	// 실습문제 9
	/*
	키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
	그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
	아니면 false를 출력하세요.
	(단, num1은 num2보다 작아야 함)
	*/
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		System.out.println((input <= num1) || (input > num2));
	}

	
	// 실습문제 10
	// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.println(isTrue);

	}
	

}
