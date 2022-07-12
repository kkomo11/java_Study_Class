package com.iu.object1.ex1;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//StudentController에 start 메소드 호출
		StudentController stdcon = new StudentController();
		stdcon.start();
		System.out.println("프로그램 종료");
	}
}