package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.CheckedException;
import com.kh.exception.controller.UnCheckedException;

public class Run {

	public static void main(String[] args) throws IOException {
		
		// 에러들의 종류
		// 예외란 뭔지
		// 예외처리를 왜 해야만 하는지
		// 예외처리를 하는 방법
		
		/*
		 *  * 에러 종류
		 *  - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 --> 소스코드로 해결안됨 --> 심각한 에러
		 *  - 컴파일 에러 : 소스코드 문법상 오류 --> 빨간줄로 애초에 알려줌 
		 *  - 런타임 에러 : 코드 상으로는 문제가 없는데 프로그램 실행할 때 발생하는 에러 (사용자의 실수일 수도 있고 개발자가 예측가능한 경우를 제대로 처리못한 )
		 *  
		 *  - 논리 에러 : 문법상으로도 문제없고 실행했을 때도 궂이 문제되지 않지만 프로그램 의도상 맞지 않는 것
		 *  
		 *  * 우리는 시스템 에러를 제외한 컴파일에러, 런타임에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업 
		 *    => 이런것들을 "예외"라고 한다. --> Exception
		 *    
		 *  * 이런 예외들이 "발생"했을 경우에 대해서 "처리"하는 방법	=> "예외처리"
		 *  
		 *  * "예외처리"를 안해놓으면 해당 예외 발생시 프로그램이 비 정상적으로 종료되버림
		 *  
		 */
		
		
		UnCheckedException ex1 = new UnCheckedException();
		//ex1.method1();
		//ex1.method2();
		
		
		CheckedException ex2 = new CheckedException();
		/*
		try {
			ex2.method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		ex2.method1(); // 여기서 마저도 떠넘기게 되면 결국은 JVM이 처리해주긴 함..
		

	}

}





