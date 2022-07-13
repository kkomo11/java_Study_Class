package com.iu.object2;

public class Method4 {
	//info
	// 멤버들의 정보를 출력
	public void info(Member[] mems) {
		System.out.println("이름\t\t나이\t\t이메일\t\t");
		for(int i=0; i<mems.length; i++) {
			System.out.println(mems[i].name+ "\t\t" + mems[i].age + "\t\t" + mems[i].mail);
		}
		mems = new Member[2];
	}
}