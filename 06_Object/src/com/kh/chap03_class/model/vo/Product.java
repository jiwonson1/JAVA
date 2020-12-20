package com.kh.chap03_class.model.vo;

// 클래스 앞에 기술 가능한 접근 제한자 : public, default(생략)
// default : 다른 패키지에서는 절대 사용(접근) 불가
public class Product {
	
	// 필드
	private String pName;   // setpName, setPname, setPName
	private int price;
	private String brand;
	
	// 기본생성자
	public Product() {}
	
	// 매개변수생성자
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	// setter메소드
	/*
	 * public void setXXX(각필드자료형 매개변수명) {
	 * 		this.필드명 = 매개변수명;
	 * }
	 */
	/*
	public void setPName(String pName) {
		
	}
	public void setPname(String pName) {
		
	}
	*/
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// getter메소드
	/*
	 * public 각필드자료형 getXXX() {
	 * 		return 필드명;
	 * }
	 */
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
	// 모든필드값을 하나의 문자열로 합쳐서 반환시키는 information 메소드
	public String information() {
		return "제품명 : " + pName + ", 가격 : " + price + "원, 브랜드 : " + brand;
	}

}



