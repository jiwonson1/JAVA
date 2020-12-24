package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public abstract class Sports {
	
	private int people; // �ش� �������� �����ϴ� ���
	
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
		return "�����ϴ� ��� : " + people + "��";
	}
	
	// �߻�޼ҵ� (�̿ϼ��� �޼ҵ�)
	public abstract void rule();
	
	/*
	 * �߻�޼ҵ� (�̿ϼ��� �޼ҵ�� ���� ������ �Ǿ����� ���� �޼ҵ�)
	 * --> ����ΰ� �����Ǿ����� ����
	 * --> �̿ϼ��� �߻�޼ҵ尡 ���� ��Ŭ������ �ִٶ� �Ҹ� == �� Ŭ���� ���� �̿ϼ��� Ŭ���� == �߻�Ŭ������ �ۼ��ؾߵ�!
	 */
	
}



