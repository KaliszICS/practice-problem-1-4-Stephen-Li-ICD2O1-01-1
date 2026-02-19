/*
Lesson: Input
Author: Stephen Li
Date Created: February 17, 2026
Date Last Modified: February 17, 2026
*/
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name: ");
		String string = input.nextLine();
		System.out.println(string);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a whole number: ");
		int num = input.nextInt();
		System.out.println(num * 2 + 2);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a radius: ");
		double num = input.nextDouble();
		System.out.println(num * 2 * 3.14);
		System.out.println(num * num * 3.14);
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a first name: ");
		String first = input.nextLine();
		System.out.print("Input a last name: ");
		String last = input.nextLine();
		System.out.print("Input an age: ");
		int age = input.nextInt();
		System.out.println(last + ", " + first + " - " + age);
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a name: ");
		String name = input.nextLine();
		System.out.print("Input an age: ");
		int age = input.nextInt();
		int iq = age;
		System.out.print(name);
		System.out.println(age + 3);
		System.out.println(iq);
	}

}
