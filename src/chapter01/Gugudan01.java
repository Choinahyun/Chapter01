package chapter01;

public class Gugudan01 {
	
	public static void main (String [] args) {
		
		int i = 2;
		while (i <=9 ){
			System.out.println(i + "단  시~~~작!");
			
			int j = 1;
			while ( j <= 9){
				System.out.println(i + " X " + j + " = " + i*j);
				j ++;
			}
			i++;
		}
	}

}
