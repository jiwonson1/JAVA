package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 2. 다형성 적용했을 때
public class ElectronicController2 {
	
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	public void insert(Electronic any) {
		elec[count++] = any;
	}
			
	public Electronic select(int index) {
		return elec[index];
	}
			
	public Electronic[] select() {
		return elec;
	}
			
			
}






