package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		Method4 mt4 = new Method4();
		Member m1 = new Member();
		m1.name="iu"; m1.age=30; m1.mail="iu@naver.com";
		
		Member m2 = new Member();
		m2.name="suji"; m2.age=27; m2.mail="suji@gmail.com";
		
		Member m3 = new Member();
		m3.name="choa"; m3.age=33; m3.mail="choa@hanmail.net";
		
//		Member[] mems = {m1,m2,m3};
		Member[] mems = new Member[3];
		mems[0] = m1;
		mems[1] = m2;
		mems[2] = m3;
		
		mt4.info(mems);
		System.out.println(mems.length); //3
	}
}