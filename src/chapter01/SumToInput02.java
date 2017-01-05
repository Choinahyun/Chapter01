package chapter01;


public class SumToInput02 {

	public static void main(String[] args) {
		
		if (args.length == 0){
			System.out.println("usage : java SumToInout2 [num]");
			return;
		}

		System.out.println(args[0]);

		// String -> int
		int num = Integer.parseInt(args[0]);
		
		// int -> String
		int n = 10;
		String s = "" + n;
		String s1 = String.valueOf(n);
		
		int sum = 0;
		for (int i = 1; i <= num; i++){
			sum += i;
		}

		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		

	}

}
