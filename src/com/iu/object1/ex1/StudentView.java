package com.iu.object1.ex1;

public class StudentView {
	// viewAll 메소드
	// 학생들의 정보를 받아서 모든 정보를 출력하는 메소드
	
	public void view(Student[] stds) {
		System.out.println("이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
		for(int i=0; i<stds.length; i++) {
			System.out.println(stds[i].getName()+"\t\t"+stds[i].getNum()+"\t\t"+stds[i].getKor()+"\t\t"
					+ stds[i].getEng() + "\t\t" + stds[i].getMath() + "\t\t" + stds[i].getTotal() + "\t\t"
					+ stds[i].getAvg() + "\t\t");
		}
	}
	
	public void view(Student stds) {
		System.out.println("이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
		System.out.println(stds.getName()+"\t\t"+stds.getNum()+"\t\t"+stds.getKor()+"\t\t"
				+ stds.getEng() + "\t\t" + stds.getMath() + "\t\t" + stds.getTotal() + "\t\t"
				+ stds.getAvg() + "\t\t");
		
	}
	
	public void view(String text) {
		System.out.println(text);
	}
}