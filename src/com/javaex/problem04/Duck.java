package com.javaex.problem04;

public class Duck extends Bird {

	public void sing() {
		System.out.print("오리(" + getName() + ")가 ");
		super.sing();
	}

	public void fly() {
		System.out.println("오리(" + getName() + ")가 날지 않습니다.");
	}

	public void showName() {
		System.out.println("오리의 이름은 " + getName() + " 입니다.");

	}

}
