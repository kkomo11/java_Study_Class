package com.iu.object2;

public class Method3 {

	// 메소드명 sal
	public void sal(int salary) {
		System.out.println("월급 계산");
		System.out.println(salary*0.967);
		
		salary=20;
	}
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	//info: 이름, 나이, 이메일주소를 받아서 출력하는 메서드
	public void info(String name, int age, String mail) {
		System.out.println("이름 : " + name + "\t나이 : " + age + "\t\t이메일 : " + mail);
	}
	
	public void info2(Member m) {
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.mail);
		m.age = 100;
	}
}