package chapter01;

import java.util.* ;

public class DoWhileTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int value = -1; // 첫번째 루프 진입을 위해서 -1로 초기화
		
		while(value != 0) { // 입력 값이 0이 아니면
			System.out.print("숫자입력[0 to Quit] > ");
			value = scanner.nextInt();
			
			sum += value;
			
		}

		System.out.println(sum);
		scanner.close();
	}

}
