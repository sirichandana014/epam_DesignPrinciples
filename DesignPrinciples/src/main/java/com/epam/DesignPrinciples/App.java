package com.epam.DesignPrinciples;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		int choice;

		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		Calculator ob=new Calculator();
		switch(choice)
		{
		case 1:System.out.println("Result is "+ob.addition());
		break;
		case 2:System.out.println("Result is "+ob.subtraction());
		break;
		case 3:System.out.println("Result is "+ob.multiply());
		break;
		case 4:
			double res=ob.divide();
			System.out.println("Result is "+res);
			break;
		default:System.out.println("Enter a valid choice");
		
		
		}
		
		sc.close();
    }
}
