package week1.day2;

public class Operators {

	public static void main(String[] args) {

    //Arithmetic Operators
		int a = 14;
		int b = 7;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("-----");
		
	//Assignment Operators
		a+=7;
		System.out.println(a);
		
		a-=5;
		System.out.println(a);
		
		a*=3;
		System.out.println(a);
		
		a/=8;
		System.out.println(a);
		
		System.out.println("-----");
		
	//Comparison Operators
		int c = 10;
		int d = 20;
		System.out.println(c>d);
		System.out.println(c<d);
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println("-----");
		
	//Logical Operators
		int e = 55;
		int f = 65;
		System.out.println(e<f&&e>f);
		System.out.println(e<f||e>f);
		System.out.println(e==f||e!=f);
		System.out.println("-----");
		
	//Increment & Decrement Operators
		int g = 25;
		System.out.println(g++);
		System.out.println(g);
		System.out.println(++g);
		System.out.println(g--);
		System.out.println(g);
		System.out.println(--g);
		System.out.println("-----");
		
	}

}
