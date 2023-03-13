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
		flowChart(3, 5, true);
		blackJack(20, 1);
		flowChart1(4001);

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

//		if  statement to show students how many exams they passed

		if (physics < pass && biology < pass && chemistry < pass)
			System.out.println("Fail you failed all exams ");
		if (physics >= pass && biology < pass && chemistry < pass)
			System.out.println("Fail you failed two exams ");
		if (physics >= pass && biology >= pass && chemistry < pass)
			System.out.println("Fail you failed one exam ");
		if (physics >= pass && biology >= pass && chemistry > +pass)
			System.out.println("Pass you passed all exams LEGEND  ");

	}

//	FLOW CHART
//	if else statement to change mathematical equation depending on boolean

	public static double flowChart(double a, double b, boolean bn) {

		if (bn)
			System.out.println(a + b);
		else
			System.out.println(a / b);
		return 0;

	}

	public static double flowChart1(double a, boolean b) {
		if (b)
			if (a >= 2000)
				System.out.println("a");
			if (a > 2000 && a < 56000)
				System.out.println("b");
			if (a > 2000 && a < 6000)
				System.out.println("c");
		else   
		if (!b)
				System.out.println("1");
			if (a < 2000)
				System.out.println("2");
			if (a < 100);
				System.out.println("3");
			if (a > 100 && a < 600);
				System.out.println("4");
			if  (a > 500 && a < 600);
				System.out.println("5");
			if (a > 600);
				System.out.println("6");
			if (a < 500 );
				System.out.println("7");
			return 0;
	
		}

//	BLACK JACK

	public static double blackJack(double a, double b) {
		double sum = a + b;
		if (a + b == 21)
			System.out.println("yez");
		else
			System.out.println("NO");
		return sum;

	}
}
