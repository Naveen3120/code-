package practice;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("a: ");
		int a =s.nextInt();
		System.out.println("b: ");
		int b =s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
