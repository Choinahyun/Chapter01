package chapter01;

public class LeapYear {

	public static void main(String[] args) {

		int year = 2000;
		
		if (year % 4 == 0){ // 4로 나누어 지고
			if ( year % 100 == 0) { // 100 으로 나누어 지고
				if ( year % 400 == 0){ // 400 으로 나누어 지면
					System.out.println("윤년 입니다.");
				}
				else {
					System.out.println("윤년 아닙니다.");
					}
				}
		}
		else { // 4로 나누어 지지 않으면
			System.out.println("윤년이 아닙니다.");
			}

	}

}
