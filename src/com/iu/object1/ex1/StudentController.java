package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	Scanner sc;
	StudentService stdss;
	StudentView stdv;
	Student[] stds;
	
	public StudentController() {
		sc = new Scanner(System.in);
		stdss = new StudentService();
		stdv = new StudentView();
	}
	
	public void start() { 
		boolean check = true;

		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로그램 종료");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				stds = stdss.makeStudents();
				break;
			case 2:
				stdv.view(stds);
				break;
			case 3:
				Student std = stdss.findStudent(stds);
				if(std == null) {
					stdv.view("해당 번호의 학생이 없습니다.");
				} else {
					stdv.view(std);
				}
				break;
			case 4:
				System.out.println(4);
				break;
			case 5:
				stds = stdss.addStudent(stds);
				break;
			case 6:
				check = !check;
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
		}
		sc.close();
	}
}