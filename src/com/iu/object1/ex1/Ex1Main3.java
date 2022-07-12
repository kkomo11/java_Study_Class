package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student [] stds = new Student[3];
		
		for(int i=0; i<stds.length; i++) {
			Student st = new Student();
			stds[i] = st;
			System.out.println("이름 입력");
			stds[i].name = sc.next(); // a b c
		}
		for(int i=0; i<stds.length; i++) {
			System.out.println(stds[i].name); // a b c
		}
		sc.close();
	}
}