package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	
	public void start() { 
		boolean check = true;
		Student[] stds=null;
		Scanner sc = new Scanner(System.in);
		StudentService stdsc = new StudentService();
		StudentView stdv = new StudentView();

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
				stds = stdsc.makeStudents();
				break;
			case 2:
				stdv.viewAll(stds);
				break;
			case 3:
				Student std = stdsc.findStudent(stds);
				if(std == null) {
					stdv.viewMessage("해당 번호의 학생이 없습니다.");
				} else {
					stdv.viewOne(std);
				}
				break;
			case 4:
				System.out.println(4);
				break;
			case 5:
				System.out.println(5);
				break;
			case 6:
				System.out.println("종료");
				check = !check;
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
		}
		sc.close();
	}
}