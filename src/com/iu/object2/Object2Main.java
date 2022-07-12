package com.iu.object2;

public class Object2Main {

	public static void main(String[] args) {
		System.out.println("시작");
		
		Method1 mt1 = new Method1();
		Method2 mt2 = new Method2();
		mt1.test();
		mt2.info();
		
		System.out.println("종료");
	}
}