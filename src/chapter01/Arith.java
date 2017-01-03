package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		// 2개의 int 형 사칙연산 결과는 int
		System.out.println(10/3);
		// 2개의 double 형의 사칙연산 결과는 double
		System.out.println(10./3.);
		// int 형과 double 형의 사칙연산 결과는 double
		System.out.println((double)10/3);
		// 주의
		System.out.println((double)(10/3));
		
		System.out.println(-7 % 3);
		System.out.println(7 % -3);

	} 
	
}
