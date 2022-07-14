package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {
		Resume re = new Resume();
		re.name="iu";
		// 생성자는 객체를 만들 때만 사용가능
		Car car1 = new Car();
		Car car2 = new Car("Black");
		Car car3 = new Car("그랜져", "Green");

		car1.info();
		car2.info();
		car3.info();
	}
}