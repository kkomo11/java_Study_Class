package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	
	public void start() { 
		boolean check = true;
		Student[] stds=null;
		Scanner sc = new Scanner(System.in);

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
				StudentService stdsc = new StudentService();
				stds = stdsc.makeStudents();
				break;
			case 2:
				StudentView stdv = new StudentView();
				stdv.viewAll(stds);
				break;
			case 3:
				System.out.println(3);
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