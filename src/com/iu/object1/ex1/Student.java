package com.iu.object1.ex1;

public class Student {
	private String name; 
	private int num; 
	private int kor; 
	private int eng; 
	private int math; 
	private int total; 
	private double avg;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num>0) {			
			this.num = num;
		}
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = 0;
		if(kor>=0 && kor <=100) {
			this.kor = kor;
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = 0;
		if(eng>=0 && eng <=100) {
			this.eng = eng;
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = 0;
		if(math>=0 && math <=100) {
			this.math = math;
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		// this 생략가능
		this.total = this.kor+this.eng+this.math;
		this.setAvg();
	}

	public double getAvg() {
		return avg;
	}

	private void setAvg() {
		this.avg = this.total / 3.0;
	}
}