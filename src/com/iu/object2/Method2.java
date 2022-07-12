package com.iu.object2;

import java.util.Scanner;

public class Method2 {
	//info
	
	public void info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		Method1 mt1 = new Method1();
		mt1.test();
		System.out.println(name);
		
		sc.close();
	}

}