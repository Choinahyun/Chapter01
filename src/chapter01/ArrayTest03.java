package chapter01;

public class ArrayTest03 {

	public static void main(String[] args) {
		// 배열이 초기화 (리터럴 대입)
		int[] a = {10, 20, 30, 40};
		
//		int[] a = new int[4];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;

		int l = a.length;
		for ( int i=0; i < l; i++){
			System.out.println(a[i]);
		}
		
//		오류
//		int [] c;
//		c = {10, 20, 30, 40};
	}

}
