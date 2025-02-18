package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	private int tire;
	private int wing;
	
	public Airplane() {}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	public int getTire() {
		return tire;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public int getWing() {
		return wing;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	@Override
	public String information() {
		return super.information() + ", 바퀴수 : " + tire + "개, 날개수 : " + wing + "개";
	}
	
	@Override
	public void howToMove() {
		System.out.println("날개를 가지고 움직인다.");
	}

}




