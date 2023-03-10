package com.qa.conditionals;

public class Conditionals {

	static int max = 150;
	static int physics = 1;
	static int chemistry = 60;
	static int biology = 7;
	static int pass = 90;

	public static void main(String[] args) {

		double sum = division(12, 6);

		System.out.println(sum);

//		display();
//
//		percent();

		percentage();
		flowChart();

	}

	public static double division(double a, double b) {
		if (a < b)
			return a / b;
		System.out.println("Sorry");
		return 0;
	}

	public static void display() {
		System.out.println("Physics: " + physics + " / " + max);
		System.out.println("Physics %: " + (physics / max) * (100) / 150);
		System.out.println("Chemistry: " + chemistry + " / " + max);
		System.out.println("Biology: " + biology + " / " + max);
		System.out.println("Total: " + (physics + chemistry + biology) + " / " + (max * 3));
	}

	public static void percent() {
		System.out.println("Percenatge: " + (physics + chemistry + biology) * 100 / 450 + "% ");
	}

	public static void percentage() {

//		function showing percentage in exams 	

		System.out.println("Physics %: " + physics * 100 / 150 + "%");
		System.out.println("Biology %: " + biology * 100 / 150 + "%");
		System.out.println("Chemistry %: " + chemistry * 100 / 150 + "%");

//		if else statement to show if a student has passed an exam

		if (physics < pass)
			System.out.println("Physics %: " + "Fail " + physics * 100 / 150 + "%");
		else
			System.out.println("Physics %: " + "Pass " + physics * 100 / 150 + "%");

//	if else statement to show if students have a pass in all exams 

		if (physics < pass || biology < pass || chemistry < pass)
			System.out.println("Fail ");
		else
			System.out.println("Pass ");

//		if else statement to show students how many exams they passed

		if (physics < pass && biology < pass && chemistry < pass)
			System.out.println("Fail you failed all exams ");
		if (physics >= pass && biology < pass && chemistry < pass)
			System.out.println("Fail you failed two exams ");
		if (physics >= pass && biology >= pass && chemistry < pass)
			System.out.println("Fail you failed one exam ");
		if (physics >= pass && biology >= pass && chemistry > +pass)
			System.out.println("Pass you passed all exams LEGEND  ");

	}

	public static void flowChart(int a, int b, boolean bn) {
		if (bn)
			System.out.println("Sorry");

	}
}
