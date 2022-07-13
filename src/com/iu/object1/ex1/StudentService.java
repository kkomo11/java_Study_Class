package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	// makeStudents 메소드
	// 학생수를 입력, 학생 수만큼 정보 입력, 총점 평균은 계산
	// 학생들을 리턴
	
	public Student[] makeStudents() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		Student[] stds = new Student[count];
		for(int i=0; i<count; i++) {
			Student std = new Student();
			stds[i] = std;
			System.out.println("학생의 이름을 입력하세요");
			stds[i].name = sc.next();
			System.out.println(stds[i].name + "학생의 번호를 입력하세요");
			stds[i].num = sc.nextInt();
			System.out.println(stds[i].name + "학생의 국어 점수를 입력하세요");
			stds[i].kor = sc.nextInt();
			System.out.println(stds[i].name + "학생의 영어 점수를 입력하세요");
			stds[i].eng = sc.nextInt();
			System.out.println(stds[i].name + "학생의 수학 점수를 입력하세요");
			stds[i].math = sc.nextInt();
			stds[i].total = stds[i].kor + stds[i].eng + stds[i].math;
			stds[i].avg = stds[i].total / 3.0;
		}
		return stds;
	}
	// findStudent 메소드
	// 검색하고 싶은 학생의 번호를 입력받아서,
	// 같은 번호의 학생을 찾아서 그 학생을 리턴
	// 없으면 null을 리턴
	
	public Student findStudent(Student[] stds) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		std = null;
		System.out.println("검색할 학생의 번호를 입력하세요");
		int index = sc.nextInt();
		
		for(int i=0; i<stds.length; i++) {
			if(index == stds[i].num) {
				std = stds[i];
			}
		}
		return std;
	}
}