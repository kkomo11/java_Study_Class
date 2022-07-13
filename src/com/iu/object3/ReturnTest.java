package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	//makeAccount 메소드
	// 통장 개설 title host number balance 입력
	
	public Account makeAccount() {
		Account acc = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("통장 개설");
		System.out.println("통장 이름 입력");
		acc.title = sc.next();
		System.out.println("예금주명 입력");
		acc.host = sc.next();
		System.out.println("통장 번호 입력");
		acc.numbers = sc.next();
		System.out.println("잔액 입력");
		acc.balance = sc.nextLong();
		sc.close();
		return acc;
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}
	
	public int makeRandom() {
		Random rand = new Random();
		int num1 = rand.nextInt(50); //3
		
		return num1;
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