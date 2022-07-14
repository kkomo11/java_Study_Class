package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		Student [] stds = new Student[3];
		Student st = new Student();
		
		for(int i=0; i<stds.length; i++) {
			// 객체 3개를 만들지 않아 덧씌우기가 됨. student 객체 초기화를 반복문으로
			System.out.println("이름 입력");
			st.setName(sc.next()); // a b c
			stds[i] = st;
		}
		for(int i=0; i<stds.length; i++) {
			System.out.println(stds[i].getName()); // c c c
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}