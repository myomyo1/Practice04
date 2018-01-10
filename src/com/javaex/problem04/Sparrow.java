package com.javaex.problem04;

public class Sparrow extends Bird {

	@Override
	public void sing() {
		System.out.print("참새(" + getName() + ")가 ");
		super.sing();
	}

	public void fly() {
		System.out.println("참새(" + getName() + ")가 날아 다닙니다.");
	}

	public void showName() {
		System.out.println("참새의 이름은 " + getName() + " 입니다.");

	}
	
}
