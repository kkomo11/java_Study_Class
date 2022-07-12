package com.iu.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AnimalSound sound = new AnimalSound();
		
		System.out.println("1. Dog  2. Cat  3. Tiger");
		int select = sc.nextInt();
		System.out.println("울음소리 횟수 입력");
//		int count = sc.nextInt();
		

		switch(select) {
		case 1:
			sound.dogsound();
			break;
		case 2:
			sound.catsound();
			break;
		case 3:
			sound.tigersound();
			break;
		default:
			System.out.println("잘못된 번호입니다.");
			break;
		}

		sc.close();
	}
}