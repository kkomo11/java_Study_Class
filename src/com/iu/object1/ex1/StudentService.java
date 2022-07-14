package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	// makeStudents 메소드
	// 학생수를 입력, 학생 수만큼 정보 입력, 총점 평균은 계산
	// 학생들을 리턴
	Scanner sc;
	
	public StudentService() {
		sc = new Scanner(System.in);
	}
	
	public Student[] makeStudents() {
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		Student[] stds = new Student[count];
		for(int i=0; i<count; i++) {
			Student std = new Student();
			System.out.println("학생의 이름을 입력하세요");
			std.setName(sc.next());
			System.out.println(std.getName() + "학생의 번호를 입력하세요");
			std.setNum(sc.nextInt());
			System.out.println(std.getName() + "학생의 국어 점수를 입력하세요");
			std.setKor(sc.nextInt());
			System.out.println(std.getName() + "학생의 영어 점수를 입력하세요");
			std.setEng(sc.nextInt());
			System.out.println(std.getName() + "학생의 수학 점수를 입력하세요");
			std.setMath(sc.nextInt());
			stds[i] = std;
			std.setTotal();
		}
		return stds;
	}
	// findStudent 메소드
	// 검색하고 싶은 학생의 번호를 입력받아서,
	// 같은 번호의 학생을 찾아서 그 학생을 리턴
	// 없으면 null을 리턴
	
	public Student findStudent(Student[] stds) {
		Student std = new Student();
		std = null;
		System.out.println("검색할 학생의 번호를 입력하세요");
		int index = sc.nextInt();
		
		for(int i=0; i<stds.length; i++) {
			if(index == stds[i].getNum()) {
				std = stds[i];
			}
		}
		return std;
	}
	
	// addStudent 메소드
	// 학생들 정보 받아서
	// 학생 한 명 추가
	// 학생 정보들 리턴
	
	public Student[] addStudent(Student[] stds) {
		int i=0;
		Student[] addStds = new Student[stds.length+1];
		Student std = new Student();
		System.out.println("추가될 학생의 이름을 입력하세요");
		std.setName(sc.next());
		System.out.println(std.getName() + "학생의 번호를 입력하세요");
		std.setNum(sc.nextInt());
		System.out.println(std.getName() + "학생의 국어 점수를 입력하세요");
		std.setKor(sc.nextInt());
		System.out.println(std.getName() + "학생의 영어 점수를 입력하세요");
		std.setEng(sc.nextInt());
		System.out.println(std.getName() + "학생의 수학 점수를 입력하세요");
		std.setMath(sc.nextInt());
		std.setTotal();
		for(i=0; i<stds.length; i++) {
			addStds[i] = stds[i];
		}
		addStds[i] = std;
		return addStds;
	}
	
	// removeStudent 학생들의 정보를 받아서 
	// 삭제하려는 학생의 번호를 입력받아 학생의 번호와 일치하는 학생을 삭제
	// 남은 학생들의 정보를 리턴
	
	public Student[] removeStudent(Student[] stds) {
		boolean check=false; int i=0;
		Student[] delStds = new Student[stds.length-1];
		System.out.println("삭제할 학생의 번호를 입력하세요");
		int num=sc.nextInt();
		for(i=0; i<stds.length; i++) {
			if(num==stds[i].getNum()) {
				check = !check;
				break;
			}
		}
		if(check) {
			int index = 0;
			for(int j=0; j<stds.length; j++) {
				if(j==i) {
					continue;
				}
				delStds[index] = stds[j];
				index++;
			}
			stds = delStds;
		} else {
			System.out.println("해당 번호의 학생이 없습니다.");
		}
		
		return stds;
	}
}