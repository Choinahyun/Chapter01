package chapter01;

public class WhileTest {

	public static void main(String[] args) {


		int i = 0;
		int sum = 0;
		while ( i< 10) {
			//System.out.println( i );
			sum = sum + ( i+1);
			i ++;
		}

		System.out.println(sum);
	}

}
