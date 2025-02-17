package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle {

	private int propeller;
	
	public Ship() {}
	
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	public int getPropeller() {
		return propeller;
	}
	
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	@Override
	public String information() {
		return super.information() + ", 프로펠러수 : " + propeller + "개";
	}
	
	//@Override
	public void howToMove() {
		System.out.println("프로펠러를 돌려서 움직인다.");
	}
}




