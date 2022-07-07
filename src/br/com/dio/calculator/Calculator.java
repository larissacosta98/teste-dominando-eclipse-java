package br.com.dio.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Type in the first value: ");
		a = scan.nextInt();
		
		System.out.println("Type in the second value: ");
		b = scan.nextInt();
		
		int sum = sum(a, b);
		int subtract = subtract(a, b);
		double divide = divide(a, b);
		int multiply = multiply(a, b);
		
		System.out.println("sum " + sum);
		System.out.println("sub " + subtract);
		System.out.println("div " + divide);
		System.out.println("mult " + multiply);
	}


	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static double divide(int a, int b) {
		return a / b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	
}