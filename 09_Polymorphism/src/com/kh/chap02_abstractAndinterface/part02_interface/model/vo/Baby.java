package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public class Baby extends Person implements Basic {
	
	public Baby() {
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return "Baby[" + super.toString() + "]";
	}
	
	// Baby 클래스에도 강제로 오버라이딩 한 후
	// eat호출시 실행할 구문 : 몸무게 3증가, 건강도 1증가
	// sleep호출시 실행할 구문 : 건강도 3증가

	@Override
	public void eat() {
		
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
		
	}

	@Override
	public void sleep() {
		
		super.setHealth(super.getHealth() + 3);
		
	}
	
}




