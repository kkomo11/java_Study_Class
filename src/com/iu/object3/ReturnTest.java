package com.iu.object3;

import java.util.Random;

public class ReturnTest {
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}
	
	public int makeRandom() {
		Random rand = new Random();
		int num = rand.nextInt(50);
		
		return num;
	}
	
	//호출 시 숫자를 받아서 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int[] makeRandom2(int count) {
		Random rand = new Random();
		int[] num= new int[count];
		for(int i=0; i<num.length; i++) {			
			num[i] = rand.nextInt(50);
		}
		
		return num;
	}
}