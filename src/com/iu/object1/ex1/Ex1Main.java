package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
//		Student std1 = new Student();
//		Student std2 = new Student();
//		Student std3 = new Student();
		Student [] std = new Student[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			std[i] = new Student();
			System.out.println("이름 입력");
			std[i].name = sc.next();
		}
	
//		std1.name = "iu"; std1.num = 1; std1.kor = 90; std1.eng = 80; std1.math = 70;
//		std1.total = std1.kor + std1.eng + std1.math;
//		std1.avg = std1.total / 3.0;
//		System.out.println("이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
//		System.out.println(std1.name+"\t\t"+std1.num+"\t\t"+std1.kor+"\t\t"
//				+ std1.eng + "\t\t" + std1.math + "\t\t" + std1.total + "\t\t"
//				+ std1.avg + "\t\t");
		
		for(int i=0; i<3; i++) {
			System.out.println(std[i].name);
		}

		sc.close();
		System.out.println("프로그램 종료");
	}
}