package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.A_StringPoolTest;
import com.kh.chap02_string.controller.B_StringMethodTest;
import com.kh.chap02_string.controller.C_StringTokenizerTest;
import com.kh.chap02_string.controller.D_BuilderBufferTest;

public class Run {

	public static void main(String[] args) {
		
		A_StringPoolTest a = new A_StringPoolTest();
		//a.method1();
		//a.method2();
		
		B_StringMethodTest b = new B_StringMethodTest();
		//b.method();
		
		C_StringTokenizerTest c = new C_StringTokenizerTest();
		//c.method();
		//c.method2();
		
		D_BuilderBufferTest d = new D_BuilderBufferTest();
		//d.method1();
		//d.method2();
		d.method3();
	}

}






