package com.javaex.problem02;

public class Depart extends Employee {

	// 코드작성
	private String depart;

	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public void getInformation() {
		System.out.println("이름 :" + getName() + "  연봉 :" + getSalary() + "  부서 :" + getDepart());
	}

}
