package com.iu.object4;

public class Car {
	String company; String brand; String color;
	boolean gear;
	// true 오토 , false 수동
	
	public void info() {
		System.out.println("Company : " + this.company);
		System.out.println("Brand : " + this.brand);
		System.out.println("Color : " + this.color);
		System.out.println("Gear : " + this.gear);
	}
	
	// instance block
//	{
//		this.company = "기아";
//		this.brand = "K5";
//		this.color = "Black";
//		this.gear = false;
//	}
	
	public Car(String color) {
		this("아반떼", color);
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = color;
//		this.gear = true;
	}
	
	public Car(String Brand,String color) {
		this.company = "현대";
		this.brand = Brand;
		this.color = color;
		this.gear = true;
	}
	
	public Car() {
		this("White"); // 생성자 내에서 다른 생성자 호출할 때 사용
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = "White";
//		this.gear = true;
	}
}