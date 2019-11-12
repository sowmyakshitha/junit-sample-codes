package com.training.myapp;

public class StudentMarks {
	private int a;
	private int b;
	private int c;

	StudentMarks std1;
	StudentMarks std2;
	StudentMarks std3;

	public StudentMarks() {
		// TODO Auto-generated constructor stub
	}

	public StudentMarks(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int totalOfEachStudent() {

		int total = a + b + c;
		return total;
	}

	public int avgOfEachStudent() {
		int avg = (a + b + c) / 3;
		return avg;

	}

	public int totalScoredByStudentsInSubjectA() {
		int t1 = std1.getA() + std2.getA() + std3.getA();
		return t1;
	}

	public int totalScoredByStudentsInSubjectB() {
		int t2 = std1.getB() + std2.getB() + std3.getB();
		return t2;
	}

	public int totalScoredByStudentsInSubjectC() {
		int t3 = std1.getC() + std2.getC() + std3.getC();
		return t3;
	}

	public int AvgScoredByStudentsInSubjectA() {
		int avg = this.totalScoredByStudentsInSubjectA() / 3;
		return avg;
	}

	public int AvgScoredByStudentsInSubjectB() {
		int avg = this.totalScoredByStudentsInSubjectB() / 3;
		return avg;
	}

	public int AvgScoredByStudentsInSubjectC() {
		int avg = this.totalScoredByStudentsInSubjectC() / 3;
		return avg;
	}

}
