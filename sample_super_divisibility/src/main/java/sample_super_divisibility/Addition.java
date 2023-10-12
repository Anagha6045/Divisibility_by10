package sample_super_divisibility;

import java.util.Scanner;

public class Addition {
double num1;
double num2;
double sum;
public double addInputValues()
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter number1 : ");
	num1=sc.nextDouble();
	System.out.print("Enter number2 : ");
	num2=sc.nextDouble();
	sum = num1+num2;
	sc.close();
	return sum;
}
}
