package com.kh.chap04_assit.part02_object.model.vo;

public class Phone implements java.io.Serializable { // ����ȭ ����
	
	// ��ü ��ü�� ��°�� ���� ����� �ϰ��� �Ѵٸ� �ݵ�� ����ȭ ������ �ʼ�!! ( implements Serializable)
	
	// �ʵ� 
	private String name;
	private String brand;
	private int price;
	
	// �⺻������
	public Phone() {}

	// �Ű����� ������
	public Phone(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	// setter/getter�޼ҵ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString �޼ҵ�
	@Override
	public String toString() {
		return "Phone [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}


}



