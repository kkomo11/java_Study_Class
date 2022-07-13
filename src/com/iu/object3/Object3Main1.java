package com.iu.object3;

public class Object3Main1 {

	public static void main(String[] args) {
		ReturnTest retest = new ReturnTest();
		int randNum[] = new int[0];
		retest.info();
		int num = retest.makeRandom();
		System.out.println(num);
		
		System.out.println("========================");
		
		randNum = retest.makeRandom2(3);
		for(int i=0; i<randNum.length; i++) {
			System.out.println(randNum[i]);
		}
		
		System.out.println("========================");
		
		Account acc = new Account();
		acc = retest.makeAccount();
		System.out.println("통장 이름: " + acc.title + "\n예금주: " + acc.host + "\n통장 번호: " 
		+ acc.numbers + "\n잔액: " + acc.balance);
	}
}