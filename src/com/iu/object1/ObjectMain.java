package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		// object 생성
		// 클래스명 변수명 = new 클래스명();
		Monster mons1 = new Monster();
		
		System.out.println(mons1);
		// 멤버변수 접근
		// 변수명.멤버명
		
		mons1.name = "오크"; mons1.hp = 100; mons1.level = 5;
		System.out.println(mons1.name);
		System.out.println(mons1.level);
		System.out.println(mons1.hp);
		
		Monster mons2 = new Monster();
		mons2.name = "오크"; mons2.hp = 100; mons2.level = 5;
		System.out.println(mons2.name);
		System.out.println(mons2.level);
		System.out.println(mons2.hp);
		
		System.out.println(mons1==mons2); // 주소를 표시하기때문에 같지 않음
		
		Weapon sword = new Weapon();
		sword.name = "단검"; sword.damage = 10; sword.inchant = 1;
		
		mons1.weapon = sword;
		
		System.out.println(mons1.weapon.name);
		
//		System.out.println(mons2.weapon.name); nullPointerException
		
		System.out.println("프로그램 종료");
	}

}
