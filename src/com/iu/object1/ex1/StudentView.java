package com.iu.object1.ex1;

public class StudentView {
	// viewAll 메소드
	// 학생들의 정보를 받아서 모든 정보를 출력하는 메소드
	
	public void view(Student[] stds) {
		System.out.println("이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
		for(int i=0; i<stds.length; i++) {
			System.out.println(stds[i].name+"\t\t"+stds[i].num+"\t\t"+stds[i].kor+"\t\t"
					+ stds[i].eng + "\t\t" + stds[i].math + "\t\t" + stds[i].total + "\t\t"
					+ stds[i].avg + "\t\t");
		}
	}
	
	public void view(Student stds) {
		System.out.println("이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
		System.out.println(stds.name+"\t\t"+stds.num+"\t\t"+stds.kor+"\t\t"
				+ stds.eng + "\t\t" + stds.math + "\t\t" + stds.total + "\t\t"
				+ stds.avg + "\t\t");
		
	}
	
	public void view(String text) {
		System.out.println(text);
	}
}