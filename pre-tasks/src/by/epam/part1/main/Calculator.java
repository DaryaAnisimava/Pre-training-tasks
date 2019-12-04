package by.epam.part1.main;
import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {
			
	double a;
	double b;
	double r;
	int s;

	System.out.println("Введите первое число a");

	Scanner sc = new Scanner (System.in);

	a = sc.nextInt();

	System.out.println("Введите второе число b");
	b = sc.nextInt();

	System.out.println("Выберите операцию: 1 - сложение, 2- вычитание, 3 - деление, 4 - умножение");
	s = sc.nextInt();


	switch(s) {
		case 1:
		System.out.println("a + b = " + (a + b));
		break;
		
		case 2:
		System.out.println("a - b = " + (a - b));
		break;
		
		case 3:
		r = a / b;
	
		System.out.println(r);
		break;
		
		case 4:
		System.out.println("a * b = " + (a * b));
		break;
		
		default:
	         System.out.println("Неверная операция");
	}
		}
	}

