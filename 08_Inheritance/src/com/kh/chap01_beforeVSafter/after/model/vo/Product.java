package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	
	/*
	 * �� Ŭ���� ��� ���������� ������ �ִ� ��Ҹ� �����ؼ� �θ�Ŭ������ ����
	 * �������� ��� : brand, pCode, pName, price
	 * 			  setBrand, setpCode, setpName, setPrice
	 * 			  getBrand, getpCode, getpName, getPrice
	 * 			  information 
	 */
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpCode() {
		return pCode;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpName() {
		return pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return "�귣��� : " + brand + ", ��ǰ��ȣ : " + pCode +
			 ", ��ǰ�� : " + pName + ", ���� : " + price + "��";
	}
	

}







