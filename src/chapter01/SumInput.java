package chapter01;

import java.util.*;

public class SumInput {

	public static void main(String[] args) {

		System.out.print("입력 > ");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++){
			sum += i;
		}

		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
	}

}
