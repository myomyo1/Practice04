package com.javaex.problem04;

public abstract class Bird {

	private String name;

	public void sing() {
		System.out.println("소리내어 웁니다.");
	}

	public void fly() {

	}

	public void showName() {

	}

	protected String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

}
