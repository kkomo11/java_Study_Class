package com.iu.object2;

import java.util.Scanner;

public class Object2Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Method3 mt3 = new Method3();
		Member mem = new Member();
		String name; int age; String mail;
		// 월급 입력
		int salary = 5000000;
		
		mt3.sal(salary);
		System.out.println(salary); // 5000000
		
		mt3.hap(10, 20);
		
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("나이 입력");
		age = sc.nextInt();
		System.out.println("메일 입력");
		mail = sc.next();
		
		mem.name="suji";
		mem.age=30;
		mem.mail = "suji@gmail.com";
		
		mt3.info(name, age, mail);
		mt3.info2(mem);
		System.out.println(mem.age); //100
		sc.close();
	}
}