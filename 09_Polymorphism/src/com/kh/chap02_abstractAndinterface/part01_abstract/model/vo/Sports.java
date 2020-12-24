package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public abstract class Sports {
	
	private int people; // 해당 스포츠에 참여하는 명수
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public String toString() {
		return "참여하는 명수 : " + people + "명";
	}
	
	// 추상메소드 (미완성된 메소드)
	public abstract void rule();
	
	/*
	 * 추상메소드 (미완성된 메소드로 내용 구현이 되어있지 않은 메소드)
	 * --> 몸통부가 구현되어있지 않음
	 * --> 미완성된 추상메소드가 현재 이클래스에 있다란 소리 == 이 클래스 또한 미완성된 클래스 == 추상클래스로 작성해야됨!
	 */
	
}



