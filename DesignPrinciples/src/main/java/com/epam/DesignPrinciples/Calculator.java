package com.epam.DesignPrinciples;

import java.util.Scanner;

public class Calculator implements ArithmeticOperations{
	int p,q;
	public void customInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		this.p=sc.nextInt();
		System.out.println("Enter second number: ");
		this.q=sc.nextInt();
		sc.close();
	}
	public int addition() {
		// TODO Auto-generated method stub
		customInput();
		return (this.p+this.q);
		
	}

	public int subtraction() {
		// TODO Auto-generated method stub
		customInput();
		return (this.p-this.q);
	}

	public int multiply() {
		// TODO Auto-generated method stub
		customInput();
		return (this.p*this.q);
	}

	public double divide() {
		// TODO Auto-generated method stub
		customInput();
		if(q==0) {
			System.out.println("Exception raised : Divide by zero");
		}
		double res=(double)p/q;
		return res;
	}

}
