package chapter01;

public class ArrayTest01 {

	public static void main(String[] args) {

		int [] a = new int[4];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		// a[4] = 50; 예외 발생 (ArrayIndeOuntOfBound)

		int sum = 0;
		int length = a.length;
		for (int i=0; i < length; i++){
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		//확장 for문
		for (int value : a){
			System.out.println(value);
		}
		
	}

}
