package com.kh.chap01_beforeVSafter.after.model.vo;

//			 �ڽ�Ŭ����   extends �θ�Ŭ����
public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// super.�� ���� �θ�Ŭ������ ���ٰ�����!!
		// ��, �����ϰ��� �ϴ� �ʵ尡 private �� ��� �������� �Ұ�!!
		
		// �ذ���1. �θ��ʵ带 �ڽı����� ���� �����ϰԲ� protected�� �ٲٱ�
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		// �ذ���2. ���������� ���ٰ����� setter�޼ҵ带 Ȱ���ϱ�
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		// �ذ���3. �θ� ������ ȣ���ϱ�
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	// ������ == �������̵�
	// �θ�Ŭ�������� �ְ� �ڽ�Ŭ�������� ������ �޼ҵ� ���� �� �ڽ�Ŭ�����޼ҵ尡 �켱���� ����!!
	public String information() {
		
		/*
		return "�귣��� : " + super.getBrand() + ", ��ǰ��ȣ : " + super.getpCode() 
			+ ", ��ǰ�� : " + super.getpName() + ", ���� : " + super.getPrice() + "��, ��ü���� : " + allInOne;
		*/
		
		return super.information() + ", ��ü���� : " + allInOne;
	}
	
}




